package com.mini.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.mini.controller.ChangePanelHandler;
import com.mini.controller.ChangePanelHandler2;
import com.rent.controller.Controller;
import com.rent.db.BookerDB;
import com.rent.model.vo.Booker;

public class Page2 extends JPanel {
	
	private JFrame main;
	private JPanel prev;
	private Calendar rentDay;
	private Calendar returnDay;

	
	private JComboBox<String> year;
	private JComboBox<String> month;
	private JComboBox<String> day;
	private JComboBox<String> hour;
	ArrayList search=new ArrayList();
	
	BookerDB  bd=new BookerDB();
	Controller c=new Controller();
	
	public Page2(JFrame main, JPanel prev)  {
		
		this.main=main;
		this.prev=prev;
		
		setLayout(null);
		setSize(1200,800);
		setBackground(Color.darkGray);
		
		 JPanel title = new JPanel();
		 title.setBounds(0, 0, 1200, 100);
		 title.setBackground(new Color(204,51,51));
		 add(title);
		 title.setLayout(null);
		    
		 JLabel titleText = new JLabel("�� �� ȭ ��");
		 titleText.setForeground(Color.WHITE);
		 titleText.setBounds(0, 0, 1200, 100);
		 titleText.setFont(new Font("���ü", Font.PLAIN, 50));
		 titleText.setHorizontalAlignment(SwingConstants.CENTER);
		 title.add(titleText);
		
		 JPanel panelDate = new JPanel();
		    panelDate.setBackground(Color.WHITE);
		    panelDate.setBorder(new TitledBorder(new LineBorder(Color.BLACK)));
		    panelDate.setBounds(100, 130, 1000, 200);
		    add(panelDate);
		    panelDate.setLayout(null);
		  
		    JPanel panelDate2 = new JPanel();  
		    panelDate2.setBackground(Color.WHITE);
		    panelDate2.setBounds(0, 0, 1000, 50);
		    panelDate.add(panelDate2);
		    panelDate2.setBorder(new TitledBorder(new LineBorder(Color.BLACK)));
		    panelDate2.setLayout(null);
		    
		    JLabel datetxt= new JLabel("��¥ ����");
		    datetxt.setBounds(409, 6, 170, 45);
		    panelDate2.add(datetxt);
		    datetxt.setHorizontalAlignment(SwingConstants.CENTER);
		    datetxt.setFont(new Font("���ü", Font.PLAIN, 35));
		    
		    //�뿩��
		    JLabel rentDate = new JLabel("�뿩��");
		    rentDate.setFont(new Font("���ü", Font.PLAIN, 30));
		    rentDate.setBounds(39, 67, 90, 40);
		    panelDate.add(rentDate);

		    //�뿩(�⵵)
		    String [] years={"2020", "2021", "2023"};
		    year = new JComboBox<String>(years);
			year.setBounds(180, 67, 120, 40);
			year.setFont(new Font("���ü", Font.PLAIN, 30));
			panelDate.add(year);

		    //�뿩(��)
			String [] months={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
			month = new JComboBox<String>(months);
		    month.setBounds(386, 67, 120, 40);
		    month.setFont(new Font("���ü", Font.PLAIN, 30));
		    panelDate.add(month);
		    
		    
		    //�뿩(��)
		    String [] days={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		    day = new JComboBox<String>(days);
		    day.setBounds(595, 67, 120, 40);
		    day.setFont(new Font("���ü", Font.PLAIN, 30));
		    panelDate.add(day);
		    	  
		    //�뿩(�ð� )
		    String [] hours={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"};
		    hour = new JComboBox<String>(hours);
		    hour.setBounds(803, 67, 120, 40);
		    hour.setFont(new Font("���ü", Font.PLAIN, 30));
			panelDate.add(hour);
		      
		    
		    //�뿩 ����Ͻ� �ؽ�Ʈ 
		    
		    JLabel yearTxt = new JLabel("��");
		    yearTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    yearTxt.setFont(new Font("���ü", Font.PLAIN, 30));
		    yearTxt.setBounds(312, 67, 30, 40);
		    panelDate.add(yearTxt);
		    
		    JLabel monthTxt = new JLabel("��");
		    monthTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    monthTxt.setFont(new Font("���ü", Font.PLAIN, 30));
		    monthTxt.setBounds(516, 67, 30, 40);
		    panelDate.add(monthTxt);
		    
		    JLabel dayTxt = new JLabel("��");
		    dayTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    dayTxt.setFont(new Font("���ü", Font.PLAIN, 30));
		    dayTxt.setBounds(725, 67, 30, 40);
		    panelDate.add(dayTxt);
		    
		    JLabel hourTxt = new JLabel("��");
		    hourTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    hourTxt.setFont(new Font("���ü", Font.PLAIN, 30));
		    hourTxt.setBounds(933, 67, 30, 40);
		    panelDate.add(hourTxt);
		    
		    
		    //�ݳ� 
		    
		    
		    JLabel returnDate = new JLabel("�ݳ���");
		    returnDate.setFont(new Font("���ü", Font.PLAIN, 30));
		    returnDate.setBounds(39, 135, 90, 40);
		    panelDate.add(returnDate);


		
		    //�ݳ� ��
		    String [] reYears={"2020", "2021", "2023"};
		    JComboBox<String> reYear = new JComboBox<String>(reYears);
		    reYear.setBounds(180, 133, 120, 40);
		    reYear.setFont(new Font("���ü", Font.PLAIN, 30));
		    panelDate.add(reYear);

		    //�ݳ� ��
		    String [] reMonths={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		    JComboBox<String> reMonth = new JComboBox<String>(reMonths);
		    reMonth.setBounds(386, 133, 120, 40);
		    reMonth.setFont(new Font("���ü", Font.PLAIN, 30));
		    panelDate.add(reMonth);
		   
		    
		    
		    //�ݳ� ��
		    String [] reDays={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		    JComboBox<String> reDay = new JComboBox<String>(reDays);
		    reDay.setBounds(595, 133, 120, 40);
		    reDay.setFont(new Font("���ü", Font.PLAIN, 30));
		    panelDate.add(reDay);
		    
		    
		    //�ݳ� ��
		    String [] reHours={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"};
		    JComboBox<String> reHour = new JComboBox<String>(reHours);
		    reHour.setBounds(803, 133, 120, 40);
		    reHour.setFont(new Font("���ü", Font.PLAIN, 30));
		    panelDate.add(reHour);
		    
		    //�ݳ� ����Ͻ� �ؽ�Ʈ 
		    
		    JLabel ryearTxt = new JLabel("��");
		    ryearTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    ryearTxt.setFont(new Font("���ü", Font.PLAIN, 30));
		    ryearTxt.setBounds(312, 135, 30, 40);
		    panelDate.add(ryearTxt);
		    
		    JLabel rmonthTxt = new JLabel("��");
		    rmonthTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    rmonthTxt.setFont(new Font("���ü", Font.PLAIN, 30));
		    rmonthTxt.setBounds(516, 135, 30, 40);
		    panelDate.add(rmonthTxt);
		    
		    JLabel rdayTxt = new JLabel("��");
		    rdayTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    rdayTxt.setFont(new Font("���ü", Font.PLAIN, 30));
		    rdayTxt.setBounds(725, 135, 30, 40);
		    panelDate.add(rdayTxt);
		    
		    JLabel rhourTxt = new JLabel("��");
		    rhourTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    rhourTxt.setFont(new Font("���ü", Font.PLAIN, 30));
		    rhourTxt.setBounds(933, 135, 30, 40);
		    panelDate.add(rhourTxt);

		    
		    	    
		    //�������� �г�
		    JPanel panelTitle = new JPanel();
		    panelTitle.setLayout(null);
		    panelTitle.setBorder(new TitledBorder(new LineBorder(Color.BLACK)));
		    panelTitle.setBackground(Color.WHITE);
		    panelTitle.setBounds(100, 360, 1000, 200);
		    add(panelTitle);
		    
		    //�������� ��
			JLabel carType = new JLabel("���� ����");
			carType.setBounds(395, 6, 175, 45);
		 	panelTitle.add(carType);
			carType.setHorizontalAlignment(SwingConstants.CENTER);
			carType.setFont(new Font("���ü", Font.PLAIN, 35));
		    
			//��������
		    JPanel panelTitle2 = new JPanel();
		    panelTitle2.setLayout(null);
		    panelTitle2.setBorder(new TitledBorder(new LineBorder(Color.BLACK)));
		    panelTitle2.setBackground(Color.WHITE);
		    panelTitle2.setBounds(0, 0, 1000, 50);
		    panelTitle.add(panelTitle2);
			

		    //������ �׸� ����
			JLabel car1=new JLabel(new ImageIcon("small.jpg"));
			car1.setBounds(150, 70, 100, 70);
		    panelTitle.add(car1);
		    
		    JLabel car2=new JLabel(new ImageIcon("mid.jpg"));
		    car2.setBounds(410, 70, 160, 70);
		    panelTitle.add(car2);
		    
		    JLabel car3=new JLabel(new ImageIcon("large.jpg"));
		    car3.setBounds(720, 70, 160, 70);
		    panelTitle.add(car3);
		    
			//������ ������ư 
			JRadioButton smallRadio = new JRadioButton("����");
		    smallRadio.setFont(new Font("���ü", Font.PLAIN, 20));
		    smallRadio.setHorizontalAlignment(SwingConstants.CENTER);
		    smallRadio.setBackground(Color.WHITE);
		    smallRadio.setBounds(141, 159, 121, 23);
		    panelTitle.add(smallRadio);
		    
		    JRadioButton medRadio = new JRadioButton("����");
		    medRadio.setFont(new Font("���ü", Font.PLAIN, 20));
		    medRadio.setBackground(Color.WHITE);
		    medRadio.setHorizontalAlignment(SwingConstants.CENTER);
		    medRadio.setBounds(441, 159, 121, 23);
		    panelTitle.add(medRadio);
		    
		    JRadioButton larRadio = new JRadioButton("����");
		    larRadio.setFont(new Font("���ü", Font.PLAIN, 20));
		    larRadio.setHorizontalAlignment(SwingConstants.CENTER);
		    larRadio.setBackground(Color.WHITE);
		    larRadio.setBounds(744, 159, 121, 23);
		    panelTitle.add(larRadio);
		    
		    //��ư �׷�ȭ
			ButtonGroup group= new ButtonGroup();
			group.add(smallRadio);
			group.add(medRadio);
			group.add(larRadio);
		    
		    
		    
		    //����&���� ��ư 
		    JButton preBtn = new JButton("��������");
		    preBtn.setFont(new Font("���ü", Font.PLAIN, 20));
		    preBtn.setForeground(Color.WHITE);
		    preBtn.setBackground(new Color(204,51,51));
		    preBtn.setBounds(300, 670, 200, 70);
		    add(preBtn);
		    
		    preBtn.addMouseListener(new ChangePanelHandler2(main, this, prev));

		    JButton nextBtn = new JButton("��������");
		    nextBtn.setFont(new Font("���ü", Font.PLAIN, 20));
		    nextBtn.setForeground(Color.WHITE);
		    nextBtn.setBackground(new Color(204,51,51));
		    nextBtn.setBounds(700, 670, 200, 70);
		    add(nextBtn);
		    

		    
		    //�뿩��&�ݳ��� �ܼ�â�� ����ϱ�
		    nextBtn.addMouseListener(new MouseAdapter() {
		    	@Override
		         public void mouseClicked(MouseEvent e) {
					//�뿩�Ͽ� ���ֱ�
					int y=Integer.parseInt((String)year.getSelectedItem());
					int m=Integer.parseInt((String)month.getSelectedItem());
					int d=Integer.parseInt((String)day.getSelectedItem());
					int h=Integer.parseInt((String)hour.getSelectedItem());
					rentDay=c.cl(y, m-1, d, h);
					SimpleDateFormat sdf=new SimpleDateFormat("YY��MM��dd��HH��");
					System.out.println(sdf.format(rentDay.getTimeInMillis()));

					//�ݳ��Ͽ� ���ֱ�
					int reY=Integer.parseInt((String)reYear.getSelectedItem());
					int reM=Integer.parseInt((String)reMonth.getSelectedItem());
					int reD=Integer.parseInt((String)reDay.getSelectedItem());
					int reH=Integer.parseInt((String)reHour.getSelectedItem());
					returnDay=c.cl(reY, reM-1, reD, reH);
					System.out.println(sdf.format(returnDay.getTimeInMillis()));
						
					String type=null;//�߰��Ѻκ� =null;
		    		if(smallRadio.isSelected()) {
		    			type="����";
		    			System.out.println(type);
		    		}else if(medRadio.isSelected()) {
		    			type="����";
		    			System.out.println(type);
		    		}else if(larRadio.isSelected()) {
		    			type="����";
		    			System.out.println(type);
		    		}
		    		
		    		//�����ڻ���
		    		Booker booker=new Booker(type,null,null, 0,null,null,rentDay,returnDay,null,null,null,null);

		    		bd.plus(booker);
		    		c.searchCar(type);
		    		Controller.setReserveNo(new Controller().reserveNum());
		    	}	
		    
		    	
		      });
		    
		   
		    nextBtn.addMouseListener(new ChangePanelHandler(main, this, null));
		    

		    
	}
	
}
