package d_playGame;

import java.util.Vector;

import javax.swing.JLabel;

public class check {
	playGame playGame;
	wordDown wordDown;
	public static boolean boo;
	String q1;
	int q2;
	sound music;
	Vector<String> vector = new Vector<String>();
	Vector<String> vector2 = new Vector<String>();
	
	public void check() {
		q1 = playGame.textField.getText();
		boo = playGame.cloud1.contains(q1);
		
		if(boo == true) {
			q2 = playGame.cloud1.indexOf(q1);
			music.effect(6);
			playGame.total=playGame.total+10;
			playGame.cloud3.elementAt(q2).setVisible(false);
			playGame.cloud3.elementAt(q2).setText("¸ÂÃè¾î¿ä");
			playGame.cloud1.remove(q2);
			playGame.cloud3.remove(q2);
			playGame.score.setText("Score : "+playGame.total);
		} else if(boo == false) {
			music.effect(7);
		}	
	}
}
