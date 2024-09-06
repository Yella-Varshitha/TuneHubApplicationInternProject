
package com.example.demo1.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Songs {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String songname;
	 String songartist;
	 String genere;
	 String link;
	 @ManyToMany
		List<PlayList>playlist;
	public Songs(int id, String songname, String songartist, String genere, String link, List<PlayList> playlist) {
		super();
		this.id = id;
		this.songname = songname;
		this.songartist = songartist;
		this.genere = genere;
		this.link = link;
		this.playlist = playlist;
	}
	public Songs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	public String getSongartist() {
		return songartist;
	}
	public void setSongartist(String songartist) {
		this.songartist = songartist;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<PlayList> getPlaylist() {
		return playlist;
	}
	public void setPlaylist(List<PlayList> playlist) {
		this.playlist = playlist;
	}
	@Override
	public String toString() {
		return "Songs [id=" + id + ", songname=" + songname + ", songartist=" + songartist + ", genere=" + genere
				+ ", link=" + link + ", playlist=" + playlist + "]";
	}
	
}