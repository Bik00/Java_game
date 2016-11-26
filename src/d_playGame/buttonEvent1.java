package d_playGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class buttonEvent1 implements ActionListener {
	private intro wordButton;
	public static int i=0;
	private buttonEvent2 event2;

	public buttonEvent1(intro object1) {
		wordButton = object1;
	}
	
	public void actionPerformed(ActionEvent args0) {
		wordButton.music.effect(9);
		if(wordFrame.j==1) {
			--wordFrame.j;
		}
		try {
			if(event2.i==1) {
				throw new DoubleClick();
			}
			if(i==1) {
				throw new DoubleClick();
			}
			else {
				new wordFrame();
				wordButton.music.sound(0);
				wordButton.music.sound(2);
				i++;
			}
		} catch(DoubleClick e) {
		  }
	}

}