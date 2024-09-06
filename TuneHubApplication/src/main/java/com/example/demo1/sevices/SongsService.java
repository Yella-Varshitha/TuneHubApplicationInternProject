package com.example.demo1.sevices;

import java.util.List;

import com.example.demo1.entities.Songs;
import com.example.demo1.entities.Users;

public interface SongsService {
	public String addsongs(Songs song);
	public  boolean songExists(String songname);
public List<Songs> fetchAllSongs();
	
}
