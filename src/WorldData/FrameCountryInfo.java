package WorldData;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Desktop;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import java.awt.FlowLayout;


public class FrameCountryInfo extends JFrame implements ActionListener {

	JPanel contentPane;
	Info data;

	JButton btnNewButton;
	JButton btnCsv;
	
	public FrameCountryInfo(String countryName) {
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM" + " test where name = " + countryName;

		try {
			
			ps = Main.dbM.con.prepareStatement(sql);
			rs = ps.executeQuery();
			rs.next();
			data = new Info(rs.getString("name"), rs.getString("code"), rs.getString("capital"), rs.getString("weather"), rs.getString("location"), rs.getString("religion"), rs.getString("area"), rs.getString("language"));
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("국가 정보");
		setBounds(400, 150, 600, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel.getLayout();
		flowLayout_5.setVgap(-3);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel(data.name);
		panel.add(lblNewLabel);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		
		JLabel lblNewLabel_6 = new JLabel("("+data.code+")");
		lblNewLabel_6.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_6);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setVgap(13);
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_4);
		
		JLabel lblNewLabel_3 = new JLabel("수도 : ");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_4.add(lblNewLabel_3);

		if(data.capital.equals("")) {
			data.capital="자료 없음";
		}
		
		JLabel lblNewLabel_9 = new JLabel(data.capital);
		lblNewLabel_9.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_4.add(lblNewLabel_9);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_3.getLayout();
		flowLayout_2.setVgap(13);
		flowLayout.setVgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_4 = new JLabel("기후 : ");
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_3.add(lblNewLabel_4);

		if(data.weather.equals("")) {
			data.weather="자료 없음";
		}
		JLabel lblNewLabel_10 = new JLabel(data.weather);
		lblNewLabel_10.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_3.add(lblNewLabel_10);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_1.getLayout();
		flowLayout_3.setVgap(13);
		flowLayout.setVgap(10);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("위치 : ");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_1.add(lblNewLabel_1);

		if(data.location.equals("")) {
			data.location="자료 없음";
		}
		JLabel lblNewLabel_2 = new JLabel(data.location);
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) panel_6.getLayout();
		flowLayout_6.setVgap(13);
		flowLayout.setVgap(10);
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_6);
		
		JLabel lblNewLabel_7 = new JLabel("종교 : ");
		lblNewLabel_7.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_6.add(lblNewLabel_7);

		if(data.religion.equals("")) {
			data.religion="자료 없음";
		}
		JLabel lblNewLabel_11 = new JLabel(data.religion);
		lblNewLabel_11.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_6.add(lblNewLabel_11);
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) panel_7.getLayout();
		flowLayout_7.setVgap(13);
		flowLayout.setVgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_7);
		
		JLabel lblNewLabel_8 = new JLabel("면적 : ");
		lblNewLabel_8.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_7.add(lblNewLabel_8);

		if(data.area.equals("")) {
			data.area="자료 없음";
		}
		JLabel lblNewLabel_12 = new JLabel(data.area+"km²");
		lblNewLabel_12.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_7.add(lblNewLabel_12);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_2.getLayout();
		flowLayout_4.setVgap(13);
		flowLayout.setVgap(10);
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_5 = new JLabel("언어 : ");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_2.add(lblNewLabel_5);

		if(data.language.equals("")) {
			data.language="자료 없음";
		}
		JLabel lblNewLabel_13 = new JLabel(data.language);
		lblNewLabel_13.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel_2.add(lblNewLabel_13);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setVgap(10);
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panel_5);
		
		btnNewButton = new JButton("정보 비교");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_5.add(btnNewButton);

		btnNewButton.addActionListener(this);
		
		btnCsv = new JButton("CSV");
		btnCsv.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_5.add(btnCsv);
		
		btnCsv.addActionListener(this);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getActionCommand()) {
			case "정보 비교":
				if(Main.countryList.size() >= 3) 
					System.out.println("리스트를 삭제 후 넣어주세요.");
				else {
					Main.countryList.add(data);
					Main.MF.pnCompare.validate();
					Main.MF.pnCompare.repaint();
				}
				break;
			case "CSV":
				try {
					Desktop.getDesktop().edit(new File("C:\\test.csv"));			
				}catch(IOException e1) {
					e1.printStackTrace();			
				}
				break;
			default :
				break;
		}
	}

}
