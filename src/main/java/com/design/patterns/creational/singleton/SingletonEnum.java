package com.design.patterns.creational.singleton;

public enum SingletonEnum {
	INSTANCE;
	int value;
	public void process(String desc) {
		System.out.println("Value:" + desc + " " + value);
	}
}
