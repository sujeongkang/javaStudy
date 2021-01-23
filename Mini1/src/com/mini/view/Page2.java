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
		    
		 JLabel titleText = new JLabel("예 약 화 면");
		 titleText.setForeground(Color.WHITE);
		 titleText.setBounds(0, 0, 1200, 100);
		 titleText.setFont(new Font("고딕체", Font.PLAIN, 50));
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
		    
		    JLabel datetxt= new JLabel("날짜 선택");
		    datetxt.setBounds(409, 6, 170, 45);
		    panelDate2.add(datetxt);
		    datetxt.setHorizontalAlignment(SwingConstants.CENTER);
		    datetxt.setFont(new Font("고딕체", Font.PLAIN, 35));
		    
		    //대여일
		    JLabel rentDate = new JLabel("대여일");
		    rentDate.setFont(new Font("고딕체", Font.PLAIN, 30));
		    rentDate.setBounds(39, 67, 90, 40);
		    panelDate.add(rentDate);

		    //대여(년도)
		    String [] years={"2020", "2021", "2023"};
		    year = new JComboBox<String>(years);
			year.setBounds(180, 67, 120, 40);
			year.setFont(new Font("고딕체", Font.PLAIN, 30));
			panelDate.add(year);

		    //대여(월)
			String [] months={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
			month = new JComboBox<String>(months);
		    month.setBounds(386, 67, 120, 40);
		    month.setFont(new Font("고딕체", Font.PLAIN, 30));
		    panelDate.add(month);
		    
		    
		    //대여(일)
		    String [] days={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		    day = new JComboBox<String>(days);
		    day.setBounds(595, 67, 120, 40);
		    day.setFont(new Font("고딕체", Font.PLAIN, 30));
		    panelDate.add(day);
		    	  
		    //대여(시간 )
		    String [] hours={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"};
		    hour = new JComboBox<String>(hours);
		    hour.setBounds(803, 67, 120, 40);
		    hour.setFont(new Font("고딕체", Font.PLAIN, 30));
			panelDate.add(hour);
		      
		    
		    //대여 년월일시 텍스트 
		    
		    JLabel yearTxt = new JLabel("년");
		    yearTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    yearTxt.setFont(new Font("고딕체", Font.PLAIN, 30));
		    yearTxt.setBounds(312, 67, 30, 40);
		    panelDate.add(yearTxt);
		    
		    JLabel monthTxt = new JLabel("월");
		    monthTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    monthTxt.setFont(new Font("고딕체", Font.PLAIN, 30));
		    monthTxt.setBounds(516, 67, 30, 40);
		    panelDate.add(monthTxt);
		    
		    JLabel dayTxt = new JLabel("일");
		    dayTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    dayTxt.setFont(new Font("고딕체", Font.PLAIN, 30));
		    dayTxt.setBounds(725, 67, 30, 40);
		    panelDate.add(dayTxt);
		    
		    JLabel hourTxt = new JLabel("시");
		    hourTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    hourTxt.setFont(new Font("고딕체", Font.PLAIN, 30));
		    hourTxt.setBounds(933, 67, 30, 40);
		    panelDate.add(hourTxt);
		    
		    
		    //반납 
		    
		    
		    JLabel returnDate = new JLabel("반납일");
		    returnDate.setFont(new Font("고딕체", Font.PLAIN, 30));
		    returnDate.setBounds(39, 135, 90, 40);
		    panelDate.add(returnDate);


		
		    //반납 년
		    String [] reYears={"2020", "2021", "2023"};
		    JComboBox<String> reYear = new JComboBox<String>(reYears);
		    reYear.setBounds(180, 133, 120, 40);
		    reYear.setFont(new Font("고딕체", Font.PLAIN, 30));
		    panelDate.add(reYear);

		    //반납 월
		    String [] reMonths={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		    JComboBox<String> reMonth = new JComboBox<String>(reMonths);
		    reMonth.setBounds(386, 133, 120, 40);
		    reMonth.setFont(new Font("고딕체", Font.PLAIN, 30));
		    panelDate.add(reMonth);
		   
		    
		    
		    //반납 일
		    String [] reDays={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		    JComboBox<String> reDay = new JComboBox<String>(reDays);
		    reDay.setBounds(595, 133, 120, 40);
		    reDay.setFont(new Font("고딕체", Font.PLAIN, 30));
		    panelDate.add(reDay);
		    
		    
		    //반납 시
		    String [] reHours={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"};
		    JComboBox<String> reHour = new JComboBox<String>(reHours);
		    reHour.setBounds(803, 133, 120, 40);
		    reHour.setFont(new Font("고딕체", Font.PLAIN, 30));
		    panelDate.add(reHour);
		    
		    //반납 년월일시 텍스트 
		    
		    JLabel ryearTxt = new JLabel("년");
		    ryearTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    ryearTxt.setFont(new Font("고딕체", Font.PLAIN, 30));
		    ryearTxt.setBounds(312, 135, 30, 40);
		    panelDate.add(ryearTxt);
		    
		    JLabel rmonthTxt = new JLabel("월");
		    rmonthTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    rmonthTxt.setFont(new Font("고딕체", Font.PLAIN, 30));
		    rmonthTxt.setBounds(516, 135, 30, 40);
		    panelDate.add(rmonthTxt);
		    
		    JLabel rdayTxt = new JLabel("일");
		    rdayTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    rdayTxt.setFont(new Font("고딕체", Font.PLAIN, 30));
		    rdayTxt.setBounds(725, 135, 30, 40);
		    panelDate.add(rdayTxt);
		    
		    JLabel rhourTxt = new JLabel("시");
		    rhourTxt.setHorizontalAlignment(SwingConstants.CENTER);
		    rhourTxt.setFont(new Font("고딕체", Font.PLAIN, 30));
		    rhourTxt.setBounds(933, 135, 30, 40);
		    panelDate.add(rhourTxt);

		    
		    	    
		    //차량유형 패널
		    JPanel panelTitle = new JPanel();
		    panelTitle.setLayout(null);
		    panelTitle.setBorder(new TitledBorder(new LineBorder(Color.BLACK)));
		    panelTitle.setBackground(Color.WHITE);
		    panelTitle.setBounds(100, 360, 1000, 200);
		    add(panelTitle);
		    
		    //차량유형 라벨
			JLabel carType = new JLabel("차량 유형");
			carType.setBounds(395, 6, 175, 45);
		 	panelTitle.add(carType);
			carType.setHorizontalAlignment(SwingConstants.CENTER);
			carType.setFont(new Font("고딕체", Font.PLAIN, 35));
		    
			//보더라인
		    JPanel panelTitle2 = new JPanel();
		    panelTitle2.setLayout(null);
		    panelTitle2.setBorder(new TitledBorder(new LineBorder(Color.BLACK)));
		    panelTitle2.setBackground(Color.WHITE);
		    panelTitle2.setBounds(0, 0, 1000, 50);
		    panelTitle.add(panelTitle2);
			

		    //차량별 그림 삽입
			JLabel car1=new JLabel(new ImageIcon("small.jpg"));
			car1.setBounds(150, 70, 100, 70);
		    panelTitle.add(car1);
		    
		    JLabel car2=new JLabel(new ImageIcon("mid.jpg"));
		    car2.setBounds(410, 70, 160, 70);
		    panelTitle.add(car2);
		    
		    JLabel car3=new JLabel(new ImageIcon("large.jpg"));
		    car3.setBounds(720, 70, 160, 70);
		    panelTitle.add(car3);
		    
			//차량별 라디오버튼 
			JRadioButton smallRadio = new JRadioButton("소형");
		    smallRadio.setFont(new Font("고딕체", Font.PLAIN, 20));
		    smallRadio.setHorizontalAlignment(SwingConstants.CENTER);
		    smallRadio.setBackground(Color.WHITE);
		    smallRadio.setBounds(141, 159, 121, 23);
		    panelTitle.add(smallRadio);
		    
		    JRadioButton medRadio = new JRadioButton("중형");
		    medRadio.setFont(new Font("고딕체", Font.PLAIN, 20));
		    medRadio.setBackground(Color.WHITE);
		    medRadio.setHorizontalAlignment(SwingConstants.CENTER);
		    medRadio.setBounds(441, 159, 121, 23);
		    panelTitle.add(medRadio);
		    
		    JRadioButton larRadio = new JRadioButton("대형");
		    larRadio.setFont(new Font("고딕체", Font.PLAIN, 20));
		    larRadio.setHorizontalAlignment(SwingConstants.CENTER);
		    larRadio.setBackground(Color.WHITE);
		    larRadio.setBounds(744, 159, 121, 23);
		    panelTitle.add(larRadio);
		    
		    //버튼 그룹화
			ButtonGroup group= new ButtonGroup();
			group.add(smallRadio);
			group.add(medRadio);
			group.add(larRadio);
		    
		    
		    
		    //메인&다음 버튼 
		    JButton preBtn = new JButton("메인으로");
		    preBtn.setFont(new Font("고딕체", Font.PLAIN, 20));
		    preBtn.setForeground(Color.WHITE);
		    preBtn.setBackground(new Color(204,51,51));
		    preBtn.setBounds(300, 670, 200, 70);
		    add(preBtn);
		    
		    preBtn.addMouseListener(new ChangePanelHandler2(main, this, prev));

		    JButton nextBtn = new JButton("다음으로");
		    nextBtn.setFont(new Font("고딕체", Font.PLAIN, 20));
		    nextBtn.setForeground(Color.WHITE);
		    nextBtn.setBackground(new Color(204,51,51));
		    nextBtn.setBounds(700, 670, 200, 70);
		    add(nextBtn);
		    

		    
		    //대여일&반납일 콘솔창에 출력하기
		    nextBtn.addMouseListener(new MouseAdapter() {
		    	@Override
		         public void mouseClicked(MouseEvent e) {
					//대여일에 값넣기
					int y=Integer.parseInt((String)year.getSelectedItem());
					int m=Integer.parseInt((String)month.getSelectedItem());
					int d=Integer.parseInt((String)day.getSelectedItem());
					int h=Integer.parseInt((String)hour.getSelectedItem());
					rentDay=c.cl(y, m-1, d, h);
					SimpleDateFormat sdf=new SimpleDateFormat("YY년MM월dd일HH시");
					System.out.println(sdf.format(rentDay.getTimeInMillis()));

					//반납일에 값넣기
					int reY=Integer.parseInt((String)reYear.getSelectedItem());
					int reM=Integer.parseInt((String)reMonth.getSelectedItem());
					int reD=Integer.parseInt((String)reDay.getSelectedItem());
					int reH=Integer.parseInt((String)reHour.getSelectedItem());
					returnDay=c.cl(reY, reM-1, reD, reH);
					System.out.println(sdf.format(returnDay.getTimeInMillis()));
						
					String type=null;//추가한부분 =null;
		    		if(smallRadio.isSelected()) {
		    			type="소형";
		    			System.out.println(type);
		    		}else if(medRadio.isSelected()) {
		    			type="중형";
		    			System.out.println(type);
		    		}else if(larRadio.isSelected()) {
		    			type="대형";
		    			System.out.println(type);
		    		}
		    		
		    		//예약자생성
		    		Booker booker=new Booker(type,null,null, 0,null,null,rentDay,returnDay,null,null,null,null);

		    		bd.plus(booker);
		    		c.searchCar(type);
		    		Controller.setReserveNo(new Controller().reserveNum());
		    	}	
		    
		    	
		      });
		    
		   
		    nextBtn.addMouseListener(new ChangePanelHandler(main, this, null));
		    

		    
	}
	
}
