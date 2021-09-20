package com.example.getresourcesapi;

import com.google.gson.annotations.SerializedName;

public class Support{

	@SerializedName("text")
	private String text;

	@SerializedName("url")
	private String url;

	public String getText(){
		return text;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"Support{" + 
			"text = '" + text + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}