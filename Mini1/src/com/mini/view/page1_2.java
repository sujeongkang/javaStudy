package com.mini.view;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.mini.controller.ChangePanelHandler;
import com.rent.db.BookerDB;
import com.rent.model.vo.Booker;


public class page1_2 extends JPanel{
   
   private JFrame main;
   private JPanel prev;
   private BookerDB bd=MainFrame.getDB();
   SimpleDateFormat sdf=new SimpleDateFormat("YY.MM.dd/HH시");
   
   public page1_2 (JFrame main, JPanel prev) {
      //예약번호랑 버튼
      this.main=main;
      this.prev=prev;
      
      setLayout(null);
      setSize(1200,800);
      setBackground(Color.darkGray);
      //예약조회화면 
      JPanel title = new JPanel();
       title.setBounds(0, 0, 1200, 100);
       title.setBackground(new Color(204,51,51));
       add(title);
       title.setLayout(null);
          
       JLabel titleText = new JLabel("예 약 조 회");
       titleText.setForeground(Color.WHITE);
       titleText.setBounds(0, 0, 1200, 100);
       titleText.setFont(new Font("고딕체", Font.PLAIN, 50));
       titleText.setHorizontalAlignment(SwingConstants.CENTER);
       title.add(titleText);
      
      
      //위 판넬 박스
      JPanel panelRe = new JPanel();
      panelRe.setBackground(Color.WHITE);
      panelRe.setBorder(new TitledBorder(new LineBorder(Color.BLACK)));
      panelRe.setBounds(100, 120, 1000, 150);
       add(panelRe);
       panelRe.setLayout(null);
     
       JPanel panelRe2 = new JPanel();  
       panelRe2.setBackground(Color.WHITE);
       panelRe2.setBounds(0, 0, 1000, 50);
       panelRe.add(panelRe2);
       panelRe2.setBorder(new TitledBorder(new LineBorder(Color.BLACK)));
       panelRe2.setLayout(null);
       
       JLabel titletxt= new JLabel("예약번호 8자리를 입력하세요.");
       titletxt.setBounds(300, 6, 500, 45);
       titletxt.setFont(new Font("고딕체", Font.PLAIN, 30));
       panelRe2.add(titletxt);
       
       JLabel reserveNum = new JLabel("예약번호    :");
       reserveNum.setFont(new Font("고딕체", Font.PLAIN, 30));
       reserveNum.setBounds(130, 80, 200, 40);
       panelRe.add(reserveNum);
       
       JTextField numInput = new JTextField();
      numInput.setBounds(340, 80, 300, 40);
      numInput.setFont(new Font("고딕체", Font.PLAIN, 30));
      panelRe.add(numInput);
       
      JButton searchNum = new JButton("확인");
      searchNum.setBounds(700, 75, 120, 50);
      searchNum.setFont(new Font("고딕체", Font.PLAIN, 20));
      searchNum.setForeground(Color.WHITE);
      searchNum.setBackground(new Color(204,51,51));
      panelRe.add(searchNum);
      
    //밑 판넬 박스
          JPanel panelRe3 = new JPanel();
          panelRe3.setBackground(Color.WHITE);
          panelRe3.setBorder(new TitledBorder(new LineBorder(Color.BLACK)));
          panelRe3.setBounds(100, 290, 1000, 360);
           add(panelRe3);
           panelRe3.setLayout(null);
           
            JLabel lb=new JLabel("- 예약자 정보 : ");
           lb.setBounds(170,30,600,100);
           lb.setFont(new Font("고딕체", Font.PLAIN, 30));
           panelRe3.add(lb);
           
           JLabel lb2=new JLabel("- 렌트 기간 : ");
           lb2.setBounds(170,90,700,100);
           lb2.setFont(new Font("고딕체", Font.PLAIN, 30));
           panelRe3.add(lb2);
           
           JLabel lb3=new JLabel("- 차량 정보 : ");
           lb3.setBounds(170,150,700,100);
           lb3.setFont(new Font("고딕체", Font.PLAIN, 30));
           panelRe3.add(lb3);
           
           JLabel lb4=new JLabel("- 보험 종류 : ");
           lb4.setBounds(170,210,600,100);
           lb4.setFont(new Font("고딕체", Font.PLAIN, 30));
           panelRe3.add(lb4);
           
//           JLabel lb5=new JLabel();
//           lb6.setBounds(250,270,600,100);
//           lb6.setFont(new Font("고딕체", Font.PLAIN, 30));
//           panelRe3.add(lb6);
           
           JLabel lb6=new JLabel("- 최종가격 : ");
           lb6.setBounds(170,270,600,100);
           lb6.setFont(new Font("고딕체", Font.PLAIN, 30));
           panelRe3.add(lb6);
           
          
           
           JPanel panelRe4 = new JPanel();  
           panelRe4.setBackground(Color.WHITE);
           panelRe4.setBounds(0, 0, 1000, 50);
           panelRe3.add(panelRe4);
           panelRe4.setBorder(new TitledBorder(new LineBorder(Color.BLACK)));
           panelRe4.setLayout(null);

           JLabel titletxt2= new JLabel("* 예약 정보 내역 *");
           titletxt2.setBounds(375, 6, 450, 45);
           titletxt2.setFont(new Font("고딕체", Font.PLAIN, 30));
           panelRe4.add(titletxt2);
           
           JButton backMain = new JButton("메인으로");
           backMain.setBounds(510, 670, 180, 80);
           backMain.setFont(new Font("고딕체", Font.PLAIN, 20));
           backMain.setForeground(Color.WHITE);
           backMain.setBackground(new Color(204,51,51));
           add(backMain);
          
          backMain.addMouseListener(new ChangePanelHandler(main, this, prev));
        
          
          searchNum.addMouseListener(new MouseAdapter() {

              @Override
                public void mouseClicked(MouseEvent e) {
                 
                // BookerDB db=new BookerDB();
                // Booker b=(Booker)db.bkList.get(0);
                 
              ArrayList d=(ArrayList)bd.fileLoad();
                String input=numInput.getText();
                
                
               
                
               // if(d.size()>0) {
                   
                   boolean ch=true;
                   
                   if(numInput.getText().length()==8){
                      
                      try {
                      for(int i=0;i<d.size();i++) {
                         if(d.get(i) instanceof Booker) {
                            Booker b=(Booker)d.get(i);
                         
                         
                            if(b.getReserveNo().equals(input)) {

                               //이름,전화번호,날짜 및 시간,차정보,보험종류,최종가격



                               lb.setText("- 예약자 정보 : "+b.getName()+" / "+b.getPhone());
                               lb2.setText("- 렌트 기간 : "+sdf.format(b.getRent().getTimeInMillis())+"~"+sdf.format(b.getCollect().getTimeInMillis()));

                               lb3.setText("- 차량 정보 : "+b.getType()+" / "+b.getBrand()+" / "+b.getModel());
                               lb4.setText("- 보험 종류 : "+b.getInsurance());

                               lb6.setText("- 최종가격 : "+b.getPrice()+"원");
                               
                               ch=false;

                               
                            }
                         }
                      }
                      }catch(NullPointerException n) {
                         ch=true;
                      }
                      if(ch) {
                         JOptionPane.showMessageDialog(null, "예약된 정보가 없습니다. \n 다시 확인해주세요.", "예약번호 확인", JOptionPane.WARNING_MESSAGE);
                      }


                   }else{
                      JOptionPane.showMessageDialog(null, "8자리를 입력해주세요.", "예약번호 확인", JOptionPane.WARNING_MESSAGE);
                   //}
                }
//              else{
//                  JOptionPane.showMessageDialog(null, "8자리를 입력해주세요.", "예약번호 확인", JOptionPane.WARNING_MESSAGE);
//              } 



                
                
                
                   
                
                   
               
//                 if(BookerDB.getBk().size()!=0) {
//               
//                 
//                 input=numInput.getText();
//;
//                   
//                 if (input.length()!=8) {    
//                         JOptionPane.showMessageDialog(null, "8자리를 입력해주세요.", "예약번호 확인", JOptionPane.WARNING_MESSAGE);
//                         
//                    } else if(db.bkList.get(0) instanceof Booker) { 
//                      
//                       
//                    } else if(b.getReserveNo().equals(input)) {
//
//                         //이름,전화번호,날짜 및 시간,차정보,보험종류,최종가격
//                         
//                         SimpleDateFormat sdf=new SimpleDateFormat("YY.MM.dd.HH시");
//                      
//                         lb.setText("- 예약자 정보 : "+b.getName()+" / "+b.getPhone());
//                         lb2.setText("- 렌트 기간 : "+sdf.format(b.getRent().getTimeInMillis())+"~"+sdf.format(b.getCollect().getTimeInMillis()));
//                         lb3.setText("- 차량 정보 : "+b.getType()+" / "+b.getBrand()+" / "+b.getModel());
//                         lb4.setText("- 보험 종류 : ");
//                         lb5.setText("- 보험 종류 : "+);
//                         lb6.setText("- 최종가격 : "+b.getPrice()+"원");
//                      
//                          JTextArea text = new JTextArea(6,6);
//                          text.setLineWrap(true);
//                          text.setWrapStyleWord(true);
//                          text.setEditable(false);
//                          setBounds(100, 290, 1000, 360);
//                          text.setText("이름 : "+((Booker)db.bkList.get(0)).getName()+"\n종류 : "+((Booker)db.bkList.get(0)).getType());
//                          text.setText("asfsafasfasfasfsafsafaf");
//                         panelRe3.add(text);
//                      
//                    }
//                       
//                    } else { //예약리스트에 없으면 
//                       JOptionPane.showMessageDialog(null, "예약된 정보가 없습니다. \n 다시 확인해주세요.", "예약번호 확인", JOptionPane.WARNING_MESSAGE);
//                       
//                       }
//                 }else {
//                    
//                     input=numInput.getText();
//                    if (input.length()!=8) {    
//                         JOptionPane.showMessageDialog(null, "8자리를 입력해주세요.", "예약번호 확인", JOptionPane.WARNING_MESSAGE);
//                    }else {
//                    JOptionPane.showMessageDialog(null, "예약된 정보가 없습니다. \n 다시 확인해주세요.", "예약번호 확인", JOptionPane.WARNING_MESSAGE);
//                    }
//                    }
//              
//          
//              }
//
                
              }
              });
          
          
   
          
          
       
       
    
}
          }
   
   
   