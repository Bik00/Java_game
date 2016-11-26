package d_playGame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class wordFrame extends JFrame{
	static int j=0;
	public static sound music;
	public JTextField WordIsThis;
	public JTable jTable;
	public JTableModel model;

	public JPanel table;
	public JScrollPane scroll;
	String[][] source = null;
	
	public void viewWord() {
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
			
			String string1 = "select * from WORDSPACE order by word_no desc";
			rs = stmt.executeQuery(string1);
	
			int i=0;
			source = new String[rowNum][3];
			while(rs.next()) {
				source[i][0] = rs.getInt("WORD_NO")+"";
				source[i][1] = rs.getString("WORDS")+"";
				source[i][2] = rs.getString("TIMES")+"";
				i++;
			}
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model = new JTableModel();
		model.setData(source);
		jTable = new JTable(model);
		this.getContentPane().add(jTable.getTableHeader());
		table.add(jTable);
		this.getContentPane().add(table);
	
	}

	wordFrame(){
	
		setSize(600, 500);
		setResizable(false);
		
	    ImageIcon wordView = new ImageIcon("../Java_game/image/wordFrame.png");
		JPanel wordBoard = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawImage(wordView.getImage(), 0, 0, null);
                setOpaque(false);//그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
           }
       };
       
       wordBoard.setLayout(null);
 
		table = new JPanel();
		table.setBounds(0, 0, 584, 300);
		
		viewWord();
		scroll = new JScrollPane(table);
		scroll.setBounds(180,0,254,300);
		wordBoard.add(scroll);
		//scroll.setBounds(0,0,160,160);

		setTitle("단어장 보기");

//		model.setValueAt("바뀐값",  0 , 0);
		MyMouseListener listener = new MyMouseListener();
		JLabel whatIsWord = new JLabel("단어 입력 : ");
		whatIsWord.setBounds(113, 309, 64, 15);
		WordIsThis = new JTextField(20);
		WordIsThis.setBounds(182, 306, 226, 21);
		JButton addWord = new JButton("등록");
		addWord.addMouseListener(listener);
		addWordEvent playAdding = new addWordEvent(this);
		addWord.addActionListener(playAdding);
		addWord.setBounds(413, 305, 65, 23);
		
		wordBoard.add(whatIsWord);
		wordBoard.add(WordIsThis);
		wordBoard.add(addWord);
		
		JButton deleteWord = new JButton("삭제");
		deleteWord.addMouseListener(listener);
		deleteWordEvent kkk = new deleteWordEvent(this);
		deleteWord.addActionListener(kkk);
		deleteWord.setBounds(478, 305, 65, 23);
		wordBoard.add(deleteWord);
		
		JButton exitWord = new JButton("나가기");
		exitWord.addMouseListener(listener);
		exitWord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				music.sound(0);
				music.sound(1);
				setVisible(false);
				j++;
				buttonEvent1.i--;
			}
		});
		
		this.addWindowListener(new FormMainWindowAdapter());
		exitWord.setBounds(413, 334, 130, 23);
		wordBoard.add(exitWord);
		
		getContentPane().add(wordBoard);
		setVisible(true);
	}
}
