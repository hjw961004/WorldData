package WorldData;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameGraph extends JFrame implements ActionListener{
	JButton btnBack;
	DrawingPanel drawingPanel;
	
	public FrameGraph() {
		super("그래프");
		setSize(400,350);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnBack = new JButton("뒤로가기");
		add(btnBack, BorderLayout.NORTH);

		drawingPanel = new DrawingPanel();
		add(drawingPanel, BorderLayout.CENTER);

		setVisible(true);
		
		btnBack.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getActionCommand()) {
		
		case "뒤로가기" :
			dispose();
			break;
			
		default :
			break;
		}
	}
}


class DrawingPanel extends JPanel{
	int korea = 100, america = 50, japan = 20;
	
	public void paint(Graphics g){
		g.clearRect(0,0,getWidth(),getHeight());
		g.drawLine(50,250,350,250);
		
		for(int cnt = 1 ; cnt<11 ; cnt++){
			g.drawString(cnt *10 +"",25,255-20*cnt);
			g.drawLine(50, 250-20*cnt, 350,250-20*cnt);
		}
		
		g.drawLine(50,20,50,250);
		g.drawString("한국",100,270);
		g.drawString("미국",200,270);
		g.drawString("일본",300,270);
		g.setColor(Color.RED);
		
		if(korea>0)
			g.fillRect(110,250-korea*2,10,korea*2);
		if(america>0)
			g.fillRect(210,250-america*2,10,america*2);
		if(japan>0)
			g.fillRect(310,250-japan*2,10,japan*2);
		}
}