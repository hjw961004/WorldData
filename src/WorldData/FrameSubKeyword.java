package WorldData;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameSubKeyword extends JFrame implements ActionListener{
	JButton btn1, btn2, btn3;
	
	public FrameSubKeyword(int code, String str) {
		super(str);
		setSize(400,80);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		switch(code) {
		
		case 1 :
			btn1 = new JButton("열대");
			btn2 = new JButton("온대");
			btn3 = new JButton("냉대");
			
			this.add(btn1);
			this.add(btn2);
			this.add(btn3);
			break;
			
		case 2 :
			btn1 = new JButton("기독교");
			btn2 = new JButton("불교");
			btn3 = new JButton("이슬람");
			
			this.add(btn1);
			this.add(btn2);
			this.add(btn3);
			break;
			
		case 3 :
			btn1 = new JButton("영어");
			btn2 = new JButton("중국어");
			btn3 = new JButton("아랍어");
			
			this.add(btn1);
			this.add(btn2);
			this.add(btn3);
			break;
			
		default : 
			break;
		}

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getActionCommand()) {
		
		case "기독교":
			dispose();
			break;
		default:
			dispose();
			break;
		}
	}

}
