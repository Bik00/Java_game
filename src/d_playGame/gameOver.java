package d_playGame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class gameOver extends JFrame {

	private JPanel contentPane;
	private final JLabel sentence = new JLabel("사용자 이름을 입력하세요");
	public JTextField textField = new JTextField();
	private final JButton button = new JButton("확인");
	private gameOver Over;
	private sound music;
	
	public gameOver(gameOver object) {
		Over = object;
	}

	public gameOver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		sentence.setBounds(70, 10, 213, 33);
		contentPane.add(sentence);
		textField.setBounds(41, 53, 213, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		button.setBounds(51, 96, 192, 31);
		
		MyMouseListener listener = new MyMouseListener();
		button.addMouseListener(listener);
		
		addUserEvent kkk = new addUserEvent(this);
		button.addActionListener(kkk);
		contentPane.add(button);
	}
}
