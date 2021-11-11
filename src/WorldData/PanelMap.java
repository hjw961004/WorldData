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
		
		JButton EU = new JButton("유럽");
		JButton AF = new JButton("아프리카");
			

		EU.setBounds(500, 160, 130, 130);
		//EU.setBorderPainted(false);
		EU.setContentAreaFilled(false);
		EU.setFocusPainted(false);
		
		AF.setBounds(470, 300, 180, 180);
		//AF.setBorderPainted(false);
		AF.setContentAreaFilled(false);
		AF.setFocusPainted(false);
		
		
		this.add(EU);
		this.add(AF);
		
		EU.addActionListener(this);
		AF.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getActionCommand()) {
		
		case "유럽" :
			System.out.print("유럽");
			break;
		case "아프리카" :
			System.out.print("아프리카");
			break;
		default :
			break;		
		
		}
		
	}
}
