package com.design.patterns.behavioral.command;

public class UpdateCommand implements Command{
	private Receiver receiver;
	
	public UpdateCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
		System.out.println("UpdateCommand");
	}

	public void execute() {
		receiver.update();
	}

}
