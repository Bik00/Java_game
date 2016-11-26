package d_playGame;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class intro extends JFrame {
	private JButton playButton1;
	private JButton playButton2;
	private JButton playButton3;
	private JButton playButton4;
	public static sound music;
	public static playGame playGame;
	public static JPanel panel;
    
	// 생성자
	public intro() {
		setTitle("메인 화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 500);
		setResizable(false);
		music.sound(1);
	    ImageIcon mainView = new ImageIcon("../Java_game/image/intro.png");
		panel = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawImage(mainView.getImage(), 0, 0, null);
                setOpaque(false);//그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
           }
       };
		panel.setLayout(null);
		
		playButton1 = new JButton("게임 시작하기");
		playButton1.setBounds(275,275,150,40);
		MyMouseListener listener = new MyMouseListener();
		playButton1.addMouseListener(listener);
		
		
		playButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(buttonEvent1.i==0&&buttonEvent2.i==0) {
						music.effect(9);
						music.sound(0);
						panel.setVisible(false);
						playGame = new playGame();
						add(playGame);		
					} else {
						throw new DoubleClick();
					}
				} catch(DoubleClick ex) {
				}
			}
		});
		
		panel.add(playButton1);
		playButton2 = new JButton("단어장 보기");
		playButton2.setBounds(275,315,150,40);
		playButton2.addMouseListener(listener);
		panel.add(playButton2);
		playButton3 = new JButton("점수&순위 보기");
		playButton3.setBounds(275,355,150,40);
		playButton3.addMouseListener(listener);
		panel.add(playButton3);
		playButton4 = new JButton("종료하기");
		playButton4.setBounds(275,395,150,40);
		playButton4.addMouseListener(listener);
		
		buttonEvent1 wordButton = new buttonEvent1(this);
		playButton2.addActionListener(wordButton);
		
		buttonEvent2 socreButton = new buttonEvent2(this);
		playButton3.addActionListener(socreButton);
		
		playButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				music.effect(9);
				System.exit(0);
			}
		});
		panel.add(playButton4);
		this.add(panel);
		setVisible(true);
	}
}