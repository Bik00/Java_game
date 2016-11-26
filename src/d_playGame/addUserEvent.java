package d_playGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class addUserEvent implements ActionListener {
	private gameOver Over;

	public addUserEvent(gameOver object) {
		Over = object;
	}
	@Override
	public void actionPerformed(ActionEvent args0) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@net.yjc.ac.kr:1521:orcl";
			String id = "s1201089";
			String pw = "p1201089";
			Connection conn = DriverManager.getConnection(url, id, pw);

			// 3. PreparedStatement 객체 생성
			String sql = "insert into PLAYER(NAME, SCORE,TIME)" + "values(?, ?, SYSDATE)";
			PreparedStatement psmt = conn.prepareStatement(sql);
		int value=playGame.total;
		
		psmt.setString(1, Over.textField.getText());
		psmt.setInt(2, value);
		psmt.executeUpdate();

		// 5. 연결 종료

		psmt.close();
		conn.close();
	} catch (Exception ex) {
		}
	new addUserEvent(Over);
	Over.dispose();
	new exited();
	}
}