package com.design.patterns.command;

public class Invoker {
	public void invoke(Command command){
		command.execute();
	}
}
