package WorldData;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCompare extends JPanel implements ActionListener {
	String fdata[] = {"가나","GH","아크라","열대성","서부아프리카","쿠마시","기독교","Akan","45.40","영어"};
	String sdata[] = {"가봉","GA","리브르빌","열대성","아프리카적도","포트장틸","기독교","null","2000","불어"};
	String tdata[] = {"가나","GH","아크라","열대성","서부아프리카","쿠마시","기독교","Akan","20000000","영어"};
	
	FrameGraph frGraph = null;
	
	public PanelCompare() {
		
		GridLayout grd = new GridLayout(0,4);
		grd.setVgap(3);
		setLayout(grd);

		
		
		//맨 왼쪽 속성패널
		JLabel infoList[] = new JLabel[10];
		JPanel infoPanel = new JPanel(); 
		JButton Graphic = new JButton("그래픽 비교");
		String info[ ] = {"국가","국가코드","수도","기후","위치","주요도시","종교","주요민족","면적","언어"};
		for(int k=0; k<=9; k++) {
			infoList[k] = new JLabel(info[k]);
			infoPanel.add(infoList[k]);
			infoList[k].setPreferredSize(new java.awt.Dimension(150,50));
			infoList[k].setHorizontalAlignment(JLabel.CENTER);
		}
		//grapic버튼 생성
	    infoPanel.add(Graphic);
		
	    //첫번째 국가리스트 패널
		JLabel firstList[] = new JLabel[10];
		JPanel firstPanel = new JPanel(); 
		JButton firstDelete = new JButton("삭제");
		for(int k=0; k<=9; k++) {
			firstList[k] = new JLabel(fdata[k]);
			firstPanel.add(firstList[k]);
			firstList[k].setPreferredSize(new java.awt.Dimension(150,50));
			firstList[k].setHorizontalAlignment(JLabel.CENTER);
			firstList[k].setOpaque(true);
			firstList[k].setBackground(Color.WHITE);
		}
		//첫번쨰 국가리스트 삭제버튼
		firstPanel.add(firstDelete);
		
		//두번째 국가리스트 패널
		JLabel secondList[] = new JLabel[10];
		JPanel secondPanel = new JPanel(); 
		JButton secondDelete = new JButton("삭제");
		for(int k=0; k<=9; k++) {
			secondList[k] = new JLabel(sdata[k]);
			secondPanel.add(secondList[k]);
			secondList[k].setPreferredSize(new java.awt.Dimension(150,50));
			secondList[k].setHorizontalAlignment(JLabel.CENTER);
			secondList[k].setOpaque(true);
			secondList[k].setBackground(Color.WHITE);
		}
		//두번쨰 국가리스트 삭제버튼
		secondPanel.add(secondDelete);
		
		//세번째 국가리스트 패널
		JLabel thirdList[] = new JLabel[10];
		JPanel thirdPanel = new JPanel(); 
		JButton thirdDelete = new JButton("삭제");
		for(int k=0; k<=9; k++) {
			thirdList[k] = new JLabel(tdata[k]);
			thirdPanel.add(thirdList[k]);
			thirdList[k].setPreferredSize(new java.awt.Dimension(150,50));
			thirdList[k].setHorizontalAlignment(JLabel.CENTER);
			thirdList[k].setOpaque(true);
			thirdList[k].setBackground(Color.WHITE);
		}
		//세번째 국가리스트 삭제버튼
		thirdPanel.add(thirdDelete);
	
		//속성패널 생성
		add(infoPanel);
		//첫번째 국가리스트 패널 생성
		add(firstPanel);
		//두번째 국가리스트 패널 생성
		add(secondPanel);
		//세번째 국가리스트 패널 생성
		add(thirdPanel);
		
		Graphic.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (e.getActionCommand()) {
		
		case "그래픽 비교" :
			if(frGraph == null) {
				// 비교 값이 없을 때
				//frGraph = new FrameGraph();
				// 비교 값이 1개 일때
				//frGraph = new FrameGraph(fdata[0], Double.parseDouble(fdata[8]));
				// 비교 값이 2개 일때
				//frGraph = new FrameGraph(fdata[0], Double.parseDouble(fdata[8]), sdata[0], Double.parseDouble(sdata[8]));
				// 비교 값이 3개 일때
				frGraph = new FrameGraph(fdata[0], Double.parseDouble(fdata[8]), sdata[0], Double.parseDouble(sdata[8])
						, tdata[0], Double.parseDouble(tdata[8]));
			} else {
				frGraph.dispose();
				//frGraph = new FrameGraph();
				//frGraph = new FrameGraph(fdata[0], Double.parseDouble(fdata[8]));
				//frGraph = new FrameGraph(fdata[0], Double.parseDouble(fdata[8]), sdata[0], Double.parseDouble(sdata[8]));
				frGraph = new FrameGraph(fdata[0], Double.parseDouble(fdata[8]), sdata[0], Double.parseDouble(sdata[8])
						, tdata[0], Double.parseDouble(tdata[8]));
			}
			break;
			
		default :
			break;
		}
	}
}
