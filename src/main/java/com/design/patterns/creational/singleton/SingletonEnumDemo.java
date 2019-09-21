package com.design.patterns.creational.singleton;
public class SingletonEnumDemo {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        singleton.process("hello");
    }
}