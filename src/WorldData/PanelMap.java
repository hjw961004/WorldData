package WorldData;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelMap extends JPanel implements ActionListener {
	ImageIcon imageIcon;
	Image image;
	
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}

	PanelMap(){
		imageIcon = new ImageIcon(Main.class.getResource("../image/worldmap2.PNG"));
		image = imageIcon.getImage();
		this.setLayout(null);

		JButton AS = new JButton("아시아");
		JButton EU = new JButton("유럽");
		JButton AF = new JButton("아프리카");
		JButton NA = new JButton("북미");
		JButton SA = new JButton("남미");
		JButton OC = new JButton("오세아니아");

		AS.setBounds(700, 170, 200, 200);
		AS.setBorderPainted(false);
		AS.setContentAreaFilled(false);
		AS.setFocusPainted(false);

		EU.setBounds(500, 160, 130, 130);
		EU.setBorderPainted(false);
		EU.setContentAreaFilled(false);
		EU.setFocusPainted(false);
		
		AF.setBounds(470, 300, 180, 180);
		AF.setBorderPainted(false);
		AF.setContentAreaFilled(false);
		AF.setFocusPainted(false);
		
		NA.setBounds(170, 120, 200, 200);
		NA.setBorderPainted(false);
		NA.setContentAreaFilled(false);
		NA.setFocusPainted(false);
		
		SA.setBounds(270, 340, 170, 170);
		SA.setBorderPainted(false);
		SA.setContentAreaFilled(false);
		SA.setFocusPainted(false);
		
		OC.setBounds(830, 380, 130, 130);
		OC.setBorderPainted(false);
		OC.setContentAreaFilled(false);
		OC.setFocusPainted(false);

		this.add(AS);
		this.add(EU);
		this.add(AF);
		this.add(NA);
		this.add(SA);
		this.add(OC);

		AS.addActionListener(this);
		EU.addActionListener(this);
		AF.addActionListener(this);
		NA.addActionListener(this);
		SA.addActionListener(this);
		OC.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new FrameCountryList(FrameCountryList.worldMapCountryList(e.getActionCommand()), null, e.getActionCommand());
	}
}
