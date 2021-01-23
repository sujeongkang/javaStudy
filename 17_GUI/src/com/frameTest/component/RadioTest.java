package com.frameTest.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioTest {

	public static void main(String[] args) {
		
		
		JFrame f=new JFrame("라디오버튼");
		//레이아웃 미설정시 default 값으로 borderLayout 적용
		f.setSize(100,150);
		
		
		JPanel top=new JPanel();
		JLabel title=new JLabel("어떤크기를 원하세요?");
		top.add(title);
		
		f.add(top,"North");
		
		JPanel content=new JPanel();
		JRadioButton small=new JRadioButton("small");
		JRadioButton medium=new JRadioButton("mediun");
		JRadioButton large=new JRadioButton("large");

		JCheckBox c1=new JCheckBox("안녕");
		JCheckBox c2=new JCheckBox("안녕");
		JCheckBox c3=new JCheckBox("안녕");
		//ButtonGroup으로 묶어줘야함.  //그룹으로 묶인 것중에 하나 선택
		ButtonGroup size=new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		
		content.add(small);
		content.add(medium);
		content.add(large);
		
		//이미지 반영하기
		//이미지는 JLabel에 이미지 파일을 넣어서 구성
		
//		Image icon=new ImageIcon("peng.jpg").getImage();
		JLabel imageLa=new JLabel(new ImageIcon("peng.jpg"));
		
		
		
		//ComboBox
		String[] names= {"유병승","설진호","조현","이세현","강경록"};
		JComboBox<String> com=new JComboBox<String>(names); 
		com.setSelectedIndex(3);//콤보막스시작값
		content.add(com,"South");
		
		
		com.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> com=(JComboBox<String>)e.getSource();
				System.out.println(com.getSelectedItem());
			}
		});
		
		
//		com.addItemListener(new ItemListener() {
//			
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				System.out.println("변경했니??");
//				String text=(String)e.getItem();
//				System.out.println(text);
//				content.add(new JLabel(text));
//				content.revalidate();
//			}
//		});
		
		
		
		
		content.add(imageLa,"West");
		
		f.add(content,"Center");
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
