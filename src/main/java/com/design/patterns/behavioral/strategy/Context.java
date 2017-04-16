package com.design.patterns.behavioral.strategy;

public class Context {
	Choice choice;

	// Set a Strategy or algorithm in the Context
	public void setChoice(Choice choice) {
		this.choice = choice;
	}

	public void showChoice(String s1, String s2) {
		choice.myChoice(s1, s2);
	}
}