package com.tzz.designpattern.observable;

public class TemperatureObserver implements Observer {
	@Override
	public void update(Observable observable) {
		Water water = (Water) observable;
		System.out.println(water.getTemperature() + "--------" + water.getStatus());
		System.out.println("TemperatureObserver observing...");
	}
}
