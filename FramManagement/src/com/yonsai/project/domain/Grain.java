package com.yonsai.project.domain;

// 곡물은 농작물이다!
public class Grain extends Crop {

// 도정상태 
	String millingType;

	public Grain(String name, int stock, String millingType) {
		super(name, stock);
		this.millingType = millingType;
	}

}