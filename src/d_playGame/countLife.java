package d_playGame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class countLife {
	
	playGame playGame;
	public static sound music;

	public void countLife(int here) {
		if(here == 2) {
			playGame.heart1.setVisible(false);
		}
		else if(here == 1) {
			playGame.heart2.setVisible(false);
		}
		else if(here == 0) {
			playGame.heart3.setVisible(false);
			playGame.task.cancel();
			music.sound(0);
			music.effect(8);
			playGame.textField.setVisible(false);
			JLabel label = new JLabel("Game Over!");
			label.setFont(new Font("Serif", Font.BOLD, 100));
			label.setForeground(Color.black);
			label.setBounds(80,0,600,300);
			label.setOpaque(false);
			playGame.wordBoard.add(label);
			try {
				Thread.sleep(3000);
				new gameOver();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
