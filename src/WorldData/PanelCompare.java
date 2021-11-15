package WorldData;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCompare extends JPanel implements ActionListener {
	GridLayout grd = new GridLayout(0,4);
	JPanel infoPanel,firstPanel,secondPanel,thirdPanel = new JPanel();
	JLabel infoList[],firstList[],secondList[],thirdList[] = new JLabel[10];
	JButton Graphic, firstDelete, secondDelete, thirdDelete = new JButton();
	
	FrameGraph frGraph = null;
	
	String info[] = {"국가","국가코드","수도","기후","위치","종교","면적","언어"};
	
	//Info객체 초기
	Info firstInfo = new Info();
	Info secondInfo= new Info();
	Info thirdInfo= new Info();
	
	
	public PanelCompare() {
		
		grd = new GridLayout(0,4);
		grd.setVgap(3);
		setLayout(grd);
		
		//현재 비교대상 국가들의 수에 따라 Info객체 대입
		if(Main.countryList.isEmpty()) {
			
		}
		else if(Main.countryList.size()==1) {
			firstInfo = Main.countryList.get(0);
		}
		else if(Main.countryList.size()==2) {
			firstInfo = Main.countryList.get(0);
			secondInfo = Main.countryList.get(1);
		}
		else if(Main.countryList.size()==3) {
			firstInfo = Main.countryList.get(0);
			secondInfo = Main.countryList.get(1);
			thirdInfo =  Main.countryList.get(2);
		}
		
		//맨 왼쪽 속성패널
		JLabel infoList[] =  new JLabel[10];
		infoPanel = new JPanel(); 
		Graphic = new JButton("그래픽 비교");
		for(int k=0; k<=7; k++) {
			infoList[k] = new JLabel(info[k]);
			infoPanel.add(infoList[k]);
			infoList[k].setPreferredSize(new java.awt.Dimension(200,50));
			infoList[k].setHorizontalAlignment(JLabel.CENTER);
		}
		//grapic버튼 생성
	    infoPanel.add(Graphic);
		
	    //첫번째 국가리스트 패널
	    JLabel firstList[] =  new JLabel[10];
		firstPanel = new JPanel(); 
		firstDelete = new JButton("삭제");
		String fdata[ ] = {firstInfo.name,firstInfo.code,firstInfo.capital,firstInfo.weather,firstInfo.location,firstInfo.religion,firstInfo.area,firstInfo.language};
		for(int k=0; k<=7; k++) {
			firstList[k] = new JLabel(fdata[k]);
			firstPanel.add(firstList[k]);
			firstList[k].setPreferredSize(new java.awt.Dimension(200,50));
			firstList[k].setHorizontalAlignment(JLabel.CENTER);
			firstList[k].setOpaque(true);
			firstList[k].setBackground(Color.WHITE);
		}
		//첫번쨰 국가리스트 삭제버튼
		firstPanel.add(firstDelete);
		
		//두번째 국가리스트 패널
		JLabel secondList[] =  new JLabel[10];
		secondPanel = new JPanel(); 
		secondDelete = new JButton("삭제");
		String sdata[ ] = {secondInfo.name, secondInfo.code,secondInfo.capital,secondInfo.weather,secondInfo.location,secondInfo.religion,secondInfo.area,secondInfo.language};
		for(int k=0; k<=7; k++) {
			secondList[k] = new JLabel(sdata[k]);
			secondPanel.add(secondList[k]);
			secondList[k].setPreferredSize(new java.awt.Dimension(200,50));
			secondList[k].setHorizontalAlignment(JLabel.CENTER);
			secondList[k].setOpaque(true);
			secondList[k].setBackground(Color.WHITE);
		}
		//두번쨰 국가리스트 삭제버튼
		secondPanel.add(secondDelete);
		
		//세번째 국가리스트 패널
		JLabel thirdList[] =  new JLabel[10];
		thirdPanel = new JPanel(); 
		thirdDelete = new JButton("삭제");
		String tdata[ ] = {thirdInfo.name,thirdInfo.code,thirdInfo.capital,thirdInfo.weather,thirdInfo.location,thirdInfo.religion,thirdInfo.area,thirdInfo.language};
		for(int k=0; k<=7; k++) {
			thirdList[k] = new JLabel(tdata[k]);
			thirdPanel.add(thirdList[k]);
			thirdList[k].setPreferredSize(new java.awt.Dimension(200,50));
			thirdList[k].setHorizontalAlignment(JLabel.CENTER);
			thirdList[k].setOpaque(true);
			thirdList[k].setBackground(Color.WHITE);
		}
		//세번째 국가리스트 삭제버튼
		thirdPanel.add(thirdDelete);

		add(infoPanel);

		Graphic.addActionListener(this);
		firstDelete.addActionListener(this);
		secondDelete.addActionListener(this);
		thirdDelete.addActionListener(this);
		
		countryset();
	}
	
	//현재 비교대상 국가들의 수에 따라 국가패널생성
	public void countryset() {
		if(Main.countryList.size()==1) {
			add(firstPanel);
		}
		else if(Main.countryList.size()==2) {
			add(firstPanel);
			add(secondPanel);
		}
		else if(Main.countryList.size()==3) {
			add(firstPanel);
			add(secondPanel);
			add(thirdPanel);
		}
	}
		

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (e.getActionCommand()) {
		
		case "그래픽 비교" :
			if(frGraph == null) {
				if(Main.countryList.size() == 0 || Main.countryList.size() == 1) 
					frGraph = new FrameGraph();
				
				else if(Main.countryList.size() == 2) 
					frGraph = new FrameGraph(firstInfo.name, Integer.parseInt(firstInfo.area), secondInfo.name, Integer.parseInt(secondInfo.area));
				
				else if(Main.countryList.size() == 3) 
					frGraph = new FrameGraph(firstInfo.name, Integer.parseInt(firstInfo.area), secondInfo.name, Integer.parseInt(secondInfo.area)
							, thirdInfo.name, Integer.parseInt(thirdInfo.area));
				
			} else {
				frGraph.dispose();
				if(Main.countryList.size() == 0 || Main.countryList.size() == 1) 
					frGraph = new FrameGraph();
				
				else if(Main.countryList.size() == 2) 
					frGraph = new FrameGraph(firstInfo.name, Double.parseDouble(firstInfo.area), secondInfo.name, Double.parseDouble(secondInfo.area));
				
				else if(Main.countryList.size() == 3) 
					frGraph = new FrameGraph(firstInfo.name, Double.parseDouble(firstInfo.area), secondInfo.name, Double.parseDouble(secondInfo.area)
							, thirdInfo.name, Double.parseDouble(thirdInfo.area));
			}
			break;
			
		case "삭제" :
			if(e.getSource().equals(firstDelete)){
				remove(firstPanel);
				firstPanel.revalidate();
				validate();
				repaint();
				Main.countryList.remove(0);
			}
			else if(e.getSource().equals(secondDelete)){
				remove(secondPanel);
				secondPanel.revalidate();
				validate();
				repaint();
				Main.countryList.remove(1);
			}
			else if(e.getSource().equals(thirdDelete)){
				remove(thirdPanel);
				thirdPanel.revalidate();
				validate();
				repaint();
				Main.countryList.remove(2);
			}
			break;
			
		default :
			break;
		}
	}
}
