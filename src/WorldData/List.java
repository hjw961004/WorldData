package WorldData;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class List extends JFrame{
	
	List(){

		//국가리스트 프레임에 grid layout생성 
		setTitle("CopmparisonList");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		GridLayout grd = new GridLayout(0,4);
		grd.setVgap(3);
		con.setLayout(grd);

		
		
		//맨 왼쪽 속성패널
		JLabel infoList[] = new JLabel[10];
		JPanel infoPanel = new JPanel(); 
		JButton Graphic = new JButton("Graphic");
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
		String fdata[ ] = {"가나","GH","아크라","열대성","서부아프리카","쿠마시","기독교","Akan","227540","영어"};
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
		String sdata[ ] = {"가봉","GA","리브르빌","열대성","아프리카적도","포트장틸","기독교","null","257670","불어"};
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
		String tdata[ ] = {"가나","GH","아크라","열대성","서부아프리카","쿠마시","기독교","Akan","22790","영어"};
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
		con.add(infoPanel);
		//첫번째 국가리스트 패널 생성
		con.add(firstPanel);
		//두번째 국가리스트 패널 생성
		con.add(secondPanel);
		//세번째 국가리스트 패널 생성
		con.add(thirdPanel);
		
		setSize(700,700);
		setVisible(true);
	}
}
