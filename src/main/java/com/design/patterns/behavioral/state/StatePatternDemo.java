package com.design.patterns.behavioral.state;

public class StatePatternDemo {
	public static void main(String[] args) {
		State playingState = new PlayingState();
		
		MP3PlayerContext context = new MP3PlayerContext(playingState);
		context.play();
		context.play();
		
		State standbyState = new StandbyState();
		context = new MP3PlayerContext(standbyState);
		context.play();
		context.play();

	}
}
