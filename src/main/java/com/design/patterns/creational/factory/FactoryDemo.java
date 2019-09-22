package com.design.patterns.creational.factory;

public class FactoryDemo {
	public static void main(String[] args) {
		Number s = ConverterFactoryEnum.find("Integer").get().converter().sum("26","23");
		System.out.println(s.intValue());

		Number s1 = ConverterFactoryEnum.find("Double").get().converter().sum("26.5","26");
		System.out.println(s1.doubleValue());
	}
}
