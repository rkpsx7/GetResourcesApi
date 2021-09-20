package com.example.getresourcesapi;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("data")
	private Data data;

	@SerializedName("support")
	private Support support;

	public Data getData(){
		return data;
	}

	public Support getSupport(){
		return support;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"data = '" + data + '\'' + 
			",support = '" + support + '\'' + 
			"}";
		}
}