package com.basicevent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MouseAdapterTest extends MouseAdapter{//마우스리스너를 디폴트값으로 다 설정해 놓음
		private JTextField text;
		private JPanel p;
		public MouseAdapterTest(JTextField text,JPanel p) {//다른 클래스의 구성요소를 매개변수로 불러옴.
			this.text=text;
			this.p=p;
		}
		
		
	@Override //필요한 것만 구현 가능
	public void mouseClicked(MouseEvent e) {
		System.out.println("이벤트!발생!! 호호!!");
		JButton btn=(JButton)e.getSource();
		text.setText("안녕"+btn.getText());
		JLabel label=new JLabel("이건 외부에서 추가된 문구");
		p.add(label);
		p.revalidate();//validate(), repaint();//변경됬으니 다시 그려라.
		//출력되있는 컨테이너를 수정했으면 갱신해줘야함.
		
	}
	
	
	
}
