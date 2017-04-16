package com.design.patterns.structural.decorator;

/**
 * 
 * @author aayushraj
 *
 */
public class ConcreteDecoratorEx_1 extends AbstractDecorator {
	public void doJob() {
		super.doJob();
		// Add additional thing if necessary
		System.out.println("I am explicitly from Ex_1");
	}
}