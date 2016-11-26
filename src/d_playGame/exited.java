package d_playGame;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class exited extends JFrame implements ActionListener {
	private final JLabel sentence1 = new JLabel("게임이 종료되었습니다.");
	private final JLabel sentence2 = new JLabel("다시 시작하시려면 재실행 해주세요. ^_^");
	private final JLabel sentence3 = new JLabel("과제 : 산성비");
	private final JLabel sentence4 = new JLabel("학번 : 1201089");
	private final JLabel sentence5 = new JLabel("이름 : 구본일");
	private final JPanel panel = new JPanel();

	public exited(){
		super("종료창");
		this.setSize(300,300);
		setResizable(false);
		
		//창닫기 버튼 클릭시 프레임 종료
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		//버튼생성
		JButton btn = new JButton("확인");
		btn.setBounds(45, 239, 194, 23);
		btn.addActionListener(this);
		getContentPane().setLayout(null);
		getContentPane().add(btn);
		sentence1.setBounds(82, 10, 137, 31);
		getContentPane().add(sentence1);
		sentence2.setBounds(29, 40, 253, 31);
		getContentPane().add(sentence2);
		sentence3.setBounds(97, 81, 101, 31);
		getContentPane().add(sentence3);
		sentence4.setBounds(97, 122, 101, 31);
		getContentPane().add(sentence4);
		sentence5.setBounds(97, 163, 101, 31);
		getContentPane().add(sentence5);
		panel.setBounds(57, 70, 29, 31);
		getContentPane().add(panel);

		//창보이기
		this.setVisible(true);
	}

	//오버라이딩
	public void actionPerformed(ActionEvent ae){
		
		System.exit(0);
	}
}

