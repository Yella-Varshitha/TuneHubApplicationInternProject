package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo1.entities.Songs;
import com.example.demo1.sevices.SongsService;

import org.springframework.ui.Model;
@Controller
public class SongsController {
	@Autowired
	SongsService songserv;

	@PostMapping("/addsongs")
	public String addSongs( @ModelAttribute Songs song) {

		boolean status = songserv.songExists(song.getSongname());
		if (status == false) {
			songserv.addsongs(song);
			return "songsucess";
		} else {
			return "songsfail";
		}
	}

	@GetMapping("/mapping-viewsongs")
	public String viewSongs(Model model) {
		List<Songs> songslist=songserv.fetchAllSongs();
		model.addAttribute("songslist",songslist);
		return "displaysongs";
		
	}

	@GetMapping("/viewsongs")
	public String ViewCustomerSongs(Model model) {
		boolean primeCustomerStatus = true;
		if (primeCustomerStatus == true) {
			
			List<Songs> songslist = songserv.fetchAllSongs();
		 model.addAttribute("songslist", songslist);
			return "displaysongs";
		} else {
			return "makepayment";

		}
	}

}
