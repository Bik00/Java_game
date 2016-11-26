package d_playGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class buttonEvent2 implements ActionListener {
	private intro scoreButton;
	public static int i=0;
	private buttonEvent1 event1;

	public buttonEvent2(intro object1) {
		scoreButton = object1;
	}
	
	public void actionPerformed(ActionEvent args0) {
		scoreButton.music.effect(9);
		if(scoreFrame.j==1) {
			--scoreFrame.j;
		}
		try {
			if(event1.i==1) {
				throw new DoubleClick();	
			}
			if(i==1) {
				throw new DoubleClick();
			}
			else {
				new scoreFrame();
				scoreButton.music.sound(0);
				scoreButton.music.sound(4);
				i++;
			}
		} catch(DoubleClick e) {
		  }
	}

}