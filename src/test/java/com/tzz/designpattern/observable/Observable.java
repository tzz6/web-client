package com.tzz.designpattern.observable;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

	protected boolean isChanaged;
	protected List<Observer> observers = new ArrayList<Observer>();

	public Observable() {
		isChanaged = false;
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void removeObservers() {
		observers.clear();
	}

	public void notifyObservers() {
		if (isChanaged) {
			for (int i = 0; i < observers.size(); i++) {
				observers.get(i).update(this);
			}
			isChanaged = false;
		}
	}
}
