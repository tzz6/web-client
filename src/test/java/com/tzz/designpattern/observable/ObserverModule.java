package com.tzz.designpattern.observable;

public class ObserverModule {

	public static void main(String args[]) {
		TemperatureObserver temperatureObserver = new TemperatureObserver();
		BoildObserver boildObserver1 = new BoildObserver("关闭电源...");
		BoildObserver boildObserver2 = new BoildObserver("继续保湿...");
		Water water = new Water(temperatureObserver);
		water.addObserver(boildObserver1);
		water.addObserver(boildObserver2);
		water.change(45);
		water.change(80);
		water.change(100);
	}
}
