package com.design.patterns.mediator;

/**
 * 
 * @author aayushraj
 *
 */
public class FriendAlok extends Friend {

	public FriendAlok(Mediator mediator,String name) {
		super(mediator,name);
	}

	public void send(String msg) {
		mediator.send(this, msg);
	}

	public void notify(String msg) {
		System.out.println("Alok gets message: " + msg);
	}
}
