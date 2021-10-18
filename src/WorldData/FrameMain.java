package WorldData;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class FrameMain extends JFrame {

	JTabbedPane pane;
	PanelWorld pnWorld;
	PanelCompare pnCompare;
	
	public FrameMain(){
		setTitle("세계 데이터");
		setSize(1120,800);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pane = new JTabbedPane();
		pnWorld = new PanelWorld();
		pnCompare = new PanelCompare();
		
		pane.addTab("메인화면", pnWorld);
		pane.addTab("비교", pnCompare);
		
		this.add(pane);
	
		setVisible(true);
	}
}