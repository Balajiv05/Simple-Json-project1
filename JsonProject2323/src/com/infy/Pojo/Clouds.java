package com.infy.Pojo;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("clouds")
public class Clouds {
	private int all;

	public int getAll() {
		return this.all;
	}

	public void setAll(int all) {
		this.all = all;
	}

}
