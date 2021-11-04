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
		setSize(778,630);
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
	
	public FrameGraph(String n1, double a1) {
		super("그래프");
		setSize(778,630);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnBack = new JButton("뒤로가기");
		add(btnBack, BorderLayout.NORTH);

		drawingPanel = new DrawingPanel(n1, a1);
		add(drawingPanel, BorderLayout.CENTER);

		setVisible(true);
		
		btnBack.addActionListener(this);
	}
	
	public FrameGraph(String n1, double a1, String n2, double a2) {
		super("그래프");
		setSize(778,630);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnBack = new JButton("뒤로가기");
		add(btnBack, BorderLayout.NORTH);

		drawingPanel = new DrawingPanel(n1, a1, n2, a2);
		add(drawingPanel, BorderLayout.CENTER);

		setVisible(true);
		
		btnBack.addActionListener(this);
	}
	

	public FrameGraph(String n1, double a1, String n2, double a2, String n3, double a3) {
		super("그래프");
		setSize(778,630);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnBack = new JButton("뒤로가기");
		add(btnBack, BorderLayout.NORTH);

		drawingPanel = new DrawingPanel(n1, a1, n2, a2, n3, a3);
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
	int Sx = 30, Rx = 700, Sy = 30, Ry = 500;
	
	String infoName1, infoName2, infoName3;
	double infoArea1, infoArea2, infoArea3;
	int pArea1, pArea2, pArea3;
	
	int count;
	double maxArea;
	
	public DrawingPanel() {
		count = 0;
	}
	
	public DrawingPanel(String n1, double a1) {
		count = 1;
	}
	
	public DrawingPanel(String n1, double a1, String n2, double a2) {
		infoName1 = n1;
		infoArea1 = a1;
		
		infoName2 = n2;
		infoArea2 = a2;
		
		count = 2;
		
		if(a1 >= a2)
			maxArea = a1;
		else
			maxArea = a2;
		
		pArea1 = (int) Math.round(infoArea1 / maxArea * 100);
		pArea2 = (int) Math.round(infoArea2 / maxArea * 100);
		
		if (pArea1 == 0) 
			pArea1++;
		if (pArea2 == 0)
			pArea2++;
	}
	
	public DrawingPanel(String n1, double a1, String n2, double a2, String n3, double a3) {
		infoName1 = n1;
		infoArea1 = a1;
		
		infoName2 = n2;
		infoArea2 = a2;
		
		infoName3 = n3;
		infoArea3 = a3;
		
		count = 3;
		
		if(a1 >= a2)
			maxArea = a1;
		else
			maxArea = a2;
		
		if(a3 > maxArea)
			maxArea = a3;
			
		
		pArea1 = (int) Math.round(infoArea1 / maxArea * 100);
		pArea2 = (int) Math.round(infoArea2 / maxArea * 100);
		pArea3 = (int) Math.round(infoArea3 / maxArea * 100);
		
		if (pArea1 == 0) 
			pArea1++;
		if (pArea2 == 0)
			pArea2++;
		if (pArea3 == 0)
			pArea3++;
	}
	
	public void paint(Graphics g){
		g.clearRect(0,0,getWidth(),getHeight());
		g.drawRect(Sx,Sy,Rx,Ry);
		g.drawLine(Sx+50, Sy+Ry-50, Sx+Rx-50, Sy+Ry-50);
		g.drawLine(Sx+50, Sy+50, Sx+50, Sy+Ry-50);
		
		switch(count) {
		case 0  :
			g.drawString("비교 대상을 최소 두 개 이상 선택해주세요.", Sx+250, Sy+200);
				
			break;
		case 1 :
			g.drawString("비교 대상을 최소 두 개 이상 선택해주세요.", Sx+250, Sy+200);
			
			break;
		case 2 :
			for(int cnt = 1 ; cnt < 11 ; cnt++){
				g.drawString(cnt *10 +"%", Sx+15, Sy+Ry-45-40*cnt);
				g.drawLine(Sx+50, Sy+Ry-50-40*cnt, Sx+Rx-50, Sy+Ry-50-40*cnt);
			}
			
			g.drawString("Km^2", Sx+Rx-80, Sy+Ry-30);
			
			g.drawString(infoName1 + "(" + infoArea1 + ")" , Sx+50+120, Sy+Ry-30);
			g.drawString(infoName2 + "(" + infoArea2 + ")", Sx+50+270, Sy+Ry-30);
			
			g.setColor(Color.RED);
			
			g.fillRect(Sx+50+120,Sy+Ry-50-pArea1*4,60,pArea1*4);
			g.fillRect(Sx+50+270,Sy+Ry-50-pArea2*4,60,pArea2*4);
			
			break;
		case 3 :
			for(int cnt = 1 ; cnt < 11 ; cnt++){
				g.drawString(cnt *10 +"%", Sx+15, Sy+Ry-45-40*cnt);
				g.drawLine(Sx+50, Sy+Ry-50-40*cnt, Sx+Rx-50, Sy+Ry-50-40*cnt);
			}
			
			g.drawString("Km^2", Sx+Rx-80, Sy+Ry-30);
			
			g.drawString(infoName1 + "(" + infoArea1 + ")" , Sx+50+120, Sy+Ry-30);
			g.drawString(infoName2 + "(" + infoArea2 + ")", Sx+50+270, Sy+Ry-30);
			g.drawString(infoName3 + "(" + infoArea3 + ")", Sx+50+420, Sy+Ry-30);
			
			g.setColor(Color.RED);
			
			g.fillRect(Sx+50+120,Sy+Ry-50-pArea1*4,60,pArea1*4);
			g.fillRect(Sx+50+270,Sy+Ry-50-pArea2*4,60,pArea2*4);
			g.fillRect(Sx+50+420,Sy+Ry-50-pArea3*4,60,pArea3*4); 
			
			break;
		default :
			break;
		}
	}
}