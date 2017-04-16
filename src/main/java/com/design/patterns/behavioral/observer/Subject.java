package com.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class Subject implements ISubject {
	List<Observer> observerList = new ArrayList<Observer>();
	private int _flag;

	public int getFlag() {
		return _flag;
	}

	public void setFlag(int _flag) {
		this._flag = _flag;
		// flag value changed .So notify observer(s)
		notifyObservers();
	}

	public void register(Observer o) {
		observerList.add(o);
	}

	public void unregister(Observer o) {
		observerList.remove(o);
	}

	public void notifyObservers() {
		for (int i = 0; i < observerList.size(); i++) {
			observerList.get(i).update();
		}
	}
}