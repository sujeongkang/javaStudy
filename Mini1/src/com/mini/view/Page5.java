package com.mini.view;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import com.mini.controller.ChangePanelHandler;
import com.rent.controller.Controller;
import com.rent.db.BookerDB;
import com.rent.model.vo.Booker;

public class Page5 extends JPanel {

	/**
	 * Create the panel.
	 */	   private JFrame frame;
		   private JPanel prev;
		   private int sum;
		   private int price;
		   private String insurance;
		   SimpleDateFormat sdf=new SimpleDateFormat("YY년MM월dd일HH시");
		   public Page5(JFrame frame,JPanel prev) {
		      this.frame=frame;
		      this.prev=prev;
		      setLayout(null);
		      setSize(1200,800);
		      

		      
//		      // =====빨간색=========== 예약정보 타이틀바
//		      JPanel title = new JPanel();
//		      title.setBounds(0, 0, 1200, 100);
//		      title.setBackground(Color.RED);
//		      add(title);
//		      title.setLayout(null);
//		         
//		      JLabel titleText = new JLabel("\uACB0\uC81C \uD655\uC778");
//		      titleText.setForeground(Color.WHITE);
//		      titleText.setBounds(0, 0, 1200, 100);
//		      titleText.setFont(new Font("돋움체", Font.PLAIN, 50));
//		      titleText.setHorizontalAlignment(SwingConstants.CENTER);
//		      title.add(titleText);
		      
		      
		      //예약정보 타이틀 
		      JLabel checkTitle = new JLabel("\uC608\uC57D \uC815\uBCF4");
		      checkTitle.setFont(new Font("굴림", Font.PLAIN, 60));
		      checkTitle.setHorizontalAlignment(SwingConstants.CENTER);
		      checkTitle.setBounds(414, 27, 327, 82);
		      add(checkTitle);
		      
		      JButton beforeButton = new JButton("\uC544\uB2C8\uC624");//이전화면으로 가는 버튼
		      beforeButton.setFont(new Font("굴림", Font.PLAIN, 25));
		      beforeButton.setBackground(Color.BLACK);
		      beforeButton.setForeground(Color.RED);
		      beforeButton.setBounds(300, 688, 294, 59);
		      add(beforeButton);
		      beforeButton.addMouseListener(new ChangePanelHandler(frame, this, prev));
				beforeButton.addActionListener(new ActionListener() {
		         
		         @Override
		         public void actionPerformed(ActionEvent e) {
//		          
//		          if(beforeButton.isSelected()) {
//		        	for(int i=list.size()-1;i=>0;i--) {
//		        		list.remove(i);
//		        		
//		        	}break;
//		      
//		          }
		         }
		      });
		      
		      beforeButton.addMouseListener(new MouseAdapter() {//이전화면 버튼 이벤트 
		         
		         @Override
		         public void mouseReleased(MouseEvent e) {
		            // TODO Auto-generated method stub
		            JButton j=(JButton)e.getComponent();//누르면 색이 바뀜.//component 마우스가 움직이거나 드레그하거나 지나가거나 할때 반응
		            j.setBackground(Color.BLACK);
		            j.setForeground(Color.YELLOW);
		         }
		         
		         
		         @Override
		         public void mouseEntered(MouseEvent e) {
		            // TODO Auto-generated method stub
		            JButton j=(JButton)e.getComponent();//엔터하기//component 마우스가 움직이거나 드레그하거나 지나가거나 할때 반응
		            j.setBackground(Color.BLACK);
		            j.setForeground(Color.RED);   
		         
		         }
		         
		      });
		         //다음페이지버튼
		      JButton allCheckbtn = new JButton("\uACB0\uC81C\uD655\uC778");//결제 창  결제 확인버튼.
		      allCheckbtn.setFont(new Font("굴림", Font.PLAIN, 25));
		      allCheckbtn.setForeground(new Color(255, 0, 0));
		      allCheckbtn.setBackground(Color.BLACK);
		      allCheckbtn.setBounds(623, 688, 294, 59);
		      add(allCheckbtn);
		      allCheckbtn.addMouseListener(new ChangePanelHandler(frame, this, new Page6(frame)));
		      setVisible(false);
		      allCheckbtn.addActionListener(new ActionListener() {
		         
		         @Override
		         public void actionPerformed(ActionEvent e) {
		           
		        	 Booker b=(Booker)BookerDB.getBk().get(BookerDB.getBk().size()-1);	
		        	 b.setPrice(sum);
		        	 
		        	 b.setInsurance(insurance);
		        	 
		        	 
		         }
		      });
		      
		   
		      allCheckbtn.addMouseListener(new MouseAdapter() {
		         
		         @Override
		         public void mouseClicked(MouseEvent e) {
		            // TODO Auto-generated method stub
		            JButton j=(JButton)e.getComponent();//누르면 색이 바뀜.//component 마우스가 움직이거나 드레그하거나 지나가거나 할때 반응
		            j.setBackground(Color.BLACK);
		            j.setForeground(Color.YELLOW);
		         }

		      

		         @Override
		         public void mouseReleased(MouseEvent e) {
		            // TODO Auto-generated method stub
		            JButton j=(JButton)e.getComponent();//component 마우스가 움직이거나 드레그하거나 지나가거나 할때 반응
		            j.setBackground(Color.BLACK);
		            j.setForeground(Color.RED);   
		         }
		      });
		      
		   
		      
		      
		      JTextPane textPane = new JTextPane();
		      textPane.setText("\uAC1C\uC778\uC815\uBCF4\uB97C \uC81C\uACF5\uD558\uB294\uB370 \uB3D9\uC758\uD569\uB2C8\uB2E4.      \uADF8\uB798\uC57C \uC774\uC11C\uBE44\uC2A4\uB97C \uC774\uC6A9\uD558\uC2E4\uC218\uC788\uC2B5\uB2C8\uB2E4.\uADF8\uB9AC\uACE0 \uB2F9\uC2E0\uC740 \uC774\uB807\uAC8C \uD569\uB9AC\uC801\uC778 \uAC00\uACA9\uC744 \uC9C0\uBD88\uD558\uB294\uB370 \uB3D9\uC758\uD569\uB2C8\uB2E4.");
		      textPane.setBounds(300, 576, 610, 59);
		      add(textPane);
		      
		      JCheckBox cb = new JCheckBox("\uAC1C\uC778\uC815\uBCF4 \uB3D9\uC758\uC11C");//개인정보 체크박스
		      cb.setHorizontalAlignment(SwingConstants.CENTER);
		      cb.setBounds(333, 652, 131, 27);
		      add(cb);
		      cb.addActionListener(new ActionListener() {
		         
		         @Override
		         public void actionPerformed(ActionEvent e) {//동의 화면서 구현..예 아니요 취소
		            int i=0;
		            String msg="";            
		            if(cb.isSelected()) {//체크가 되면 실행
//		               e.getActionCommand();
		            }
		            
		            JOptionPane.showMessageDialog(cb, "동의하셧습니다.");
		         }
		         
		      });
		      
		      
		      //운전자 보험 판넬
		      JPanel panel = new JPanel();
		      panel.setBounds(300, 191, 610, 109);
		      add(panel);
		      panel.setLayout(null);
		   
		      //운전자 보험선택
		      JLabel driverInsuranceChoice = new JLabel("\uC6B4\uC804\uC790 \uBCF4\uD5D8 \uC120\uD0DD");
		      driverInsuranceChoice.setHorizontalAlignment(SwingConstants.CENTER);
		      driverInsuranceChoice.setBounds(0, 0, 254, 41);
		      driverInsuranceChoice.setBackground(Color.BLACK);
		      driverInsuranceChoice.setFont(new Font("굴림", Font.BOLD, 20));
		      driverInsuranceChoice.setForeground(Color.BLACK);
		      panel.add(driverInsuranceChoice);
		      
		      //날짜 및 가격 출력 판넬
		      JPanel panel_1 = new JPanel();
		      panel_1.setBounds(300, 313, 610, 239);
		      setLayout(null);
		      add(panel_1);
		      panel_1.setLayout(null);
		      
		      //대여일
		      JLabel dateOfHour = new JLabel("\uB300\uC5EC\uC77C:");
		      dateOfHour.setForeground(Color.BLACK);
		      dateOfHour.setFont(new Font("굴림", Font.BOLD, 25));
		      dateOfHour.setBounds(14, 11, 596, 30);
		      panel_1.add(dateOfHour);
		      
		      //반납일
		      JLabel returndate = new JLabel("\uBC18\uB0A9\uC77C:");
		      returndate.setFont(new Font("굴림", Font.BOLD, 25));
		      returndate.setBounds(14, 66, 596, 30);
		      panel_1.add(returndate);
		      
		      //차대여가격
		      JLabel carlentalPrice = new JLabel(" \uAC00\uACA9(\uBCF4\uD5D8\uBE44\uD3EC\uD568):");
		      carlentalPrice.setForeground(Color.BLACK);
		      carlentalPrice.setFont(new Font("나눔고딕", Font.BOLD, 30));
		      carlentalPrice.setBounds(14, 191, 596, 35);
		      panel_1.add(carlentalPrice);
		      
		      //차종
		      JLabel carType = new JLabel("\uCC28\uC885: ");
		      carType.setBackground(Color.WHITE);
		      carType.setForeground(Color.BLACK);
		      carType.setFont(new Font("굴림", Font.BOLD, 25));
		      carType.setBounds(14, 133, 596, 29);
		      panel_1.add(carType);
		      
		      //래디오 버튼 그룹
		      ButtonGroup size= new ButtonGroup();//check 박스는 모아서 그
		      JRadioButton S = new JRadioButton("S-10000\uC6D0");
		      S.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 15));
		      S.setForeground(Color.BLACK);
		      S.setBounds(47, 73, 139, 27);
		      JRadioButton M = new JRadioButton("M-15000\uC6D0");
		      M.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 15));
		      M.setForeground(Color.BLACK);
		      M.setBounds(234, 73, 139, 27);
		      JRadioButton P = new JRadioButton("P-20000\uC6D0");
		      P.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 15));
		      P.setBounds(415, 73, 139, 27);
		      
		      panel.add(S);//판넬에 라디오 버튼 추가
		      panel.add(M);
		      panel.add(P);
		      
		      size.add(S);//그룹에 버튼 묶음으로 더함.
		      size.add(M);
		      size.add(P);
		      
		         
		      S.addActionListener(new ActionListener() {
		         
		         @Override
		         public void actionPerformed(ActionEvent e) {
		            //추가 버튼이 눌리면
		            //입력된 값을 이용하여 계산한후 그결과를 JtextArea와 전체 금액에 출력
		            //개수를 정수로 변경시 예외처리할것 (
		            String msg="";

		            
		            if(S.isSelected()) {
		               
		               msg="보험을 선택하셨습니다.";
		               price=10000;
		               //		               if(e.getSource() != null) {//null값에 차렌트매개변수을 가져와야함.
		               //		                  msg=carlentalPrice.getText();//msg말고 차값이 나온 매개변수.
		               //		               }//append(totalPrice.getLabelFor());
		            }
		            JOptionPane.showMessageDialog(S, msg);

		            // 차 가격과 값이 들어오면 계산하기위한 방식
		            //		         try {
		            //		               totalPrice=Integer.parseInt(tt.getText());
		            //		            }catch( NumberFormatException ex) {   
		            //		            }
		            //		            totalPrice +=price;
		            //		            tt.setText(integer.toString(totalPrice));

		            Booker b=(Booker)BookerDB.getBk().get(BookerDB.getBk().size()-1);

		            Controller cl=new Controller();
		            sum=cl.sumprice(b.getRent(), b.getCollect(), price,b.getPrice());
		            insurance="S보험";
		            //		    		  b.setPrice(sum);
		            //		    		  String sum1=String.valueOf(sum);
		            carlentalPrice.setText("가격(보험비포함): "+sum+"원");
		            carType.setText("\uCC28\uC885: "+b.getModel());
		            dateOfHour.setText("대여일: "+sdf.format(b.getRent().getTimeInMillis()));
		            returndate.setText("반납일: "+sdf.format(b.getCollect().getTimeInMillis()));
		            
		            //		         

		         }
		      });
		      M.addActionListener(new ActionListener() {
		         
		         @Override
		         public void actionPerformed(ActionEvent e) {
		            
		            String msg="";
		            if(M.isSelected()) {
		               msg="M 보험을 선택하셧습니다.";
		               price=15000;
		            }else {
		               
		            }
		            JOptionPane.showMessageDialog(M, msg);
		            Booker b=(Booker)BookerDB.getBk().get(BookerDB.getBk().size()-1);

		            Controller cl=new Controller();
		            sum=cl.sumprice(b.getRent(), b.getCollect(), price,b.getPrice());
		            //		    		  b.setPrice(sum);
		            //		    		  String sum1=String.valueOf(sum);
		            carlentalPrice.setText("가격(보험비포함): "+sum+"원");
		            carType.setText("\uCC28\uC885: "+b.getModel());
		            dateOfHour.setText("대여일: "+sdf.format(b.getRent().getTimeInMillis()));
		            returndate.setText("반납일: "+sdf.format(b.getCollect().getTimeInMillis()));
		            insurance="M보험";
		         }
		      });
		         P.addActionListener(new ActionListener() {
		         
		         @Override
		         public void actionPerformed(ActionEvent e) {
		            
		            String msg="";
		            if(P.isSelected()) {
		               msg="P 보험을 선택하셧습니다.";
		               price=20000;
		            }else {
		               
		            }
		             JOptionPane.showMessageDialog(P, msg);
		             
		             
		             Booker b=(Booker)BookerDB.getBk().get(BookerDB.getBk().size()-1);

			            Controller cl=new Controller();
			            sum=cl.sumprice(b.getRent(), b.getCollect(), price,b.getPrice());
			            //		    		  b.setPrice(sum);
			            //		    		  String sum1=String.valueOf(sum);
			            carlentalPrice.setText("가격(보험비포함): "+sum+"원");
			            carType.setText("\uCC28\uC885: "+b.getModel());
			            dateOfHour.setText("대여일: "+sdf.format(b.getRent().getTimeInMillis()));
			            returndate.setText("반납일: "+sdf.format(b.getCollect().getTimeInMillis()));
			            insurance="P보험";
		         }
		      });
		      
		     
		      
		      
		      
		      
		      //뒷배경이미지
		      JLabel image=new JLabel(new ImageIcon("7.jpg"));
		      image.setBounds(0,0,1200,800);
		      add(image);
		      
//		      frame.add(this);
		      this.revalidate();
		   }
	
		   
	}


