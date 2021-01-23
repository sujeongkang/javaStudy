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
		   SimpleDateFormat sdf=new SimpleDateFormat("YY��MM��dd��HH��");
		   public Page5(JFrame frame,JPanel prev) {
		      this.frame=frame;
		      this.prev=prev;
		      setLayout(null);
		      setSize(1200,800);
		      

		      
//		      // =====������=========== �������� Ÿ��Ʋ��
//		      JPanel title = new JPanel();
//		      title.setBounds(0, 0, 1200, 100);
//		      title.setBackground(Color.RED);
//		      add(title);
//		      title.setLayout(null);
//		         
//		      JLabel titleText = new JLabel("\uACB0\uC81C \uD655\uC778");
//		      titleText.setForeground(Color.WHITE);
//		      titleText.setBounds(0, 0, 1200, 100);
//		      titleText.setFont(new Font("����ü", Font.PLAIN, 50));
//		      titleText.setHorizontalAlignment(SwingConstants.CENTER);
//		      title.add(titleText);
		      
		      
		      //�������� Ÿ��Ʋ 
		      JLabel checkTitle = new JLabel("\uC608\uC57D \uC815\uBCF4");
		      checkTitle.setFont(new Font("����", Font.PLAIN, 60));
		      checkTitle.setHorizontalAlignment(SwingConstants.CENTER);
		      checkTitle.setBounds(414, 27, 327, 82);
		      add(checkTitle);
		      
		      JButton beforeButton = new JButton("\uC544\uB2C8\uC624");//����ȭ������ ���� ��ư
		      beforeButton.setFont(new Font("����", Font.PLAIN, 25));
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
		      
		      beforeButton.addMouseListener(new MouseAdapter() {//����ȭ�� ��ư �̺�Ʈ 
		         
		         @Override
		         public void mouseReleased(MouseEvent e) {
		            // TODO Auto-generated method stub
		            JButton j=(JButton)e.getComponent();//������ ���� �ٲ�.//component ���콺�� �����̰ų� �巹���ϰų� �������ų� �Ҷ� ����
		            j.setBackground(Color.BLACK);
		            j.setForeground(Color.YELLOW);
		         }
		         
		         
		         @Override
		         public void mouseEntered(MouseEvent e) {
		            // TODO Auto-generated method stub
		            JButton j=(JButton)e.getComponent();//�����ϱ�//component ���콺�� �����̰ų� �巹���ϰų� �������ų� �Ҷ� ����
		            j.setBackground(Color.BLACK);
		            j.setForeground(Color.RED);   
		         
		         }
		         
		      });
		         //������������ư
		      JButton allCheckbtn = new JButton("\uACB0\uC81C\uD655\uC778");//���� â  ���� Ȯ�ι�ư.
		      allCheckbtn.setFont(new Font("����", Font.PLAIN, 25));
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
		            JButton j=(JButton)e.getComponent();//������ ���� �ٲ�.//component ���콺�� �����̰ų� �巹���ϰų� �������ų� �Ҷ� ����
		            j.setBackground(Color.BLACK);
		            j.setForeground(Color.YELLOW);
		         }

		      

		         @Override
		         public void mouseReleased(MouseEvent e) {
		            // TODO Auto-generated method stub
		            JButton j=(JButton)e.getComponent();//component ���콺�� �����̰ų� �巹���ϰų� �������ų� �Ҷ� ����
		            j.setBackground(Color.BLACK);
		            j.setForeground(Color.RED);   
		         }
		      });
		      
		   
		      
		      
		      JTextPane textPane = new JTextPane();
		      textPane.setText("\uAC1C\uC778\uC815\uBCF4\uB97C \uC81C\uACF5\uD558\uB294\uB370 \uB3D9\uC758\uD569\uB2C8\uB2E4.      \uADF8\uB798\uC57C \uC774\uC11C\uBE44\uC2A4\uB97C \uC774\uC6A9\uD558\uC2E4\uC218\uC788\uC2B5\uB2C8\uB2E4.\uADF8\uB9AC\uACE0 \uB2F9\uC2E0\uC740 \uC774\uB807\uAC8C \uD569\uB9AC\uC801\uC778 \uAC00\uACA9\uC744 \uC9C0\uBD88\uD558\uB294\uB370 \uB3D9\uC758\uD569\uB2C8\uB2E4.");
		      textPane.setBounds(300, 576, 610, 59);
		      add(textPane);
		      
		      JCheckBox cb = new JCheckBox("\uAC1C\uC778\uC815\uBCF4 \uB3D9\uC758\uC11C");//�������� üũ�ڽ�
		      cb.setHorizontalAlignment(SwingConstants.CENTER);
		      cb.setBounds(333, 652, 131, 27);
		      add(cb);
		      cb.addActionListener(new ActionListener() {
		         
		         @Override
		         public void actionPerformed(ActionEvent e) {//���� ȭ�鼭 ����..�� �ƴϿ� ���
		            int i=0;
		            String msg="";            
		            if(cb.isSelected()) {//üũ�� �Ǹ� ����
//		               e.getActionCommand();
		            }
		            
		            JOptionPane.showMessageDialog(cb, "�����ϼ˽��ϴ�.");
		         }
		         
		      });
		      
		      
		      //������ ���� �ǳ�
		      JPanel panel = new JPanel();
		      panel.setBounds(300, 191, 610, 109);
		      add(panel);
		      panel.setLayout(null);
		   
		      //������ ���輱��
		      JLabel driverInsuranceChoice = new JLabel("\uC6B4\uC804\uC790 \uBCF4\uD5D8 \uC120\uD0DD");
		      driverInsuranceChoice.setHorizontalAlignment(SwingConstants.CENTER);
		      driverInsuranceChoice.setBounds(0, 0, 254, 41);
		      driverInsuranceChoice.setBackground(Color.BLACK);
		      driverInsuranceChoice.setFont(new Font("����", Font.BOLD, 20));
		      driverInsuranceChoice.setForeground(Color.BLACK);
		      panel.add(driverInsuranceChoice);
		      
		      //��¥ �� ���� ��� �ǳ�
		      JPanel panel_1 = new JPanel();
		      panel_1.setBounds(300, 313, 610, 239);
		      setLayout(null);
		      add(panel_1);
		      panel_1.setLayout(null);
		      
		      //�뿩��
		      JLabel dateOfHour = new JLabel("\uB300\uC5EC\uC77C:");
		      dateOfHour.setForeground(Color.BLACK);
		      dateOfHour.setFont(new Font("����", Font.BOLD, 25));
		      dateOfHour.setBounds(14, 11, 596, 30);
		      panel_1.add(dateOfHour);
		      
		      //�ݳ���
		      JLabel returndate = new JLabel("\uBC18\uB0A9\uC77C:");
		      returndate.setFont(new Font("����", Font.BOLD, 25));
		      returndate.setBounds(14, 66, 596, 30);
		      panel_1.add(returndate);
		      
		      //���뿩����
		      JLabel carlentalPrice = new JLabel(" \uAC00\uACA9(\uBCF4\uD5D8\uBE44\uD3EC\uD568):");
		      carlentalPrice.setForeground(Color.BLACK);
		      carlentalPrice.setFont(new Font("�������", Font.BOLD, 30));
		      carlentalPrice.setBounds(14, 191, 596, 35);
		      panel_1.add(carlentalPrice);
		      
		      //����
		      JLabel carType = new JLabel("\uCC28\uC885: ");
		      carType.setBackground(Color.WHITE);
		      carType.setForeground(Color.BLACK);
		      carType.setFont(new Font("����", Font.BOLD, 25));
		      carType.setBounds(14, 133, 596, 29);
		      panel_1.add(carType);
		      
		      //����� ��ư �׷�
		      ButtonGroup size= new ButtonGroup();//check �ڽ��� ��Ƽ� ��
		      JRadioButton S = new JRadioButton("S-10000\uC6D0");
		      S.setFont(new Font("����", Font.BOLD | Font.ITALIC, 15));
		      S.setForeground(Color.BLACK);
		      S.setBounds(47, 73, 139, 27);
		      JRadioButton M = new JRadioButton("M-15000\uC6D0");
		      M.setFont(new Font("����", Font.BOLD | Font.ITALIC, 15));
		      M.setForeground(Color.BLACK);
		      M.setBounds(234, 73, 139, 27);
		      JRadioButton P = new JRadioButton("P-20000\uC6D0");
		      P.setFont(new Font("����", Font.BOLD | Font.ITALIC, 15));
		      P.setBounds(415, 73, 139, 27);
		      
		      panel.add(S);//�ǳڿ� ���� ��ư �߰�
		      panel.add(M);
		      panel.add(P);
		      
		      size.add(S);//�׷쿡 ��ư �������� ����.
		      size.add(M);
		      size.add(P);
		      
		         
		      S.addActionListener(new ActionListener() {
		         
		         @Override
		         public void actionPerformed(ActionEvent e) {
		            //�߰� ��ư�� ������
		            //�Էµ� ���� �̿��Ͽ� ������� �װ���� JtextArea�� ��ü �ݾ׿� ���
		            //������ ������ ����� ����ó���Ұ� (
		            String msg="";

		            
		            if(S.isSelected()) {
		               
		               msg="������ �����ϼ̽��ϴ�.";
		               price=10000;
		               //		               if(e.getSource() != null) {//null���� ����Ʈ�Ű������� �����;���.
		               //		                  msg=carlentalPrice.getText();//msg���� ������ ���� �Ű�����.
		               //		               }//append(totalPrice.getLabelFor());
		            }
		            JOptionPane.showMessageDialog(S, msg);

		            // �� ���ݰ� ���� ������ ����ϱ����� ���
		            //		         try {
		            //		               totalPrice=Integer.parseInt(tt.getText());
		            //		            }catch( NumberFormatException ex) {   
		            //		            }
		            //		            totalPrice +=price;
		            //		            tt.setText(integer.toString(totalPrice));

		            Booker b=(Booker)BookerDB.getBk().get(BookerDB.getBk().size()-1);

		            Controller cl=new Controller();
		            sum=cl.sumprice(b.getRent(), b.getCollect(), price,b.getPrice());
		            insurance="S����";
		            //		    		  b.setPrice(sum);
		            //		    		  String sum1=String.valueOf(sum);
		            carlentalPrice.setText("����(���������): "+sum+"��");
		            carType.setText("\uCC28\uC885: "+b.getModel());
		            dateOfHour.setText("�뿩��: "+sdf.format(b.getRent().getTimeInMillis()));
		            returndate.setText("�ݳ���: "+sdf.format(b.getCollect().getTimeInMillis()));
		            
		            //		         

		         }
		      });
		      M.addActionListener(new ActionListener() {
		         
		         @Override
		         public void actionPerformed(ActionEvent e) {
		            
		            String msg="";
		            if(M.isSelected()) {
		               msg="M ������ �����ϼ˽��ϴ�.";
		               price=15000;
		            }else {
		               
		            }
		            JOptionPane.showMessageDialog(M, msg);
		            Booker b=(Booker)BookerDB.getBk().get(BookerDB.getBk().size()-1);

		            Controller cl=new Controller();
		            sum=cl.sumprice(b.getRent(), b.getCollect(), price,b.getPrice());
		            //		    		  b.setPrice(sum);
		            //		    		  String sum1=String.valueOf(sum);
		            carlentalPrice.setText("����(���������): "+sum+"��");
		            carType.setText("\uCC28\uC885: "+b.getModel());
		            dateOfHour.setText("�뿩��: "+sdf.format(b.getRent().getTimeInMillis()));
		            returndate.setText("�ݳ���: "+sdf.format(b.getCollect().getTimeInMillis()));
		            insurance="M����";
		         }
		      });
		         P.addActionListener(new ActionListener() {
		         
		         @Override
		         public void actionPerformed(ActionEvent e) {
		            
		            String msg="";
		            if(P.isSelected()) {
		               msg="P ������ �����ϼ˽��ϴ�.";
		               price=20000;
		            }else {
		               
		            }
		             JOptionPane.showMessageDialog(P, msg);
		             
		             
		             Booker b=(Booker)BookerDB.getBk().get(BookerDB.getBk().size()-1);

			            Controller cl=new Controller();
			            sum=cl.sumprice(b.getRent(), b.getCollect(), price,b.getPrice());
			            //		    		  b.setPrice(sum);
			            //		    		  String sum1=String.valueOf(sum);
			            carlentalPrice.setText("����(���������): "+sum+"��");
			            carType.setText("\uCC28\uC885: "+b.getModel());
			            dateOfHour.setText("�뿩��: "+sdf.format(b.getRent().getTimeInMillis()));
			            returndate.setText("�ݳ���: "+sdf.format(b.getCollect().getTimeInMillis()));
			            insurance="P����";
		         }
		      });
		      
		     
		      
		      
		      
		      
		      //�޹���̹���
		      JLabel image=new JLabel(new ImageIcon("7.jpg"));
		      image.setBounds(0,0,1200,800);
		      add(image);
		      
//		      frame.add(this);
		      this.revalidate();
		   }
	
		   
	}


