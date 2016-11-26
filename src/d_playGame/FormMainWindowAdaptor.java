package d_playGame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FormMainWindowAdapter extends WindowAdapter {
	
	public static sound music;

	public void windowClosing(WindowEvent e) {
		if(buttonEvent1.i==1) {
			wordFrame.j++;
			buttonEvent1.i--;
		}
		if(buttonEvent2.i==1) {
			scoreFrame.j++;
			buttonEvent2.i--;
		}
		music.sound(0);
		music.sound(1);
	}
}