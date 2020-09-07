package com.infy.Pojo;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("rain")
public class Rain {

	
	@JsonProperty("3h")
	private double h;

	public double getH() {
		return this.h;
	}

	public void setH(double h) {
		this.h = h;
	}
	
}
