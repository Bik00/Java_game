package d_playGame;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Timer;
import java.util.Vector;

public class playGame extends JPanel {
	public static Timer timer;
	public CountDown a;
	public static WorkTask task = new WorkTask();
	public static int total;
	public static int live=3;
	public static JLabel heart1, heart2, heart3;
	public static JLabel score;
	public static Vector<String> cloud1 = new Vector<String>();
	public static Vector<String> cloud2 = new Vector<String>();
	public static Vector<JLabel> cloud3 = new Vector<JLabel>();
	
	static ImageIcon wordView = new ImageIcon("../Java_game/image/wordView.png");
	public static JPanel wordBoard = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(wordView.getImage(), 0, 0, null);
			setOpaque(false);// 그림을 표시하게 설정,투명하게 조절
			super.paintComponent(g);
		}
	};
	private final JPanel lifeBar = new JPanel();

	static ImageIcon playView = new ImageIcon("../Java_game/image/playView.png");
	public static JPanel playBoard = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(playView.getImage(), 0, 0, null);
			setOpaque(false);// 그림을 표시하게 설정,투명하게 조절
			super.paintComponent(g);
		}
	};
	public static JTextField textField;
	public static sound music;

	public playGame() {
		setVisible(true);
		setLayout(null);
		wordBoard.setBounds(0, 0, 700, 373);
		add(wordBoard);
		lifeBar.setBackground(Color.BLACK);
		lifeBar.setBounds(0, 374, 700, 10);
		add(lifeBar);
		playBoard.setBounds(0, 384, 700, 116);
		add(playBoard);
		playBoard.setLayout(null);

		MyKeyListener keyListener = new MyKeyListener();

		
		textField = new JTextField();
		textField.addKeyListener(keyListener);
		textField.setBounds(213, 20, 195, 30);		
		playBoard.add(textField);
		textField.setColumns(10);
		
		JLabel life = new JLabel("Life : ");
		life.setFont(new Font("Serif", Font.ITALIC, 24));
		life.setBounds(460,20,60,30);
		playBoard.add(life);
		
		score = new JLabel("Score : "+total);
		score.setFont(new Font("Serif", Font.ITALIC, 24));
		score.setBounds(20,20,180,30);
		playBoard.add(score);
		
		
		ImageIcon heartView = new ImageIcon("../Java_game/image/heart.png"); 
		heart1 = new JLabel("", heartView, JLabel.CENTER);
		heart1.setBounds(510,20,60,30);
		heart1.setVerticalTextPosition(JLabel.CENTER);
		heart1.setHorizontalTextPosition(JLabel.CENTER);
		playBoard.add(heart1);
		
		heart2 = new JLabel("", heartView, JLabel.CENTER);
		heart2.setBounds(550,20,60,30);
		heart2.setVerticalTextPosition(JLabel.CENTER);
		heart2.setHorizontalTextPosition(JLabel.CENTER);
		playBoard.add(heart2);
		
		heart3 = new JLabel("", heartView, JLabel.CENTER);
		heart3.setBounds(590,20,60,30);
		heart3.setVerticalTextPosition(JLabel.CENTER);
		heart3.setHorizontalTextPosition(JLabel.CENTER);
		playBoard.add(heart3);

		a = new CountDown();
		a.setOpaque(false);
		wordBoard.add(a);
	
		timer = new Timer();
		timer.schedule(task, 6000 , 2000);
	}
}