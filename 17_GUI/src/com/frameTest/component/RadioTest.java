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
		
		
		JFrame f=new JFrame("������ư");
		//���̾ƿ� �̼����� default ������ borderLayout ����
		f.setSize(100,150);
		
		
		JPanel top=new JPanel();
		JLabel title=new JLabel("�ũ�⸦ ���ϼ���?");
		top.add(title);
		
		f.add(top,"North");
		
		JPanel content=new JPanel();
		JRadioButton small=new JRadioButton("small");
		JRadioButton medium=new JRadioButton("mediun");
		JRadioButton large=new JRadioButton("large");

		JCheckBox c1=new JCheckBox("�ȳ�");
		JCheckBox c2=new JCheckBox("�ȳ�");
		JCheckBox c3=new JCheckBox("�ȳ�");
		//ButtonGroup���� ���������.  //�׷����� ���� ���߿� �ϳ� ����
		ButtonGroup size=new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		
		content.add(small);
		content.add(medium);
		content.add(large);
		
		//�̹��� �ݿ��ϱ�
		//�̹����� JLabel�� �̹��� ������ �־ ����
		
//		Image icon=new ImageIcon("peng.jpg").getImage();
		JLabel imageLa=new JLabel(new ImageIcon("peng.jpg"));
		
		
		
		//ComboBox
		String[] names= {"������","����ȣ","����","�̼���","�����"};
		JComboBox<String> com=new JComboBox<String>(names); 
		com.setSelectedIndex(3);//�޺��������۰�
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
//				System.out.println("�����ߴ�??");
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
