package com.tzz.designpattern.observable;

public class BoildObserver implements Observer {
	String doSomthing;

	BoildObserver(String doSomthing) {
		this.doSomthing = doSomthing;
	}

	@Override
	public void update(Observable observable) {
		Water water = (Water) observable;
		if (water.getTemperature() >= 100) {
			System.out.println("status：" + water.getStatus());
			System.out.println("BoildObserver:" + doSomthing);
		}

	}
}