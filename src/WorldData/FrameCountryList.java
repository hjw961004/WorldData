package WorldData;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class FrameCountryList extends JFrame {
	FrameCountryList frameCountryList;
	static String name;
	JFrame jFrame;
	JList<String> jList; //리스트
	DefaultListModel<String> listModel = new DefaultListModel<>(); //리스트에 넣을 리스트모델(국가)
	JButton backButton;
	
	public FrameCountryList() {}
	public FrameCountryList(String _sql, String column, String keyword) {
		jFrame = new JFrame();
		String country = new String();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = new String();
		
		if(frameCountryList != null)
			jFrame.dispose();
		
		if(_sql.equals(worldMapCountryList(keyword)))
			sql = worldMapCountryList(keyword);
		else if(_sql.equals(keywordCountryList(column, keyword)))
			sql = keywordCountryList(column, keyword);
		else
			sql = totalSearchCountryList(keyword);
		
		try {
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				country = rs.getString("국가"); //"국가"컬럼
				listModel.addElement(country); //국가 추가
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		JPanel backButtonPanel = new JPanel(new BorderLayout());
		backButton = new JButton("뒤로가기");
		backButtonPanel.add(backButton);
		jFrame.add(backButtonPanel, BorderLayout.NORTH);
		backButton.addActionListener(actionListener);
		
		if(listModel.isEmpty()) {
			JTextField noData = new JTextField("                                        "
					+ "데이터가 존재하지 않습니다.");
			JPanel jPanel = new JPanel();
			jPanel.setLayout(new CardLayout());
			jPanel.add(noData, BorderLayout.CENTER);
			jFrame.add(jPanel, BorderLayout.CENTER);
			jFrame.setTitle("국가-List");
		}
		else {
			JPanel listPanel = new JPanel();
			jList = new JList<String>(listModel);
			listPanel.setLayout(new CardLayout());
			listPanel.add(jList, BorderLayout.CENTER);
			jList.addListSelectionListener(listListener);
			JScrollPane scrollBar = new JScrollPane(jList); //스크롤바
			listPanel.add(scrollBar,"CENTER");
			jFrame.add(listPanel, BorderLayout.CENTER);
			jFrame.setTitle(keyword + " 국가-List");
		}
		
		jFrame.setSize(400, 350);
		jFrame.setResizable(false);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
		jFrame.addWindowListener(windowListener);
	}
	
	ActionListener actionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand() == "뒤로가기")
				jFrame.dispose();
		}
	};
	
	ListSelectionListener listListener = new ListSelectionListener() { //리스트모델이 클릭될 때
		@Override
		public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
            	name = String.valueOf(jList.getSelectedValue());
            	new FrameCountryInfo(String.valueOf(jList.getSelectedValue())); //국가데이터 불러오기
    			jFrame.dispose();
            }
        }
	};
	
	WindowListener windowListener = new WindowListener() {
		@Override
		public void windowOpened(WindowEvent e) {
		
		}
		@Override
		public void windowClosing(WindowEvent e) {
			listModel.clear();
			jFrame.dispose();
		}
		@Override
		public void windowClosed(WindowEvent e) {}
		@Override
		public void windowIconified(WindowEvent e) {}
		@Override
		public void windowDeiconified(WindowEvent e) {}
		@Override
		public void windowActivated(WindowEvent e) {}
		@Override
		public void windowDeactivated(WindowEvent e) {}
	};
	
	public static String worldMapCountryList(String keyword) {
		String sql = "select 국가 from country_data where 대륙 = '" + keyword + "'";
		return sql;
		
	}
	
	public static String keywordCountryList(String column, String keyword) {
		String sql = "select 국가 from country_data where " + column + " like '%" + keyword + "%'";
		return sql;
	}
	
	public static String totalSearchCountryList(String keyword) {
		String sql = "select 국가 from country_data WHERE MATCH"
				+ "(국가, 수도, 위치, 주요도시, 주요민족, 대륙, 기후데이터, 종교데이터, 언어데이터) AGAINST ('" + keyword + "')";
		return sql;
	}
}

