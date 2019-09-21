package com.design.patterns.creational.singleton;

public class SingletonBillPlough {

	private SingletonBillPlough() {
	}

	private static class StaticHolder {
		private static SingletonBillPlough INSTANCE = new SingletonBillPlough();
	}

	public static SingletonBillPlough getInstance() {
		return StaticHolder.INSTANCE;
	}
}
