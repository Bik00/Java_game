package d_playGame;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class exited extends JFrame implements ActionListener {
	private final JLabel sentence1 = new JLabel("������ ����Ǿ����ϴ�.");
	private final JLabel sentence2 = new JLabel("�ٽ� �����Ͻ÷��� ����� ���ּ���. ^_^");
	private final JLabel sentence3 = new JLabel("���� : �꼺��");
	private final JLabel sentence4 = new JLabel("�й� : 1201089");
	private final JLabel sentence5 = new JLabel("�̸� : ������");
	private final JPanel panel = new JPanel();

	public exited(){
		super("����â");
		this.setSize(300,300);
		setResizable(false);
		
		//â�ݱ� ��ư Ŭ���� ������ ����
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		//��ư����
		JButton btn = new JButton("Ȯ��");
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

		//â���̱�
		this.setVisible(true);
	}

	//�������̵�
	public void actionPerformed(ActionEvent ae){
		
		System.exit(0);
	}
}

