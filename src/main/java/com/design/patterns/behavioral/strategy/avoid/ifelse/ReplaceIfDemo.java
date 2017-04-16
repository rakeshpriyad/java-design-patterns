package com.design.patterns.behavioral.strategy.avoid.ifelse;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ReplaceIfDemo {
	private static Map<MediaPlayerType, IMediaPlayer> strategies = new ConcurrentHashMap<MediaPlayerType, IMediaPlayer>();
	static {
		strategies.put(MediaPlayerType.WMPlayer, new CWindowsMediaPlayer());
		strategies.put(MediaPlayerType.RMPlayer, new CRealMediaPlayer());
		strategies.put(MediaPlayerType.FMPlayer, new CFlashMediaPlayer());
	}
	
	public static IMediaPlayer getMediaPlayer(MediaPlayerType etype){
		return strategies.get(etype);
	}

	public static void main(String[] args) {
		Context context = new Context();
		context.setMediaPlayer(getMediaPlayer(MediaPlayerType.WMPlayer));
		context.play();
		context.setMediaPlayer(getMediaPlayer(MediaPlayerType.RMPlayer));
		context.play();
	}
}
