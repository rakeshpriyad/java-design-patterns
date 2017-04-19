package com.design.patterns.behavioral.state;
public class StandbyState implements State {
  public void pressPlay(MP3PlayerContext context) {
	  System.out.println("StandbyState state");
    context.setState(new PlayingState());
  }
}