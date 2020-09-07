package com.infy.Pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("list")
public class JsonData {

	private int id;
	private String name;
	private Coord  coord;
	private Main main;
	private int dt;
	private Wind wind;
	private Clouds clouds;
	private List<Weather> weather;
	private Rain rain;
	
	public Rain getRain() {
		return rain;
	}
	public void setRain(Rain rain) {
		this.rain = rain;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public int getDt() {
		return dt;
	}
	public void setDt(int dt) {
		this.dt = dt;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	@Override
	public String toString() {
		return "JsonData [id=" + id + ", name=" + name + ", coord=" + coord + ", main=" + main + ", dt=" + dt
				+ ", wind=" + wind + ", clouds=" + clouds + ", weather=" + weather + ", rain=" + rain + "]";
	}
	
	
}
