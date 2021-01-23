package com.random;
import java.util.Scanner;
public class Rsp {
 Scanner sc = new Scanner(System.in);
 
 private int com=(int)(Math.random()*3);
 
 private int comR() {  
  return com;
 }
 public void rsp() {
  String [] arr = {"가위","바위","보"};
  //행렬 위치 0~2 순서로 가위 바위 보. wl 안의 0~2는 각각 패,비김,승리를 의미
  int [][] wL = {{1,0,2},{2,1,0},{0,2,1}};
  
  int player, com;
  
  Loop:
  while(true) {
   System.out.println("====가위바위보 프로그램====\n선택하시오.\n1.가위 2.바위 3.보");
   player =sc.nextInt()-1;
   com = new Rsp().comR();
   System.out.println("당신은 "+arr[player]+"를 냈습니다.\n컴퓨터는 "+arr[com]+"를 냈습니다.");
   switch (wL[player][com]) {
    case 0: System.out.println("당신은 졌습니다. 재도전합니다."); break;
    case 1: System.out.println("당신은 비겼습니다. 초기화면으로 돌아갑니다."); break;
    case 2: break Loop;
   }
  }
  System.out.println("당신은 이겼습니다. 시스템을 종료합니다.");
 }
}