package com.design.patterns.behavioral.state;

public class PlayingState implements State {
	public void pressPlay(MP3PlayerContext context) {
		System.out.println("Playing state");
		context.setState(new StandbyState());
	}
}