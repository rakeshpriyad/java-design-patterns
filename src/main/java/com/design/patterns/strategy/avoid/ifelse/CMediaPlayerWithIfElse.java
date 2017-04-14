package com.design.patterns.strategy.avoid.ifelse;

public class CMediaPlayerWithIfElse {
	public static void playWMFile() {
		System.out.println("Play WM file");
	}

	public static void playRMFile() {
		System.out.println("Play RM file");
	}

	public static void playFMFile() {
		System.out.println("Play FM file");
	}

	public void playFileBasedOnExtension() {

		// .WMV file
		MediaPlayerTypeWithIfElse etype = MediaPlayerTypeWithIfElse.RMPlayer;

		switch (etype) {
		case WMPlayer:
			CMediaPlayerWithIfElse.playWMFile();
			break;
		case RMPlayer:
			CMediaPlayerWithIfElse.playRMFile();
			break;
		case FMPlayer:
			CMediaPlayerWithIfElse.playFMFile();
			break;
		}
	}
	
	public static void main(String[] args) {
		CMediaPlayerWithIfElse p= new CMediaPlayerWithIfElse();
		p.playFileBasedOnExtension();
	}
}