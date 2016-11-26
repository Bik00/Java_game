package d_playGame;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
 
class MyMouseListener implements MouseListener {
	public static sound music;
	
	@Override
	public void mouseEntered(MouseEvent e) {
		music.effect(1);
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}
}