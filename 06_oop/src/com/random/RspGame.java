package com.random;
import java.util.Scanner;
public class RspGame {
	public static void main(String[] args) {
	//가위.바위,보
	//입력받아 비기면 다시하고 이기면 끝나는게임
	Scanner sc=new Scanner(System.in);
	System.out.println("=======가위바위보 게임v1==========");
	int com,user;
	String[] rsp= {"가위","바위","보"};
	do {
		com=0;
		user=0;
		System.out.println("[1.가위/2.바위/3.보]");
		System.out.print("무엇을 낼지 선택해주세요 (숫자) : ");
		user=(sc.nextInt()-1);
		
		com=(int)(Math.random()*3);
		
			if(user==com){
					System.out.println("유저:"+rsp[user]+"   VS  "+"컴퓨터:"+rsp[com]);
					System.out.println("비겼습니다. 한번 더!");
			}else if((user==0&&com==1)||(user==1&&com==2)||(user==2&&com==0)) {
					System.out.println("유저:"+rsp[user]+"   VS  "+"컴퓨터:"+rsp[com]);
					System.out.println("You lose...");
			}else if((user==0&&com==2)||(user==1&&com==0)||(user==2&&com==1)) {
					System.out.println("유저:"+rsp[user]+"   VS  "+"컴퓨터:"+rsp[com]);
					System.out.println("You Win!");	
			}
		}while((user-com)==0);	
	}
	
}
	/*if(user==0) {
			if(com==0){
				System.out.println("유저:"+rsp[user]+"  VS  "+"컴퓨터:"+rsp[com]);
				System.out.println("비겼습니다. 한번 더!");
			}
			else if(com==1) {
				System.out.println("유저:"+rsp[user]+"  VS  "+"컴퓨터:"+rsp[com]);
				System.out.println("You lose...");
			}else if(com==2) {
				System.out.println("유저:"+rsp[user]+"  VS  "+"컴퓨터:"+rsp[com]);
				System.out.println("You Win!");	
			}
		}
		else if(user==1) {
			if(com==0) {
				System.out.println("유저:"+rsp[user]+"  VS  "+"컴퓨터:"+rsp[com]);
				System.out.println("You Win!");
			}
			else if(com==1){
				System.out.println("유저:"+rsp[user]+"  VS  "+"컴퓨터:"+rsp[com]);
				System.out.println("비겼습니다. 한번 더!");
			}
			else if(com==2) {
				System.out.println("유저:"+rsp[user]+"  VS  "+"컴퓨터:"+rsp[com]);
				System.out.println("You lose...");
			}
		}
		else if(user==2) {
			if(com==0) {
				System.out.println("유저:"+rsp[user]+"  VS  "+"컴퓨터:"+rsp[com]);
				System.out.println("You lose...");
			}
			else if(com==1) {
				System.out.println("유저:"+rsp[user]+"  VS  "+"컴퓨터:"+rsp[com]);
				System.out.println("You Win!");
			}
			else if(com==2){
				System.out.println("유저:"+rsp[user]+"  VS  "+"컴퓨터:"+rsp[com]);
				System.out.println("비겼습니다. 한번 더!");
			}
		}	
	   }while((user-com)==0);*/

