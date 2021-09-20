package com.example.getresourcesapi;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("color")
	private String color;

	@SerializedName("year")
	private int year;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("pantone_value")
	private String pantoneValue;

	public String getColor(){
		return color;
	}

	public int getYear(){
		return year;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getPantoneValue(){
		return pantoneValue;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"color = '" + color + '\'' + 
			",year = '" + year + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",pantone_value = '" + pantoneValue + '\'' + 
			"}";
		}
}