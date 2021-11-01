package WorldData;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelWorld extends JPanel implements ActionListener {
	
	JPanel pnSearch;
	PanelMap pnMap;
	JPanel pnKeyword;
	FrameSubKeyword frSub;
	
	public PanelWorld() {
		
		pnSearchSet();
		pnMapSet();
		pnKeywordSet();
		
		this.setLayout(new BorderLayout(10,10));
		
		
		add(pnSearch, BorderLayout.NORTH);
		add(pnMap, BorderLayout.CENTER);
		add(pnKeyword, BorderLayout.SOUTH);
	}
	
	private void pnSearchSet() {
		pnSearch = new JPanel();
		
		JTextField tfSearch = new JTextField("검색어를 입력하세요.");
		JButton btnSearch = new JButton("검색");
		
		tfSearch.setPreferredSize(new Dimension(800,30));
		btnSearch.setPreferredSize(new Dimension(100,30));
		
		pnSearch.add(tfSearch);
		pnSearch.add(btnSearch);
	}
	
	private void pnMapSet() {
		pnMap = new PanelMap();
		
	}
	
	private void pnKeywordSet() {
		pnKeyword = new JPanel();
		
		JButton btnClimate = new JButton("기후");
		JButton btnReligion = new JButton("종교");
		JButton btnLauguage = new JButton("언어");
		
		btnClimate.setPreferredSize(new Dimension(100, 50));
		btnReligion.setPreferredSize(new Dimension(100, 50));
		btnLauguage.setPreferredSize(new Dimension(100, 50));
		
		btnClimate.addActionListener(this);
		btnReligion.addActionListener(this);
		btnLauguage.addActionListener(this);
		
		pnKeyword.add(btnClimate);
		pnKeyword.add(btnReligion);
		pnKeyword.add(btnLauguage);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getActionCommand()) {
		
		case "검색" :
			break;
			
		case "기후" :
			if(frSub == null) {
				frSub = new FrameSubKeyword(1, "기후");
			} else {
				frSub.dispose();
				frSub = new FrameSubKeyword(1, "기후");
			}
			break;

		case "종교" :
			if(frSub == null) {
				frSub = new FrameSubKeyword(2, "종교");
			} else {
				frSub.dispose();
				frSub = new FrameSubKeyword(2, "종교");
			}
			break;
			
		case "언어" :
			if(frSub == null) {
				frSub = new FrameSubKeyword(3, "언어");
			} else {
				frSub.dispose();
				frSub = new FrameSubKeyword(3, "언어");
			}
			break;
		}
	}
}
