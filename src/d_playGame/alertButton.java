package d_playGame;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class alertButton extends JFrame implements ActionListener {

	public alertButton(){
		super("���â");
		this.setLayout(new BorderLayout());
		this.setSize(200,150);
		setResizable(false);
		
		//â�ݱ� ��ư Ŭ���� ������ ����
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		//��ư����
		JButton btn = new JButton("Ȯ��");
		btn.addActionListener(this);

		//�����ӿ� �߰�
		this.add("Center",new JLabel("�ι� �̻� Ŭ���ϼ̽��ϴ�!",JLabel.CENTER));
		this.add("South",btn);

		//â���̱�
		this.setVisible(true);
	}

	//�������̵�
	public void actionPerformed(ActionEvent ae){
		
		this.setVisible(false);
		this.dispose();
	}
}

