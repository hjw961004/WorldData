package WorldData;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameCountryList extends JFrame{
	public static final int COUNTRY_COUNT_MAX = 228;
	
	static ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new FrameCountryInfo(e.getActionCommand());
		}
		
	};

	public static void asiaList() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 대륙 = '아시아'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[45];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[45];
		
		jFrame.setLayout(new GridLayout(9, 5, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("아시아 국가-List");
		jFrame.setSize(800, 400);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void europeList() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 대륙 = '유럽'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[56];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[56];
		
		jFrame.setLayout(new GridLayout(12, 5, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("유럽 국가-List");
		jFrame.setSize(900, 700);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void africaList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 대륙 = '아프리카'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[59];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[59];
		
		jFrame.setLayout(new GridLayout(12, 5, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("아프리카 국가-List");
		jFrame.setSize(1300, 800);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void northAmericaList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 대륙 = '북미'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[7];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[7];
		
		jFrame.setLayout(new GridLayout(3, 3, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("북아메리카 국가-List");
		jFrame.setSize(500, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void southAmericaList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 대륙 = '남미'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[40];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[40];
		
		jFrame.setLayout(new GridLayout(8, 5, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("남아메리카 국가-List");
		jFrame.setSize(900, 400);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void oceaniaList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 대륙 = '오세아니아'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[20];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[20];
		
		jFrame.setLayout(new GridLayout(5, 4, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("오세아니아 국가-List");
		jFrame.setSize(650, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void tropicsList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 기후데이터 like '%열대%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[144];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[144];
		
		jFrame.setLayout(new GridLayout(24, 6, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("열대 국가-List");
		jFrame.setSize(1000, 950);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void temperateList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 기후데이터 like '%온대%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[57];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[57];
		
		jFrame.setLayout(new GridLayout(12, 5, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("온대 국가-List");
		jFrame.setSize(900, 600);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void coldList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 기후데이터 like '%냉대%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[16];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[16];
		
		jFrame.setLayout(new GridLayout(6, 3, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("냉대 국가-List");
		jFrame.setSize(400, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void dryList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 기후데이터 like '%건조%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[41];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[41];
		
		jFrame.setLayout(new GridLayout(11, 4, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("건조 국가-List");
		jFrame.setSize(1000, 600);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void christianList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 종교데이터 like '%기독교%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[76];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[76];
		
		jFrame.setLayout(new GridLayout(16, 5, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("기독교 국가-List");
		jFrame.setSize(900, 800);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void buddhismList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 종교데이터 like '%불교%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[16];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[16];
		
		jFrame.setLayout(new GridLayout(6, 3, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("불교 국가-List");
		jFrame.setSize(400, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void islamList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 종교데이터 like '%이슬람교%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[75];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[75];
		
		jFrame.setLayout(new GridLayout(15, 5, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("이슬람교 국가-List");
		jFrame.setSize(1250, 800);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void hinduismList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 종교데이터 like '%힌두교%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[16];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[16];
		
		jFrame.setLayout(new GridLayout(6, 3, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("힌두교 국가-List");
		jFrame.setSize(500, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void religionEtcList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 종교데이터 like '%기타%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[95];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[95];
		
		jFrame.setLayout(new GridLayout(19, 5, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("종교(기타) 국가-List");
		jFrame.setSize(900, 800);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void englishList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 언어데이터 like '%영어%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[77];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[77];
		
		jFrame.setLayout(new GridLayout(16, 5, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("영어 국가-List");
		jFrame.setSize(900, 800);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void spanishList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 언어데이터 like '%스페인어%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[14];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[14];
		
		jFrame.setLayout(new GridLayout(7, 2, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("스페인어 국가-List");
		jFrame.setSize(400, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void frenchList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 언어데이터 like '%불어%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[37];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[37];
		
		jFrame.setLayout(new GridLayout(10, 4, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("프랑스어 국가-List");
		jFrame.setSize(800, 600);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void arabicList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 언어데이터 like '%아랍어%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[26];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[26];
		
		jFrame.setLayout(new GridLayout(9, 3, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("아랍어 국가-List");
		jFrame.setSize(450, 400);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void languageEtcList() {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where 언어데이터 like '%기타%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[112];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[112];
		
		jFrame.setLayout(new GridLayout(23, 5, 10, 10));
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setTitle("언어(기타)-List");
		jFrame.setSize(1250, 900);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void countryList(String keyword) {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select 국가 from country_data where * like '%" + keyword + "%'";
		
		JFrame jFrame = new JFrame();
		String country = "";
		String[] countryList = new String[COUNTRY_COUNT_MAX];
		int index = 0;
		JButton btn;
		JButton[] btnList = new JButton[COUNTRY_COUNT_MAX];
		
		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				country = rs.getString("국가");
				countryList[index] = country;
				
				btn = new JButton(country);
				btnList[index] = btn;
				btn.addActionListener(listener);
				
				jFrame.add(btnList[index]);
				
				index++;
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		jFrame.setLayout(new GridLayout(10, 10, 10, 10));
		jFrame.setTitle("아시아 국가-List");
		jFrame.setSize(800, 400);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
