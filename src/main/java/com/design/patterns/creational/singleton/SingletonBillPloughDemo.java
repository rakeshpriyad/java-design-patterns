package com.design.patterns.creational.singleton;

public class SingletonBillPloughDemo {

	public static void main(String[] args) {
		SingletonBillPlough inst1 = SingletonBillPlough.getInstance();
		SingletonBillPlough inst2 = SingletonBillPlough.getInstance();
		SingletonBillPlough inst3 = SingletonBillPlough.getInstance();
		System.out.println(inst1);
		System.out.println(inst2);
		System.out.println(inst3);
	}
}
