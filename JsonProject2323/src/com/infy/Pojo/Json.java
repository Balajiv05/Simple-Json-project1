package com.infy.Pojo;

import java.util.List;

public class Json  {
	 private String cod;
	 private double calctime;
	 private int cnt;
	 private List<JsonData> list;
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public double getCalctime() {
		return calctime;
	}
	public void setCalctime(double calctime) {
		this.calctime = calctime;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public List<JsonData> getList() {
		return list;
	}
	public void setList(List<JsonData> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Json [cod=" + cod + ", calctime=" + calctime + ", cnt=" + cnt + ", list=" + list + "]";
	}
	 

	}