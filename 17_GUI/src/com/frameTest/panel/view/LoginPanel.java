package com.frameTest.panel.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {
	public LoginPanel() {
		setLayout(null);
		setSize(300,200);
		
		JLabel id=new JLabel("아이디 ");
		id.setLocation(10,20);
		id.setSize(80,40);
		
		JTextField idInput=new JTextField(10);
		idInput.setLocation(90,20);
		idInput.setSize(100,40);
		
		
		
		JLabel pw=new JLabel("비밀번호 ");
		pw.setLocation(10,60);
		pw.setSize(90,40);
		
		JPasswordField pwInput=new JPasswordField(10);
		pwInput.setLocation(100,60);
		pwInput.setSize(90,40);
		
		JButton btn=new JButton("로그인");
		btn.setLocation(190,60);
		btn.setSize(100,40);
		
		add(id);
		add(idInput);
		add(pw);
		add(pwInput);
		add(btn);
	}
}
