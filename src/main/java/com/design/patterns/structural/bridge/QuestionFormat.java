package com.design.patterns.structural.bridge;
/**
 * 
 * @author aayushraj
 *
 */
public class QuestionFormat extends QuestionManager {
	public QuestionFormat(String catalog) {
		super(catalog);
	}

	public void displayAll() {
		System.out.println("\n\n---------------------------------------------------------");
		super.displayAll();
		System.out.println("-----------------------------------------------------------");
	}
}