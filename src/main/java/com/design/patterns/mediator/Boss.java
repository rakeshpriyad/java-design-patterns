package com.design.patterns.mediator;

public class Boss extends Friend {

	public Boss(Mediator mediator,String name) {
		super(mediator,name);
	}
	
	public void send(String msg) {
		mediator.send(this, msg);
	}

	public void notify(String msg) {
		System.out.println("Boss see message: " + msg);
		System.out.println("");
	}

}
