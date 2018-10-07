package main.java;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Basic {

	private Library library;
	private Song song;
    private long id;
	private String content;
	
	public Library getLibrary() {
		return library;
	}
	
	public Song getSong() {
		return song;
	}

	public Basic(long id, String content) {
        this.id = id;
        this.content = content;
    }
	
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
	
}
