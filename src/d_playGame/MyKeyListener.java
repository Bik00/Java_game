package d_playGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {
	sound music;
	check check = new check();
	public static int keycode;
	public static KeyEvent e;
	@Override
	public void keyPressed(KeyEvent e) {

		keycode = e.getKeyCode();
		switch(keycode) {
			case KeyEvent.VK_ENTER : check.check(); playGame.textField.setText(""); break;
			case KeyEvent.VK_BACK_SPACE : music.effect(5); break;
			default : music.effect(4); break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
