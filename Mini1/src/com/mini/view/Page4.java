package com.mini.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.mini.controller.ChangePanelHandler;
import com.mini.controller.ChangePanelHandler2;
import com.rent.db.BookerDB;
import com.rent.model.vo.Booker;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;


public class Page4 extends JPanel {

	private JFrame frame;
	private JPanel search;
	private ArrayList booker;
	private JPanel prev;
	BookerDB db=MainFrame.getDB();

	
	
	public Page4(JFrame frame,JPanel prev) {
		this.frame=frame;
		this.prev=prev;
		
		//라이센스 전체패널 틀
		JPanel license = new JPanel();
		setLayout(null);
		setBounds(0, 0, 1200, 800);
		setBackground(Color.darkGray);
//		frame.add(license);
		
		
		//라이센스 타이틀박스칸
		JPanel licenseTitleBox = new JPanel();
		licenseTitleBox.setBackground(new Color(204, 51, 51));
		licenseTitleBox.setBounds(0, 0, 1200, 100);
		add(licenseTitleBox);
		licenseTitleBox.setLayout(null);
		add(licenseTitleBox);
		
		//라이센스 타이틀 텍스트
		JLabel licenseTitle = new JLabel("\uC6B4\uC804\uBA74\uD5C8 \uC815\uBCF4\uB4F1\uB85D");
		licenseTitle.setBounds(0, 0, 1200, 100);
		licenseTitle.setHorizontalAlignment(SwingConstants.CENTER);
		licenseTitle.setForeground(Color.WHITE);
		licenseTitle.setFont(new Font("고딕체", Font.PLAIN, 50));
		licenseTitle.setBackground(Color.WHITE);
		
		licenseTitleBox.add(licenseTitle);
		
		
		
		
		//내용필드
		JPanel licensePanel = new JPanel();
		licensePanel.setBackground(Color.WHITE);
		licensePanel.setBounds(65, 170, 1063, 528);
		licensePanel.setLayout(null);
		add(licensePanel);
		
		//이름라벨
		JLabel nameLabel = new JLabel("* \uC774\uB984");
		nameLabel.setForeground(Color.BLACK);
		nameLabel.setFont(new Font("고딕체", Font.PLAIN, 25));
		nameLabel.setBounds(93, 55, 147, 55);
		licensePanel.add(nameLabel);
		
		//생일라벨
		JLabel birthLabel = new JLabel("* \uC0DD\uB144\uC6D4\uC77C");
		birthLabel.setForeground(Color.BLACK);
		birthLabel.setFont(new Font("고딕체", Font.PLAIN, 25));
		birthLabel.setBounds(93, 147, 235, 55);
		licensePanel.add(birthLabel);
		//전화번호라벨
		JLabel phoneLabel = new JLabel("* \uC804\uD654\uBC88\uD638");
		phoneLabel.setForeground(Color.BLACK);
		phoneLabel.setFont(new Font("고딕체", Font.PLAIN, 25));
		phoneLabel.setBounds(93, 239, 147, 55);
		licensePanel.add(phoneLabel);
		//라이센스라벨
		JLabel licenseLabel = new JLabel("* \uC6B4\uC804\uBA74\uD5C8\uBC88\uD638");
		licenseLabel.setForeground(Color.BLACK);
		licenseLabel.setFont(new Font("고딕체", Font.PLAIN, 25));
		licenseLabel.setBounds(93, 330, 205, 55);
		licensePanel.add(licenseLabel);
		
		


		//이름입력창
		JTextField nameField = new JTextField();
		nameField.setFont(new Font("고딕체", Font.PLAIN, 25));
		nameField.setBounds(305, 55, 406, 55);
		licensePanel.add(nameField);
		nameField.setColumns(10);
		
		//폰번호 입력창1,2
		JTextField phoneField1 = new JTextField();
		phoneField1.setFont(new Font("고딕체", Font.PLAIN, 25));
		phoneField1.setColumns(10);
		phoneField1.setBounds(445, 239, 112, 55);
		licensePanel.add(phoneField1);
		
		phoneField1.addKeyListener(new KeyAdapter() {
			@Override
			 public void keyReleased(KeyEvent e) {
				
				for(int i=0;i<(phoneField1.getText().length());i++) {
					
					char ch=(phoneField1.getText()).charAt(i);
					
					if ((!(ch >= 0x30 && ch <= 0x39))) {
							JOptionPane.showMessageDialog(frame,"잘못된 번호입니다","경고",JOptionPane.WARNING_MESSAGE);
							break;
						}

					}
			}
		
		});
		
		

		JTextField phoneField2 = new JTextField();
		phoneField2.setFont(new Font("고딕체", Font.PLAIN, 25));
		phoneField2.setColumns(10);
		phoneField2.setBounds(596, 239, 115, 55);
		licensePanel.add(phoneField2);
		phoneField2.addKeyListener(new KeyAdapter() {
			@Override
			 public void keyReleased(KeyEvent e) {
				
				for(int i=0;i<(phoneField2.getText().length());i++) {
					
					char ch=(phoneField2.getText()).charAt(i);
					
					if ((!(ch >= 0x30 && ch <= 0x39))) {
							JOptionPane.showMessageDialog(frame,"잘못된 번호입니다","경고",JOptionPane.WARNING_MESSAGE);
							break;
						}

					}
			}
		
		});
		
		//라이센스 입력창
		JTextField licenseField = new JTextField();
		licenseField.setFont(new Font("고딕체", Font.PLAIN, 25));
		licenseField.setColumns(10);
		licenseField.setBounds(303, 330, 408, 55);
		licensePanel.add(licenseField);
		
//		툴팁 띄우기		
		licenseField.setToolTipText("숫자만 입력해주세요");
		licenseField.setEnabled(true);
		licensePanel.add(licenseField);
		
		licenseField.addKeyListener(new KeyAdapter() {
			@Override
			 public void keyReleased(KeyEvent e) {
				//12
				for(int i=0;i<(licenseField.getText().length());i++) {
					
					char ch=(licenseField.getText()).charAt(i);
					
					if ((!(ch >= 0x30 && ch <= 0x39))||((licenseField.getText().length()>12))) {
							
							JOptionPane.showMessageDialog(frame,"숫자만 12개 입력해주세요","경고",JOptionPane.WARNING_MESSAGE);
							break;
						}

					}
			}
		
		});


	
		//포돌이 그림
		JLabel police = new JLabel("");
		police.setHorizontalAlignment(SwingConstants.CENTER);
		police.setIcon(new ImageIcon("police.png"));
		police.setBounds(790, 91, 243, 305);
		licensePanel.add(police);
		
		//마지막줄 경고문
		JLabel warning = new JLabel(
				"*\uD0C0\uC778\uC758 \uAC1C\uC778\uC815\uBCF4\uB97C \uB3C4\uC6A9\uC2DC \uD615\uC0AC\uCC98\uBC8C \uB420 \uC218 \uC788\uC2B5\uB2C8\uB2E4.");
		warning.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		warning.setForeground(new Color(204,51,51));
		warning.setBounds(283, 435, 508, 64);
		licensePanel.add(warning);
		
		
		//전화번호바'-'
		JLabel bar1 = new JLabel("-");
		bar1.setFont(new Font("고딕체", Font.PLAIN, 20));
		bar1.setBounds(417, 250, 22, 34);
		licensePanel.add(bar1);
		
		JLabel bar2 = new JLabel("-");
		bar2.setFont(new Font("고딕체", Font.PLAIN, 20));
		bar2.setBounds(571, 250, 22, 34);
		licensePanel.add(bar2);
		
		String[] num= {"02", "010", "011", "051", "053", "032", "062", "042", "052", "044", "031", "033", "043", "041", "063", "061", "054", "055", "064", "017", "019"};
		JComboBox fisthnum = new JComboBox(num);
		fisthnum.setFont(new Font("고딕체", Font.PLAIN, 25));
		fisthnum.setEditable(true);
		fisthnum.setSelectedIndex(1);
		fisthnum.setBounds(303, 239, 100, 55);
		licensePanel.add(fisthnum);
		
		
		
		//년월일 체크박스
		String[] years= {"1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013"};
		JComboBox yBox = new JComboBox(years);
		yBox.setSelectedIndex(30);
		yBox.setFont(new Font("고딕체", Font.PLAIN, 25));
		yBox.setEditable(true);
		yBox.setBounds(303, 147, 100, 55);
		licensePanel.add(yBox);
		
		String[]months= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		JComboBox mBox = new JComboBox(months);
		mBox.setSelectedIndex(0);
		mBox.setFont(new Font("고딕체", Font.PLAIN, 25));
		mBox.setEditable(true);
		mBox.setBounds(445, 147, 100, 55);
		licensePanel.add(mBox);
		
		String [] dates={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		JComboBox dBox = new JComboBox(dates);
		dBox.setSelectedIndex(0);
		dBox.setFont(new Font("고딕체", Font.PLAIN, 25));
		dBox.setEditable(true);
		dBox.setBounds(586, 147, 100, 55);
		licensePanel.add(dBox);
		
		
		//년,월,일 라벨
		JLabel y = new JLabel("\uB144");
		y.setFont(new Font("고딕체", Font.PLAIN, 20));
		y.setBounds(409, 158, 22, 34);
		licensePanel.add(y);
		
		JLabel m = new JLabel("\uC6D4");
		m.setFont(new Font("고딕체", Font.PLAIN, 20));
		m.setBounds(553, 158, 22, 34);
		licensePanel.add(m);
		
		JLabel d = new JLabel("\uC77C");
		d.setFont(new Font("고딕체", Font.PLAIN, 20));
		d.setBounds(689, 158, 22, 34);
		licensePanel.add(d);
		
		
		//다음버튼
		JButton nextBtn = new JButton("\uB2E4\uC74C");
		nextBtn.setForeground(Color.WHITE);
		nextBtn.setFont(new Font("고딕체", Font.PLAIN, 25));
		nextBtn.setBackground(new Color(204,51,51));
		nextBtn.setBounds(828, 442, 205, 55);
		licensePanel.add(nextBtn);
		
		
		nextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String phoneNum1 = fisthnum.getSelectedItem().toString();
				
				String biryear=yBox.getSelectedItem().toString();
				String birmonth=mBox.getSelectedItem().toString();
				String birdate=dBox.getSelectedItem().toString();
				
				String name=nameField.getText();
				String birthday=biryear+birmonth+birdate;
				String phone=phoneNum1+phoneField1.getText()+phoneField2.getText();
				String licenseNum=licenseField.getText();
			
				booker=BookerDB.getBk();
				Booker b=(Booker)(booker.get(booker.size()-1));
				
				b.setName(name);
				b.setBirthday(birthday);
				b.setPhone(phone);
				b.setLicense(licenseNum);
				
				System.out.println(b);
				
				 
			}
		});
		
		nextBtn.addMouseListener(new ChangePanelHandler(frame, this, new Page5(frame,this)));
		
		//이전버튼
		JButton returnBtn = new JButton("\uC774\uC804");
		returnBtn.setForeground(Color.WHITE);
		returnBtn.setFont(new Font("고딕체", Font.PLAIN, 25));
		returnBtn.setBackground(new Color(204,51,51));
		returnBtn.setBounds(41, 444, 205, 55);
		licensePanel.add(returnBtn);
		returnBtn.addMouseListener(new ChangePanelHandler2(frame, this, prev));
	}
}

