package com.design.patterns.behavioral.mediator;

import java.util.List;

public class ConcreteMediator extends Mediator {
	private List<Friend> friends;
	private Boss boss;

	public List<Friend> getFriends() {
		return friends;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}

	public Boss getBoss() {
		return boss;
	}

	public void setBoss(Boss boss) {
		this.boss = boss;
	}


	@Override
	public void send(Friend friend, String msg) {
		for (Friend f : friends) {
			if (!f.getName().equals(friend.getName())) {
				f.notify(msg);
			}
		}
		if(!friend.getName().equals(boss.getName())){
			boss.notify(msg);
		}
	}

}
