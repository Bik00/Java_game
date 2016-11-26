package d_playGame;

import javax.swing.table.AbstractTableModel;

class JTableModel extends AbstractTableModel {
	Object[][] data = {};
	String[] name = { "단어 번호", "단어", "추가한 시간"};
 
	public void setData(String[][] input) {
		this.data = input;
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return name.length;
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}
	
	@Override
	  public Object getValueAt(int row, int col){
		  return data[row][col];
	  }
}