package com.random;
import java.util.Scanner;
public class Rsp {
 Scanner sc = new Scanner(System.in);
 
 private int com=(int)(Math.random()*3);
 
 private int comR() {  
  return com;
 }
 public void rsp() {
  String [] arr = {"����","����","��"};
  //��� ��ġ 0~2 ������ ���� ���� ��. wl ���� 0~2�� ���� ��,���,�¸��� �ǹ�
  int [][] wL = {{1,0,2},{2,1,0},{0,2,1}};
  
  int player, com;
  
  Loop:
  while(true) {
   System.out.println("====���������� ���α׷�====\n�����Ͻÿ�.\n1.���� 2.���� 3.��");
   player =sc.nextInt()-1;
   com = new Rsp().comR();
   System.out.println("����� "+arr[player]+"�� �½��ϴ�.\n��ǻ�ʹ� "+arr[com]+"�� �½��ϴ�.");
   switch (wL[player][com]) {
    case 0: System.out.println("����� �����ϴ�. �絵���մϴ�."); break;
    case 1: System.out.println("����� �����ϴ�. �ʱ�ȭ������ ���ư��ϴ�."); break;
    case 2: break Loop;
   }
  }
  System.out.println("����� �̰���ϴ�. �ý����� �����մϴ�.");
 }
}