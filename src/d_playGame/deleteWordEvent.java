package d_playGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class deleteWordEvent implements ActionListener {
	private wordFrame memberDelete;
	
	public deleteWordEvent(wordFrame object2) {
		memberDelete = object2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
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
		String sql = "delete from WORDSPACE where words=?";
		PreparedStatement psmt = conn.prepareStatement(sql);

		psmt.setString(1, memberDelete.WordIsThis.getText());
		psmt.executeUpdate();

		// 5. 연결 종료

		psmt.close();
		conn.close();

	} catch (Exception ex) {
		}
	new deleteWordEvent(memberDelete);
	memberDelete.dispose();
	new wordFrame();
	}
}