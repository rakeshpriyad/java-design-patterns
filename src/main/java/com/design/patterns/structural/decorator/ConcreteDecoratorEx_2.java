package com.design.patterns.structural.decorator;
/**
 * 
 * @author aayushraj
 *
 */
class ConcreteDecoratorEx_2 extends AbstractDecorator {
	public void doJob() {
		System.out.println("");
		System.out.println("***START Ex-2***");
		super.doJob();
		// Add additional thing if necessary
		System.out.println("Explicitly From DecoratorEx_2");
		System.out.println("***END. EX-2***");
	}
}