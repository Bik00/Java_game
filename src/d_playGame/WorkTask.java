package d_playGame;

import java.util.TimerTask;

import javax.swing.JLabel;

public class WorkTask extends TimerTask {
	
	public playGame playGame;
	public static wordDown b;
	@Override
	public void run() {
		playGame.wordBoard.setLayout(null);
		String what = new String("�̰��� �ܾ �����ϴ� ������ ���� ��Ʈ���Դϴ�.");
		b = new wordDown(playGame.cloud2.size());
		playGame.cloud3.addElement(b.lb[playGame.cloud2.size()]);
		b.setSize(700,373);
		b.setBounds(0, 0, 700, 373);
		b.setOpaque(false);
		playGame.wordBoard.add(b);
		
		playGame.cloud1.addElement(b.lb[playGame.cloud2.size()].getText());
		playGame.cloud2.addElement(what);
	}
}