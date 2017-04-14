package com.design.patterns.command;

public class DeleteCommand implements Command{
	private Receiver receiver;
	
	
	public DeleteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
		System.out.println("DeleteCommand");
	}


	public void execute() {
		receiver.delete();
	}

}
