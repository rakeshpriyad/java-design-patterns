package com.design.patterns.behavioral.command;

public class SaveCommand implements Command{
	private Receiver receiver;
	
	public SaveCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
		System.out.println("SaveCommands");
	}

	public void execute() {
		receiver.save();
	}

}
