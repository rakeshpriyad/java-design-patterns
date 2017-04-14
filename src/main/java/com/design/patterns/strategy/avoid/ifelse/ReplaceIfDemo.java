package com.design.patterns.strategy.avoid.ifelse;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ReplaceIfDemo {
	private static Map<MediaPlayerType, IMediaPlayer> strategies = new ConcurrentHashMap<MediaPlayerType, IMediaPlayer>();
	static {
		strategies.put(MediaPlayerType.WMPlayer, new CWindowsMediaPlayer());
		strategies.put(MediaPlayerType.RMPlayer, new CRealMediaPlayer());
		strategies.put(MediaPlayerType.FMPlayer, new CFlashMediaPlayer());
	}

	public void replaceSwitchWithStrategyPattern(MediaPlayerType etype) {
		strategies.get(etype).play();
	}

	public static void main(String[] args) {
		ReplaceIfDemo replaceIfDemo = new ReplaceIfDemo();
		replaceIfDemo.replaceSwitchWithStrategyPattern(MediaPlayerType.WMPlayer);
		replaceIfDemo.replaceSwitchWithStrategyPattern(MediaPlayerType.RMPlayer);
	}
}
