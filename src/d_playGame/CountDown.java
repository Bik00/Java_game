package d_playGame;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

class CountDown extends JPanel {
	public JLabel label;
	public static sound music;
	public playGame finish;
	public MyThread a;

	class MyThread extends Thread {

		@Override
		public void run() {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for (int i = 0; i < 3; i++) {
				label.setText((3 - i) + "");
				music.effect(2);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			music.effect(3);
			label.setText("Start");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setVisible(false);
			music.sound(3);
		}
	}

	// »ý¼ºÀÚ
	public CountDown() {
		setVisible(true);
		label = new JLabel("Ready");
		label.setForeground(Color.black);
		label.setFont(new Font("Serif", Font.BOLD, 150));
		label.setOpaque(false);
		this.add(label);

		 a = new MyThread();
		 a.start();
//		(new MyThread()).start();


	}
}