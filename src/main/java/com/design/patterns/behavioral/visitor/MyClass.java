package com.design.patterns.behavioral.visitor;

public class MyClass implements IOriginalInterface {
	// Initial or default value
	private int myInt = 5;

	public int getMyInt() {
		return myInt;
	}

	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}

	public void accept(IVisitor visitor) {
		System.out.println("Initial value of the integer :" + myInt);
		visitor.visit(this);
		System.out.println("\nValue of the integer now :" + myInt);
	}
}