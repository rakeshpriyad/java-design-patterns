package com.design.patterns.behavioral.visitor;

public class Visitor implements IVisitor {
	public void visit(MyClass myClassElement) {
		System.out.println("Visitor is trying to change the integer value");
		myClassElement.setMyInt(100);
		System.out.println("Exiting from Visitor- visit");
	}
}