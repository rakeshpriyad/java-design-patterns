package com.design.patterns.creational.factory;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public enum ConverterFactoryEnum {

	INTEGER("Integer") {
		@Override
		public Converter<Integer> converter() {
			return new IntegerConverter();
		}
	},
	DOUBLE("Double") {
		@Override
		public Converter<Double> converter() {
			return new DoubleConverter();
		}
	};

	private static class Holder {
		static ConcurrentMap<String, ConverterFactoryEnum> ENUM_MAP = new ConcurrentHashMap<>();
	}

	private ConverterFactoryEnum(String description) {
		Holder.ENUM_MAP.put(description, this);
	}

	public abstract Converter<? extends Number> converter();

	public static Optional<ConverterFactoryEnum> find(String description) {
		return Optional.ofNullable(Holder.ENUM_MAP.get(description));
	}
}
