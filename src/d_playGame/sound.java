package d_playGame;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class sound {
	private int bgm;
	static Clip clip1, clip2;
	static AudioInputStream ais1, ais2;
	
	public static void effect(int bgm) {
		switch(bgm) {
		case 0:
			try {
				clip2.close();
			} catch (Exception ex) {
			}
			break;
		case 1:
			try {
				ais2 = AudioSystem.getAudioInputStream(new File("../Java_game/sound/select.wav"));
				clip2 = AudioSystem.getClip();
				clip2.stop();
				clip2.open(ais2);
				clip2.start();
				
			} catch (Exception ex) {
			}
			break;
		case 2:
			try {
				ais2 = AudioSystem.getAudioInputStream(new File("../Java_game/sound/ready.wav"));
				clip2 = AudioSystem.getClip();
				clip2.stop();
				clip2.open(ais2);
				clip2.start();
				
			} catch (Exception ex) {
			}
			break;
		case 3:
			try {
				ais2 = AudioSystem.getAudioInputStream(new File("../Java_game/sound/start.wav"));
				clip2 = AudioSystem.getClip();
				clip2.stop();
				clip2.open(ais2);
				clip2.start();
				
			} catch (Exception ex) {
			}
			break;
		case 4:
			try {
				ais2 = AudioSystem.getAudioInputStream(new File("../Java_game/sound/MsgType.wav"));
				clip2 = AudioSystem.getClip();
				clip2.stop();
				clip2.open(ais2);
				clip2.start();
				
			} catch (Exception ex) {
			}
			break;
		case 5:
			try {
				ais2 = AudioSystem.getAudioInputStream(new File("../Java_game/sound/MsgBack.wav"));
				clip2 = AudioSystem.getClip();
				clip2.stop();
				clip2.open(ais2);
				clip2.start();
				
			} catch (Exception ex) {
			}
			break;
		case 6:
			try {
				ais2 = AudioSystem.getAudioInputStream(new File("../Java_game/sound/correct.WAV"));
				clip2 = AudioSystem.getClip();
				clip2.stop();
				clip2.open(ais2);
				clip2.start();
				
			} catch (Exception ex) {
			}
			break;
		case 7:
			try {
				ais2 = AudioSystem.getAudioInputStream(new File("../Java_game/sound/incorrect.wav"));
				clip2 = AudioSystem.getClip();
				clip2.stop();
				clip2.open(ais2);
				clip2.start();
				
			} catch (Exception ex) {
			}
			break;
		case 8:
			try {
				ais2 = AudioSystem.getAudioInputStream(new File("../Java_game/sound/gameover.wav"));
				clip2 = AudioSystem.getClip();
				clip2.stop();
				clip2.open(ais2);
				clip2.start();
				
			} catch (Exception ex) {
			}
			break;
		case 9:
			try {
				ais2 = AudioSystem.getAudioInputStream(new File("../Java_game/sound/button.wav"));
				clip2 = AudioSystem.getClip();
				clip2.stop();
				clip2.open(ais2);
				clip2.start();
				
			} catch (Exception ex) {
			}
			break;
		}
	}
	
	
	public static void sound(int bgm) {
		switch(bgm) {
		case 0:
			try {
				clip1.close();
				
			} catch (Exception ex) {
			}
			break;
		case 1:
			try {
				ais1 = AudioSystem.getAudioInputStream(new File("../Java_game/sound/main.wav"));
				clip1 = AudioSystem.getClip();
				clip1.stop();
				clip1.open(ais1);
				clip1.start();
				
			} catch (Exception ex) {
			}
			break;
		case 2:
			try {
				ais1 = AudioSystem.getAudioInputStream(new File("../Java_game/sound/word.wav"));
				clip1 = AudioSystem.getClip();
				clip1.stop();
				clip1.open(ais1);
				clip1.start();
				
			} catch (Exception ex) {
			}
			break;
		case 3:
			try {
				ais1 = AudioSystem.getAudioInputStream(new File("../Java_game/sound/playGame.wav"));
				clip1 = AudioSystem.getClip();
				clip1.stop();
				clip1.open(ais1);
				clip1.start();
				
			} catch (Exception ex) {
			}
			break;
		case 4:
			try {
				ais1 = AudioSystem.getAudioInputStream(new File("../Java_game/sound/score.wav"));
				clip1 = AudioSystem.getClip();
				clip1.stop();
				clip1.open(ais1);
				clip1.start();
				
			} catch (Exception ex) {
			}
			break;
		}
	}
}
