package com.design.patterns.behavioral.mediator;
/**
 * 
 * @author aayushraj
 *
 */
public abstract class Friend {

	protected Mediator mediator;
	private String name;

	public Friend(Mediator mediator,String name) {
		super();
		this.mediator = mediator;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void notify(String msg) {
		//default
	}

}
