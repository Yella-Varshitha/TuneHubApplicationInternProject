package com.example.demo1.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.entities.Songs;
import com.example.demo1.repositories.SongsRepository;

@Service

public class SongsServiceImplementation implements SongsService {
	@Autowired
	SongsRepository srepo;

	@Override
	public String addsongs(Songs song) {

		srepo.save(song);
		return "Song is added";

	}

	@Override
	public boolean songExists(String songname) {
		Songs song=srepo.findBySongname(songname);
		if(song==null) {
			return false;
		}
		else {
		return true;
	}
	}
	@Override
		public List<Songs>fetchAllSongs(){
			List<Songs>songslist=srepo.findAll();
			return songslist;
			
		}
	
}
	


