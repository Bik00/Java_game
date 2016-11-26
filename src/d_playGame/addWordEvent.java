package d_playGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class addWordEvent implements ActionListener {
	private wordFrame memberAdd;

	public addWordEvent(wordFrame object2) {
		memberAdd = object2;
	}
	@Override
	public void actionPerformed(ActionEvent args0) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
			String id = "s1201089";
			String pw = "p1201089";
			Connection conn = DriverManager.getConnection(url, id, pw);

			String string1 = "select max(WORD_NO) from WORDSPACE";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(string1);
			rs.next();
			int value = rs.getInt(1);
			// 새로운 BOOK_ID
			value = value + 1;

		// 3. PreparedStatement 객체 생성
		String sql = "insert into WORDSPACE(WORD_NO, WORDS,TIMES)" + "values(?, ?, SYSDATE)";
		PreparedStatement psmt = conn.prepareStatement(sql);

		
		psmt.setInt(1, value);
		psmt.setString(2, memberAdd.WordIsThis.getText());
		psmt.executeUpdate();

		// 5. 연결 종료

		psmt.close();
		conn.close();
	} catch (Exception ex) {
		}
	new addWordEvent(memberAdd);
	memberAdd.dispose();
	new wordFrame();
	}
}
