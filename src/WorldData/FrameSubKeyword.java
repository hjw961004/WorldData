package WorldData;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameSubKeyword extends JFrame implements ActionListener{
	JButton btn1, btn2, btn3, btn4, btn5;
	int code;
	
	public FrameSubKeyword(int code, String str) {
		super(str);
		setSize(500,80);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		this.code = code;

		switch(this.code) {
		
		case 1 :
			btn1 = new JButton("열대");
			btn2 = new JButton("온대");
			btn3 = new JButton("냉대");
			btn4 = new JButton("건조");
			
			this.add(btn1);
			this.add(btn2);
			this.add(btn3);
			this.add(btn4);

			btn1.addActionListener(this);
			btn2.addActionListener(this);
			btn3.addActionListener(this);
			btn4.addActionListener(this);
			break;
			
		case 2 :
			btn1 = new JButton("기독교");
			btn2 = new JButton("불교");
			btn3 = new JButton("이슬람");
			btn4 = new JButton("힌두교");
			btn5 = new JButton("기타 종교");
			
			this.add(btn1);
			this.add(btn2);
			this.add(btn3);
			this.add(btn4);
			this.add(btn5);
			
			btn1.addActionListener(this);
			btn2.addActionListener(this);
			btn3.addActionListener(this);
			btn4.addActionListener(this);
			btn5.addActionListener(this);
			break;
			
		case 3 :
			btn1 = new JButton("영어");
			btn2 = new JButton("스페인어");
			btn3 = new JButton("불어");
			btn4 = new JButton("아랍어");
			btn5 = new JButton("기타 언어");
			
			this.add(btn1);
			this.add(btn2);
			this.add(btn3);
			this.add(btn4);
			this.add(btn5);
			
			btn1.addActionListener(this);
			btn2.addActionListener(this);
			btn3.addActionListener(this);
			btn4.addActionListener(this);
			btn5.addActionListener(this);
			break;
			
		default : 
			break;
		}

		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(this.code) {
		case 1:
			new FrameCountryList("select 국가 from country_data where " + "기후" + " like '%" + e.getActionCommand() + "%'"
					, "기후", e.getActionCommand());
			dispose();
			break;
		case 2:
			new FrameCountryList("select 국가 from country_data where " + "종교" + " like '%" + e.getActionCommand() + "%'"
					, "종교", e.getActionCommand());
			dispose();
			break;
		case 3:
			new FrameCountryList("select 국가 from country_data where " + "언어" + " like '%" + e.getActionCommand() + "%'"
					, "언어", e.getActionCommand());
			dispose();
			break;
		default:
			break;
		}
	}

}
