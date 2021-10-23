package WorldData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelCompare extends JPanel implements ActionListener {
	FrameGraph frGraph;
	JButton btn;
	
	public PanelCompare() {
		btn = new JButton("비교");
		add(btn);
		
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (e.getActionCommand()) {
		
		case "비교" :
			if(frGraph == null) {
				frGraph = new FrameGraph();
			} else {
				frGraph.dispose();
				frGraph = new FrameGraph();
			}
			break;
			
		default :
			break;
		}
	}
}
