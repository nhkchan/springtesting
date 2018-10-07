package main.java;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Library {
	
	  @JsonProperty("libraryname")
	  public String name;
	
	  @JsonProperty("mymusic")
	  public String genre;

}
