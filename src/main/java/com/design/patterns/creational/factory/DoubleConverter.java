package com.design.patterns.creational.factory;

public class DoubleConverter implements Converter<Double> {
	@Override
	public Double convert(String value) {
		return Double.valueOf(value);
	}
	
	@Override
	public Double sum(String val1, String val2) {
		return this.convert(val1) + this.convert(val2);
	}
}
