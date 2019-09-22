package com.design.patterns.creational.factory;

public interface Converter<T extends Number> {
	public T convert(String value);
	public T sum(String val1, String val2);
}
