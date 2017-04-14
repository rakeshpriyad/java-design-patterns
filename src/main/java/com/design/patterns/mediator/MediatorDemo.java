package com.design.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorDemo {
	public static void main(String[] args) {
		System.out.println("***Mediator Pattern Demo***\n");
		ConcreteMediator m = new ConcreteMediator();
		FriendAlok alok = new FriendAlok(m, "Alok");
		FriendRajesh rajesh = new FriendRajesh(m, "Rajesh");
		Boss boss = new Boss(m, "Boss");

		List<Friend> friends = new ArrayList<Friend>();
		friends.add(rajesh);
		friends.add(alok);
		m.setFriends(friends);
		m.setBoss(boss);
		
		alok.send("[Alok here]Good Morrning. Can we discuss the mediator pattern?");
		rajesh.send("[Rajesh here]Good Morning.Yes, we can discuss now.");
		boss.send("\n[Boss here]:Please get back to work quickly");
	}
}
