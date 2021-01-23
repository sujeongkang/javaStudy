package com.mini.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.mini.controller.ChangePanelHandler;
import com.mini.controller.ChangePanelHandler2;
import com.rent.controller.Controller;
import com.rent.db.BookerDB;
import com.rent.db.CarDB;
import com.rent.model.vo.Booker;
import com.rent.model.vo.Car;

public class Page3 extends JPanel {

	
	private JFrame frame;
	
	Controller cl=new Controller();
	BookerDB bd=MainFrame.getDB();
	ArrayList car;
	ArrayList booker;
	JPanel prev;
	public Page3(JFrame frame,JPanel prev) {
		
	this.frame=frame;
	booker=BookerDB.getBk();
	Booker b=(Booker)(booker.get(booker.size()-1));
		
//	JPanel search = new JPanel();
	setBounds(0, 0, 1200, 800);
	setLayout(null);
	//frame.getContentPane().add(search);
	
	
	
	//Å« ±¸È¹
	//Á¦¸ñÄ­
	JPanel searchTitle = new JPanel();
	searchTitle.setLayout(null);
	searchTitle.setBounds(0, 0, 1200, 100);
	searchTitle.setBackground(new Color(204,51,51));
	add(searchTitle);
	//³»¿ëÄ­
	JPanel carBox1 = new JPanel();
	carBox1.setLayout(new GridLayout(3,1,0,0));
	carBox1.setBounds(0, 100, 1200, 700);
	carBox1.setBackground(Color.darkGray);
	add(carBox1);
	
	
	//Å¸ÀÌÆ² ÅØ½ºÆ®
	JLabel titleText = new JLabel("\uCC28\uB7C9 \uC870\uD68C \uD654\uBA74");
//	titleText.setBackground(Color.WHITE);
	titleText.setForeground(Color.WHITE);
	titleText.setBounds(0, 0, 1200, 100);
	titleText.setFont(new Font("°íµñÃ¼", Font.PLAIN, 50));
	titleText.setHorizontalAlignment(SwingConstants.CENTER);
	searchTitle.add(titleText);
	add(searchTitle);

	//ÀÌÀü¹öÆ°
	JButton returnBtn = new JButton("\uC774\uC804");
	returnBtn.setForeground(Color.WHITE);
	returnBtn.setFont(new Font("°íµñÃ¼", Font.PLAIN, 25));
	returnBtn.setBackground(Color.darkGray);
	returnBtn.setBounds(41, 20, 205, 55);
	searchTitle.add(returnBtn);
	returnBtn.addMouseListener(new MouseAdapter() {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			CarDB.search.clear();
			BookerDB.getBk().remove(BookerDB.getBk().size()-1);
			
			}
		
	});
	returnBtn.addMouseListener(new ChangePanelHandler(frame, this, prev));
	
	
	
	//Â÷ ÆÇ³Ú
	
	//ÄíÆÛ
	JPanel car1 = new JPanel();
	car1.setSize(1200, 220);
	car1.setLocation(0, 0);
	car1.setLayout(null);
	car1.setBorder(new LineBorder(new Color(0, 0, 0)));
	car1.setBackground(Color.WHITE);
	JButton btn1 = new JButton("\uC608 \uC57D");
	btn1.addMouseListener(new MouseAdapter() {
		
		@Override
		public void mouseClicked(MouseEvent e) {

			cl.saveCar("ÄíÆÛ");
			
			}
		
	});
	car1.add(btn1);
	btn1.addMouseListener(new ChangePanelHandler(frame, this, new Page4(frame,this)));
	
	
	btn1.setBackground(new Color(204,51,51));
	btn1.setForeground(Color.WHITE);
	btn1.setFont(new Font("°íµñÃ¼", Font.PLAIN, 40));
	btn1.setBounds(957, 24, 200, 164);

	JLabel price1 = new JLabel("65,000\uC6D0");
	price1.setHorizontalAlignment(SwingConstants.RIGHT);
	price1.setFont(new Font("°íµñÃ¼", Font.BOLD, 55));
	price1.setBounds(598, 116, 310, 72);
	car1.add(price1);

	JLabel carPicture1 = new JLabel("");
	carPicture1.setIcon(new ImageIcon("Cooper.png"));
	carPicture1.setHorizontalAlignment(SwingConstants.CENTER);
	carPicture1.setBounds(14, 5, 400, 205);
	car1.add(carPicture1);

	JLabel carName1 = new JLabel("\uCFE0\uD37C");
	carName1.setFont(new Font("°íµñÃ¼", Font.BOLD, 43));
	carName1.setBounds(438, 98, 187, 60);
	car1.add(carName1);

	JLabel fuel1 = new JLabel("");
	fuel1.setIcon(new ImageIcon("g.png"));
	fuel1.setHorizontalAlignment(SwingConstants.CENTER);
	fuel1.setBounds(714, 43, 60, 60);
	car1.add(fuel1);

	JLabel brand1 = new JLabel("\uBBF8\uB2C8\uCFE0\uD398");
	brand1.setFont(new Font("°íµñÃ¼", Font.PLAIN, 20));
	brand1.setIcon(new ImageIcon("mini.png"));
	brand1.setBounds(428, 46, 168, 39);
	car1.add(brand1);

	JLabel people1 = new JLabel("");
	people1.setIcon(new ImageIcon("p5.PNG"));
	people1.setHorizontalAlignment(SwingConstants.CENTER);
	people1.setBounds(806, 43, 72, 72);
	car1.add(people1);
	
//	carBox1.add(car1, gbc_car1);
//	car1.setVisible(false);
	
	
	//½ºÆÄÅ©
	JPanel car2 = new JPanel();
	car2.setSize(1200, 220);
	car2.setBorder(new LineBorder(new Color(0, 0, 0)));
	car2.setBackground(Color.WHITE);
	car2.setLayout(null);

	JLabel price2 = new JLabel("50,000\uC6D0");
	price2.setHorizontalAlignment(SwingConstants.RIGHT);
	price2.setFont(new Font("°íµñÃ¼", Font.BOLD, 55));
	price2.setBounds(598, 116, 310, 72);
	car2.add(price2);

	JButton btn2 = new JButton("\uC608 \uC57D");
	btn2.setBackground(new Color(204,51,51));
	btn2.setForeground(Color.WHITE);
	btn2.setFont(new Font("°íµñÃ¼", Font.PLAIN, 45));
	btn2.setBounds(957, 24, 200, 164);
	btn2.addMouseListener(new ChangePanelHandler(frame, this, new Page4(frame,this)));
	btn2.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
//			b.setModel("½ºÆÄÅ©");
//			b.setBrand("½¦º¸·¹");
//			b.setPrice(50000);
			cl.saveCar("½ºÆÄÅ©");

		
			
		}
	});
	car2.add(btn2);
	JLabel carPicture2 = new JLabel("");
	carPicture2.setHorizontalAlignment(SwingConstants.CENTER);
	carPicture2.setIcon(new ImageIcon("spark.png"));
	carPicture2.setBounds(14, 5, 400, 205);
	car2.add(carPicture2);

	JLabel fuel2 = new JLabel("");
	fuel2.setIcon(new ImageIcon("g.png"));
	fuel2.setHorizontalAlignment(SwingConstants.CENTER);
	fuel2.setBounds(714, 43, 60, 60);
	car2.add(fuel2);

	JLabel brand2 = new JLabel("\uC250\uBCF4\uB808");
	brand2.setIcon(new ImageIcon("chevrolet.png"));
	brand2.setFont(new Font("°íµñÃ¼", Font.PLAIN, 20));
	brand2.setBounds(428, 46, 168, 39);
	car2.add(brand2);

	JLabel carName2 = new JLabel("\uC2A4\uD30C\uD06C");
	carName2.setFont(new Font("°íµñÃ¼", Font.BOLD, 43));
	carName2.setBounds(438, 98, 187, 60);
	car2.add(carName2);

	JLabel people2 = new JLabel("");
	people2.setIcon(new ImageIcon("p5.PNG"));
	people2.setHorizontalAlignment(SwingConstants.CENTER);
	people2.setBounds(806, 43, 72, 72);
	car2.add(people2);
	
	
//	carBox1.add(car2);
	car2.setVisible(false);
	
	
	
	//¸ð´×
	JPanel car3 = new JPanel();
	car3.setSize(1200, 220);
	car3.setBorder(new LineBorder(new Color(0, 0, 0)));
	car3.setBackground(Color.WHITE);
	car3.setLayout(null);

	JLabel price3 = new JLabel("50,000\uC6D0");
	price3.setHorizontalAlignment(SwingConstants.RIGHT);
	price3.setFont(new Font("°íµñÃ¼", Font.BOLD, 55));
	price3.setBounds(598, 116, 310, 72);
	car3.add(price3);

	JButton btn3 = new JButton("\uC608 \uC57D");
	btn3.setBackground(new Color(204,51,51));
	btn3.setForeground(Color.WHITE);
	btn3.setFont(new Font("¹®Ã¼ºÎ Á¦¸ñ µ¸À½Ã¼", Font.PLAIN, 45));
	btn3.setBounds(957, 24, 200, 164);
	
	btn3.addMouseListener(new ChangePanelHandler(frame, this, new Page4(frame,this)));
	btn3.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
//			b.setModel("¸ð´×");
//			b.setBrand("±â¾Æ");
//			b.setPrice(50000);
			cl.saveCar("¸ð´×");
		}
	});
	
	car3.add(btn3);

	JLabel carPicture3 = new JLabel("");
	carPicture3.setBounds(14, 7, 400, 205);
	car3.add(carPicture3);
	carPicture3.setIcon(new ImageIcon("morning.png"));
	carPicture3.setHorizontalAlignment(SwingConstants.CENTER);

	JLabel fuel3 = new JLabel("");
	fuel3.setIcon(new ImageIcon("g.png"));
	fuel3.setHorizontalAlignment(SwingConstants.CENTER);
	fuel3.setBounds(714, 43, 60, 60);
	car3.add(fuel3);

	JLabel carName3 = new JLabel("\uBAA8\uB2DD");//     
	carName3.setFont(new Font("°íµñÃ¼", Font.BOLD, 43));
	carName3.setBounds(438, 98, 187, 60);
	car3.add(carName3);

	JLabel brand3 = new JLabel("\uAE30\uC544");
	brand3.setIcon(new ImageIcon("kia.png"));
	brand3.setFont(new Font("°íµñÃ¼", Font.PLAIN, 20));
	brand3.setBounds(428, 46, 168, 39);
	car3.add(brand3);
	JLabel people = new JLabel("");
	people.setIcon(new ImageIcon("p5.PNG"));
	people.setHorizontalAlignment(SwingConstants.CENTER);
	people.setBounds(806, 43, 72, 72);
	car3.add(people);

//	carBox1.add(car3, gbc_car3);
	car3.setVisible(false);
	
	
	
	//¾Æ¿ìµðA5
	JPanel car4 = new JPanel();
	car4.setSize(1200, 220);
	car4.setLayout(null);
	car4.setBorder(new LineBorder(new Color(0, 0, 0)));
	car4.setBackground(Color.WHITE);
	
	JButton btn4 = new JButton("\uC608 \uC57D");
	btn4.setForeground(Color.WHITE);
	btn4.setFont(new Font("°íµñÃ¼", Font.PLAIN, 40));
	btn4.setBackground(new Color(204,51,51));
	btn4.setBounds(957, 24, 200, 164);
	btn4.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
//			b.setModel("¾Æ¿ìµðA5");
//			b.setBrand("¾Æ¿ìµð");
//			b.setPrice(75000);
			cl.saveCar("¾Æ¿ìµðA5");
		}
	});
	btn4.addMouseListener(new ChangePanelHandler(frame, this, new Page4(frame,this)));
	car4.add(btn4);

	JLabel price4 = new JLabel("75,000\uC6D0");
	price4.setHorizontalAlignment(SwingConstants.RIGHT);
	price4.setFont(new Font("°íµñÃ¼", Font.BOLD, 55));
	price4.setBounds(598, 116, 310, 72);
	car4.add(price4);

	JLabel picture4 = new JLabel("");
	picture4.setIcon(new ImageIcon("A5.png"));
	picture4.setHorizontalAlignment(SwingConstants.CENTER);
	picture4.setBounds(14, 7, 400, 205);
	car4.add(picture4);

	JLabel carName4 = new JLabel("\uC544\uC6B0\uB514A5");
	carName4.setFont(new Font("°íµñÃ¼", Font.BOLD, 33));
	carName4.setBounds(438, 98, 187, 60);
	car4.add(carName4);

	JLabel fuel4 = new JLabel("");
	fuel4.setIcon(new ImageIcon("g.png"));
	fuel4.setHorizontalAlignment(SwingConstants.CENTER);
	fuel4.setBounds(714, 43, 59, 60);
	car4.add(fuel4);

	JLabel brand4 = new JLabel("\uC544\uC6B0\uB514");
	brand4.setIcon(new ImageIcon("audi.png"));
	brand4.setFont(new Font("°íµñÃ¼", Font.PLAIN, 20));
	brand4.setBounds(428, 46, 168, 39);
	car4.add(brand4);

	JLabel people4 = new JLabel("");
	people4.setIcon(new ImageIcon("p5.PNG"));
	people4.setHorizontalAlignment(SwingConstants.CENTER);
	people4.setBounds(806, 43, 72, 72);
	car4.add(people4);

//	carBox1.add(car4, gbc_car4);
	car4.setVisible(false);

	
	
	//·£µå·Î¹öµðÆæ´õ110
	JPanel car5 = new JPanel();
	car5.setSize(1200, 220);
	car5.setLayout(null);
	car5.setBorder(new LineBorder(new Color(0, 0, 0)));
	car5.setBackground(Color.WHITE);

	JButton btn5 = new JButton("\uC608 \uC57D");
	btn5.setForeground(Color.WHITE);
	btn5.setFont(new Font("°íµñÃ¼", Font.PLAIN, 40));
	btn5.setBackground(new Color(204,51,51));
	btn5.setBounds(957, 24, 200, 164);
	btn5.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
//			b.setModel("·£µå·Î¹öµðÆæ´õ110");
//			b.setBrand("·£µå·Î¹ö");
//			b.setPrice(85000);
			cl.saveCar("·£µå·Î¹öµðÆæ´õ110");
		}
	});
	btn5.addMouseListener(new ChangePanelHandler(frame, this, new Page4(frame,this)));
	car5.add(btn5);

	JLabel price5 = new JLabel("85,000\uC6D0");
	price5.setHorizontalAlignment(SwingConstants.RIGHT);
	price5.setFont(new Font("°íµñÃ¼", Font.BOLD, 55));
	price5.setBounds(598, 116, 310, 72);
	car5.add(price5);

	JLabel picture5 = new JLabel("");
	picture5.setIcon(new ImageIcon("d110.png"));
	picture5.setHorizontalAlignment(SwingConstants.CENTER);
	picture5.setBounds(14, 7, 400, 205);
	car5.add(picture5);

	JLabel carName5 = new JLabel("\uB79C\uB4DC\uB85C\uBC84\uB514\uD39C\uB354110");
	carName5.setFont(new Font("°íµñÃ¼", Font.BOLD, 30));
	carName5.setBounds(392, 98, 284, 60);
	car5.add(carName5);

	JLabel fuel5 = new JLabel("");
	fuel5.setIcon(new ImageIcon("d.png"));
	fuel5.setHorizontalAlignment(SwingConstants.CENTER);
	fuel5.setBounds(714, 43, 60, 60);
	car5.add(fuel5);

	JLabel brand5 = new JLabel("\uB79C\uB4DC\uB85C\uBC84");
	brand5.setIcon(new ImageIcon("rand.png"));
	brand5.setFont(new Font("°íµñÃ¼", Font.PLAIN, 20));
	brand5.setBounds(392, 46, 168, 39);
	car5.add(brand5);

	JLabel people5 = new JLabel("");
	people5.setIcon(new ImageIcon("p5.PNG"));
	people5.setHorizontalAlignment(SwingConstants.CENTER);
	people5.setBounds(806, 43, 72, 72);
	car5.add(people5);

//	carBox1.add(car5, gbc_car5);
	car5.setVisible(false);
	
	
	//¾Æ¹Ý¶¼
	JPanel car6 = new JPanel();
	car6.setSize(1200, 220);
	car6.setLayout(null);
	car6.setBorder(new LineBorder(new Color(0, 0, 0)));
	car6.setBackground(Color.WHITE);
	
	JButton btn6 = new JButton("\uC608 \uC57D");
	btn6.setForeground(Color.WHITE);
	btn6.setFont(new Font("°íµñÃ¼", Font.PLAIN, 40));
	btn6.setBackground(new Color(204,51,51));
	btn6.setBounds(957, 24, 200, 164);
	btn6.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
//			b.setModel("¾Æ¹Ý¶¼");
//			b.setBrand("Çö´ë");
//			b.setPrice(70000);
			cl.saveCar("¾Æ¹Ý¶¼");
			
		}
	});
	btn6.addMouseListener(new ChangePanelHandler(frame, this, new Page4(frame,this)));
	car6.add(btn6);

	JLabel price6 = new JLabel("70,000\uC6D0");
	price6.setHorizontalAlignment(SwingConstants.RIGHT);
	price6.setFont(new Font("°íµñÃ¼", Font.BOLD, 55));
	price6.setBounds(598, 116, 310, 72);
	car6.add(price6);

	JLabel picture6 = new JLabel("");
	picture6.setIcon(new ImageIcon("AVANTE.png"));
	picture6.setHorizontalAlignment(SwingConstants.CENTER);
	picture6.setBounds(14, 7, 400, 205);
	car6.add(picture6);

	JLabel carName6 = new JLabel("\uC544\uBC18\uB5BC");
	carName6.setFont(new Font("°íµñÃ¼", Font.BOLD, 43));
	carName6.setBounds(438, 98, 187, 60);
	car6.add(carName6);

	JLabel fuel6 = new JLabel("");
	fuel6.setIcon(new ImageIcon("g.png"));
	fuel6.setHorizontalAlignment(SwingConstants.CENTER);
	fuel6.setBounds(714, 43, 60, 60);
	car6.add(fuel6);

	JLabel brand6 = new JLabel("\uD604\uB300");
	brand6.setIcon(new ImageIcon("hyendai.png"));
	brand6.setFont(new Font("°íµñÃ¼", Font.PLAIN, 20));
	brand6.setBounds(428, 46, 168, 39);
	car6.add(brand6);

	JLabel people6 = new JLabel("");
	people6.setIcon(new ImageIcon("p5.PNG"));
	people6.setHorizontalAlignment(SwingConstants.CENTER);
	people6.setBounds(806, 43, 72, 72);
	car6.add(people6);

//	carBox1.add(car6, gbc_car6);
	car6.setVisible(false);
	
	
	//º¥Ã÷
	JPanel car7 = new JPanel();
	car7.setSize(1200, 220);
	car7.setLayout(null);
	car7.setBorder(new LineBorder(new Color(0, 0, 0)));
	car7.setBackground(Color.WHITE);
	
	JButton btn7 = new JButton("\uC608 \uC57D");
	btn7.setForeground(Color.WHITE);
	btn7.setFont(new Font("°íµñÃ¼", Font.PLAIN, 40));
	btn7.setBackground(new Color(204,51,51));
	btn7.setBounds(957, 24, 200, 164);
	btn7.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
//			b.setModel("º¥Ã÷GSLÅ¬·¡½º");
//			b.setBrand("º¥Ã÷");
//			b.setPrice(110000);
			cl.saveCar("º¥Ã÷GSLÅ¬·¡½º");
			
		}
	});
	btn7.addMouseListener(new ChangePanelHandler(frame, this, new Page4(frame,this)));
	car7.add(btn7);

	JLabel price7 = new JLabel("110,000\uC6D0");
	price7.setHorizontalAlignment(SwingConstants.RIGHT);
	price7.setFont(new Font("°íµñÃ¼", Font.BOLD, 55));
	price7.setBounds(598, 116, 310, 72);
	car7.add(price7);

	JLabel picture7 = new JLabel("");
	picture7.setIcon(new ImageIcon("benzGLS.png"));
	picture7.setHorizontalAlignment(SwingConstants.CENTER);
	picture7.setBounds(14, 7, 400, 205);
	car7.add(picture7);

	JLabel carName7 = new JLabel("\uBCA4\uCE20GSL\uD074\uB798\uC2A4");
	carName7.setFont(new Font("°íµñÃ¼", Font.BOLD, 30));
	carName7.setBounds(398, 98, 210, 60);
	car7.add(carName7);

	JLabel fuel7 = new JLabel("");
	fuel7.setIcon(new ImageIcon("d.png"));
	fuel7.setHorizontalAlignment(SwingConstants.CENTER);
	fuel7.setBounds(714, 43, 60, 60);
	car7.add(fuel7);

	JLabel brand7 = new JLabel("\uBCA4\uCE20");
	brand7.setIcon(new ImageIcon("benz.png"));
	brand7.setFont(new Font("°íµñÃ¼", Font.PLAIN, 20));
	brand7.setBounds(428, 46, 168, 39);
	car7.add(brand7);

	JLabel people7 = new JLabel("");
	people7.setIcon(new ImageIcon("p7.png"));
	people7.setHorizontalAlignment(SwingConstants.CENTER);
	people7.setBounds(806, 43, 72, 72);
	car7.add(people7);

//	carBox1.add(car7, gbc_car7);
	car7.setVisible(false);
	
	//K9
	JPanel car8 = new JPanel();
	car8.setSize(1200, 220);
	car8.setLayout(null);
	car8.setBorder(new LineBorder(new Color(0, 0, 0)));
	car8.setBackground(Color.WHITE);

	JButton btn8 = new JButton("\uC608 \uC57D");
	btn8.setForeground(Color.WHITE);
	btn8.setFont(new Font("°íµñÃ¼", Font.PLAIN, 40));
	btn8.setBackground(new Color(204,51,51));
	btn8.setBounds(957, 24, 200, 164);
	btn8.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
//			b.setModel("K9");
//			b.setBrand("±â¾Æ");
//			b.setPrice(90000);
			cl.saveCar("K9");

		}
	});
	btn8.addMouseListener(new ChangePanelHandler(frame, this, new Page4(frame,this)));
	car8.add(btn8);
	JLabel price8 = new JLabel("90,000\uC6D0");
	price8.setHorizontalAlignment(SwingConstants.RIGHT);
	price8.setFont(new Font("°íµñÃ¼", Font.BOLD, 55));
	price8.setBounds(598, 116, 310, 72);
	car8.add(price8);

	JLabel picture8 = new JLabel("");
	picture8.setIcon(new ImageIcon("K9.png"));
	picture8.setHorizontalAlignment(SwingConstants.CENTER);
	picture8.setBounds(14, 7, 400, 205);
	car8.add(picture8);

	JLabel carName8 = new JLabel("K9");
	carName8.setFont(new Font("°íµñÃ¼", Font.BOLD, 43));
	carName8.setBounds(438, 98, 187, 60);
	car8.add(carName8);

	JLabel fuel8 = new JLabel("");
	fuel8.setIcon(new ImageIcon("g.png"));
	fuel8.setHorizontalAlignment(SwingConstants.CENTER);
	fuel8.setBounds(714, 43, 60, 60);
	car8.add(fuel8);

	JLabel brand8 = new JLabel("\uAE30\uC544");
	brand8.setIcon(new ImageIcon("kia.png"));
	brand8.setFont(new Font("°íµñÃ¼", Font.PLAIN, 20));
	brand8.setBounds(428, 46, 168, 39);
	car8.add(brand8);

	JLabel people8 = new JLabel("");
	people8.setIcon(new ImageIcon("p5.PNG"));
	people8.setHorizontalAlignment(SwingConstants.CENTER);
	people8.setBounds(806, 43, 72, 72);
	car8.add(people8);

//	carBox1.add(car8, gbc_car8);
	car8.setVisible(false);
	
	//G90L
	JPanel car9 = new JPanel();
	car9.setSize(1200, 220);
	car9.setLayout(null);
	car9.setBorder(new LineBorder(new Color(0, 0, 0)));
	car9.setBackground(Color.WHITE);

	JButton btn9 = new JButton("\uC608 \uC57D");
	btn9.setForeground(Color.WHITE);
	btn9.setFont(new Font("°íµñÃ¼", Font.PLAIN, 40));
	btn9.setBackground(new Color(204,51,51));
	btn9.setBounds(957, 24, 200, 164);
	btn9.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {

			cl.saveCar("G90L");
		}
	});
	
	btn9.addMouseListener(new ChangePanelHandler(frame, this, new Page4(frame,this)));

	car9.add(btn9);

	JLabel price9 = new JLabel("100,000\uC6D0");
	price9.setHorizontalAlignment(SwingConstants.RIGHT);
	price9.setFont(new Font("°íµñÃ¼", Font.BOLD, 55));
	price9.setBounds(598, 116, 310, 72);
	car9.add(price9);

	JLabel picture9 = new JLabel("");
	picture9.setIcon(new ImageIcon("G90L.png"));
	picture9.setHorizontalAlignment(SwingConstants.CENTER);
	picture9.setBounds(14, 7, 400, 205);
	car9.add(picture9);

	JLabel carName9 = new JLabel("G90L");
	carName9.setFont(new Font("°íµñÃ¼", Font.BOLD, 43));
	carName9.setBounds(438, 98, 187, 60);
	car9.add(carName9);

	JLabel fuel9 = new JLabel("");
	fuel9.setIcon(new ImageIcon("g.png"));
	fuel9.setHorizontalAlignment(SwingConstants.CENTER);
	fuel9.setBounds(714, 43, 60, 60);
	car9.add(fuel9);

	JLabel brand9 = new JLabel("\uD604\uB300");
	brand9.setIcon(new ImageIcon("hyendai.png"));
	brand9.setFont(new Font("°íµñÃ¼", Font.PLAIN, 20));
	brand9.setBounds(428, 46, 168, 39);
	car9.add(brand9);

	JLabel people9 = new JLabel("");
	people9.setIcon(new ImageIcon("p5.png"));
	people9.setHorizontalAlignment(SwingConstants.CENTER);
	people9.setBounds(806, 43, 72, 72);
	car9.add(people9);

//	carBox1.add(car9, gbc_car9);
	car9.setVisible(false);

	
	//°ø¶õ
	JPanel car0 = new JPanel();
	car0.setBackground(Color.darkGray);
	car0.setLayout(null);

//	carBox1.add(car0, gbc_car0);
	car0.setVisible(false);
	
	
	



	
	car=CarDB.getSearch();

	for (Object o : car) {
		if (o instanceof Car) {
			Car cars = (Car) o;
			//System.out.println(cars.getModel());
			if (cars.getModel() != null) {
				if (cars.getModel().equals("ÄíÆÛ")) {
					carBox1.add(car1);
					car1.revalidate();
					car1.setVisible(true);
				} else if (cars.getModel().equals("½ºÆÄÅ©")) {
					carBox1.add(car2);
					car2.setVisible(true);
				} else if (cars.getModel().equals("¸ð´×")) {
					carBox1.add(car3);
					car3.setVisible(true);
				} else if (cars.getModel().equals("¾Æ¿ìµðA5")) {
					carBox1.add(car4);
					car4.setVisible(true);
				} else if (cars.getModel().equals("·£µå·Î¹öµðÆæ´õ110")) {
					carBox1.add(car5);
					car5.setVisible(true);
				} else if (cars.getModel().equals("¾Æ¹Ý¶¼")) {
					carBox1.add(car6);
					car6.setVisible(true);
				} else if (cars.getModel().equals("º¥Ã÷GSLÅ¬·¡½º")) {
					carBox1.add(car7);
					car7.setVisible(true);
				} else if (cars.getModel().equals("K9")) {
					carBox1.add(car8);
					car8.setVisible(true);
				} else if (cars.getModel().equals("G90L")) {
					carBox1.add(car9);
					car9.setVisible(true);
				}
			} else {
				carBox1.add(car0);
				car0.setVisible(true);
			}
		}
		carBox1.revalidate();
	}


	
	frame.getContentPane().add(this);

	
	
	
	
	}
}
