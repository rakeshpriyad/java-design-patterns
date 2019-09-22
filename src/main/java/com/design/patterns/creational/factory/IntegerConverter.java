package com.design.patterns.creational.factory;

public class IntegerConverter implements Converter<Integer> {

	@Override
	public Integer convert(String value) {
		return Integer.valueOf(value);
	}

	@Override
	public Integer sum(String val1, String val2) {
		return this.convert(val1) + this.convert(val2);
	}

}
