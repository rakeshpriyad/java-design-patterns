package com.design.patterns.mediator;

/**
 * 
 * @author aayushraj
 *
 */
public class FriendRajesh extends Friend {

	public FriendRajesh(Mediator mediator,String name) {
		super(mediator,name);
	}

	public void send(String msg) {
		mediator.send(this, msg);
	}

	public void notify(String msg) {
		System.out.println("Rajesh gets message: " + msg);
	}
}
