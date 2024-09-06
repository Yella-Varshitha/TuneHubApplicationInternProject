package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo1.entities.PlayList;
import com.example.demo1.entities.Songs;
import com.example.demo1.sevices.PlayListService;
import com.example.demo1.sevices.SongsService;

@Controller
public class PlayListController {
@Autowired
PlayListService pserv;
@Autowired
SongsService sserv;
@GetMapping("/createplaylist")
public String createPlayList(Model model) {

	List<Songs>songslist=sserv.fetchAllSongs();
	//Adding the songs in the model
	model.addAttribute("songslist", songslist);
	//sending createplaylist
	return "createplaylist";
}
@PostMapping("/addplaylist")
public String addPlaylist(@ModelAttribute PlayList playlist) {
return "playlistsucess";
}
}
