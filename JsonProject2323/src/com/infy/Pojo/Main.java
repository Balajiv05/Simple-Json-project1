package com.infy.Pojo;

public class Main {
	
	private double temp;
	private double Temp_min;
	private double temp_max;
	private double pressure;
	private double sea_level;
	private double grnd_level;
	private int humidity;
	
	
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}
	public double getTemp_min() {
		return this.Temp_min;
	}
	public void setTemp_min(double temp_min) {
		Temp_min = temp_min;
	}
	
	public double getPressure() {
		return this.pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getSea_level() {
		return this.sea_level;
	}
	public void setSea_level(double sea_level) {
		this.sea_level = sea_level;
	}
	public double getGrnd_level() {
		return this.grnd_level;
	}
	public void setGrnd_level(double grnd_level) {
		this.grnd_level = grnd_level;
	}
	public int getHumidity() {
		return this.humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	

}
