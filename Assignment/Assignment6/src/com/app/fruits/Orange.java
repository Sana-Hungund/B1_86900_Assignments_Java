package com.app.fruits;

public class Orange extends Fruits{

	public Orange(String color, double weight, String name) {
		super(color, weight, name);
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sour";
	}
	
	

}
