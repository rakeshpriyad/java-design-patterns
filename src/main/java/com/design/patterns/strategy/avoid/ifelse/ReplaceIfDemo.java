package com.design.patterns.strategy.avoid.ifelse;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ReplaceIfDemo {

	public void replaceSwitchWithStrategyPattern() {
		Map<MediaPlayerType, IMediaPlayer> strategies = new ConcurrentHashMap<MediaPlayerType, IMediaPlayer>();

		IMediaPlayer pWMPlyer = new CWindowsMediaPlayer();
		strategies.put(MediaPlayerType.WMPlayer, pWMPlyer);

		IMediaPlayer pRMPlyer = new CRealMediaPlayer();
		strategies.put(MediaPlayerType.RMPlayer, pRMPlyer);

		IMediaPlayer pFMPlyer = new CFlashMediaPlayer();
		strategies.put(MediaPlayerType.FMPlayer, pFMPlyer);

		/////// Change the player based on media file extension
		MediaPlayerType etype = MediaPlayerType.WMPlayer; // .WMV file
		MediaPlayerType etype1 = MediaPlayerType.RMPlayer; // .WMV file
		/*for (Map.Entry<MediaPlayerType, IMediaPlayer> entry : strategies.entrySet()) {
			if (entry.getKey().equals(etype)) {
				IMediaPlayer player = entry.getValue();
				player.play();
			}
		}*/
		
		strategies.get(etype).play();
		strategies.get(etype1).play();
		
		
	}
	
	public static void main(String[] args) {
		ReplaceIfDemo replaceIfDemo = new ReplaceIfDemo();
		replaceIfDemo.replaceSwitchWithStrategyPattern();
	}
}
