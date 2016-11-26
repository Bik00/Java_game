package d_playGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class wordDown extends JPanel implements Runnable {
	public ImageIcon image1;
	public static Vector<String> array = new Vector<String>();
	public JLabel[] lb = new JLabel[99999];
	private int random1 = (int)(Math.random()*6);
	private int random2;
	public static String what;
	private int width = random1*100;
	public Thread th;
	private int y=0;
	private int i = 0;
	public playGame playGame;
	public countLife countLife;

	
	public wordDown(int x) {
		i=x;
			image1 = new ImageIcon("../Java_game/image/word.png"); 
			setLayout(null);
			lookWord();
			random2 = (int) (Math.random() * array.size());
			what = array.elementAt(random2);
			lb[x] = new JLabel(what, image1, JLabel.CENTER);
			lb[x].setBounds(width,-85,185,85);
        	lb[x].setVerticalTextPosition(JLabel.CENTER);
			lb[x].setHorizontalTextPosition(JLabel.CENTER);
			add(lb[x]);
        	setVisible(true);
        	setSize(700,373);
        th = new Thread(this);
        th.start(); 
	}
	
	public void lookWord() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
			String id = "s1201089";
			String pw = "p1201089";
			Connection conn = DriverManager.getConnection(url, id, pw);
	
			String string2 = "select count(*) from WORDSPACE";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(string2);
			rs.next();
			int rowNum = rs.getInt(1);
			
			String string1 = "select WORDS from WORDSPACE";
			rs = stmt.executeQuery(string1);
	
			while(rs.next()) {
				array.addElement(rs.getString("WORDS"));
			}
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	


	@Override
	public void run() {
		while (lb[i].getText() != "¸ÂÃè¾î¿ä") {
			++y;
			lb[i].setBounds(width,y-85,185,85);
			try {
				th.sleep(20);
			} catch (InterruptedException ex) {
			}
			if(y>373) {
				removeAll();
				repaint();
				playGame.live--;
				countLife = new countLife();
				countLife.countLife(playGame.live);
				break;
			}
		}
	}
}
