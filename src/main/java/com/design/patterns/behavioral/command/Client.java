package com.design.patterns.behavioral.command;

public class Client {
	private static Receiver receiver;
	private static Invoker invoker;
	
	static {
		receiver = new Receiver();
		invoker = new  Invoker();		
	}
	public Client(){

	}
	public static void save(){
		Command command = new SaveCommand(receiver);
		invoker.invoke(command);
	}
	
	public static void update(){
		Command command = new UpdateCommand(receiver);
		invoker.invoke(command);
	}
	
	public static void delete(){
		Command command = new DeleteCommand(receiver);
		invoker.invoke(command);
	}

}
