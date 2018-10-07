package main.java;

public class Song {
	
	private String artistName;
	private String songName;
	
	public Song(String a, String s) {
		this.artistName=a;
		this.songName=s;
	}
	
	public String getSongName() {
		return this.songName;
	}
	public String getArtistName() {
		return this.artistName;
	}
}