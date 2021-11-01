package WorldData;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelMap extends JPanel {
	ImageIcon imageIcon;
	Image image;
	
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}

	PanelMap(){
		imageIcon = new ImageIcon(Main.class.getResource("../image/worldmap.png"));
		image = imageIcon.getImage();
	}
}
