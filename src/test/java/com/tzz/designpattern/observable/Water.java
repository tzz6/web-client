package com.tzz.designpattern.observable;

public class Water extends Observable {
	private double temperature;
	private String status;

	public Water() {
		super();
		this.temperature = 0;
		this.status = "冷水";
	}

	public Water(Observer observer) {
		this();
		observers.add(observer);
	}

	public double getTemperature() {
		return temperature;
	}

	public String getStatus() {
		return status;
	}

	public void change(double temperature) {
		this.temperature = temperature;
		if (temperature < 40) {
			status = "冷水";
		} else if (temperature >= 40 && temperature < 60) {
			status = "温水";
		} else if (temperature >= 60 && temperature < 100) {
			status = "热水";
		} else {
			status = "开水";
		}
		this.isChanaged = true;
		notifyObservers();
	}
}
