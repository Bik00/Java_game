package d_playGame;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class alertButton extends JFrame implements ActionListener {

	public alertButton(){
		super("경고창");
		this.setLayout(new BorderLayout());
		this.setSize(200,150);
		setResizable(false);
		
		//창닫기 버튼 클릭시 프레임 종료
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		//버튼생성
		JButton btn = new JButton("확인");
		btn.addActionListener(this);

		//프레임에 추가
		this.add("Center",new JLabel("두번 이상 클릭하셨습니다!",JLabel.CENTER));
		this.add("South",btn);

		//창보이기
		this.setVisible(true);
	}

	//오버라이딩
	public void actionPerformed(ActionEvent ae){
		
		this.setVisible(false);
		this.dispose();
	}
}

