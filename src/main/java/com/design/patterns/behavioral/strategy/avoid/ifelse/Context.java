package com.design.patterns.behavioral.strategy.avoid.ifelse;

public class Context {
	IMediaPlayer mediaPlayer;

	// Set a Strategy or algorithm in the Context
	public void setMediaPlayer(IMediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	public void play() {
		mediaPlayer.play();
	}
}