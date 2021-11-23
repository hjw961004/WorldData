package WorldData;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelWorld extends JPanel implements ActionListener {
	
	JPanel pnSearch;
	PanelMap pnMap;
	JPanel pnKeyword;
	JTextField tfSearch;
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

		tfSearch = new HintTextField("검색어를 두 글자 이상 입력하세요.");
		JButton btnSearch = new JButton("검색");
		
		tfSearch.setPreferredSize(new Dimension(800,30));
		btnSearch.setPreferredSize(new Dimension(100,30));
		
		pnSearch.add(tfSearch);
		pnSearch.add(btnSearch);
		btnSearch.addActionListener(this);
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
			new FrameCountryList(FrameCountryList.totalSearchCountryList(tfSearch.getText()), null, tfSearch.getText());
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

	public class HintTextField extends JTextField {

        Font gainFont = new Font("맑은 고딕", Font.PLAIN, 11);
        Font lostFont = new Font("맑은 고딕", Font.ITALIC, 11);

        public HintTextField(final String hint) {

          setText(hint);
          setFont(lostFont);
          setForeground(Color.GRAY);
          this.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {

              if (getText().equals(hint)) {
                setText("");
                setFont(gainFont);
              }
              else {
                setText(getText());
                setFont(gainFont);
              }
            }

            @Override
            public void focusLost(FocusEvent e) {

              if (getText().equals(hint)|| getText().length()==0) {
                setText(hint);
                setFont(lostFont);
                setForeground(Color.GRAY);
              } 
              else {
                setText(getText());
                setFont(gainFont);
                setForeground(Color.BLACK);
              }
            }
          });
        }
      }
}
