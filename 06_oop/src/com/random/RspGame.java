package com.random;
import java.util.Scanner;
public class RspGame {
	public static void main(String[] args) {
	//����.����,��
	//�Է¹޾� ���� �ٽ��ϰ� �̱�� �����°���
	Scanner sc=new Scanner(System.in);
	System.out.println("=======���������� ����v1==========");
	int com,user;
	String[] rsp= {"����","����","��"};
	do {
		com=0;
		user=0;
		System.out.println("[1.����/2.����/3.��]");
		System.out.print("������ ���� �������ּ��� (����) : ");
		user=(sc.nextInt()-1);
		
		com=(int)(Math.random()*3);
		
			if(user==com){
					System.out.println("����:"+rsp[user]+"   VS  "+"��ǻ��:"+rsp[com]);
					System.out.println("�����ϴ�. �ѹ� ��!");
			}else if((user==0&&com==1)||(user==1&&com==2)||(user==2&&com==0)) {
					System.out.println("����:"+rsp[user]+"   VS  "+"��ǻ��:"+rsp[com]);
					System.out.println("You lose...");
			}else if((user==0&&com==2)||(user==1&&com==0)||(user==2&&com==1)) {
					System.out.println("����:"+rsp[user]+"   VS  "+"��ǻ��:"+rsp[com]);
					System.out.println("You Win!");	
			}
		}while((user-com)==0);	
	}
	
}
	/*if(user==0) {
			if(com==0){
				System.out.println("����:"+rsp[user]+"  VS  "+"��ǻ��:"+rsp[com]);
				System.out.println("�����ϴ�. �ѹ� ��!");
			}
			else if(com==1) {
				System.out.println("����:"+rsp[user]+"  VS  "+"��ǻ��:"+rsp[com]);
				System.out.println("You lose...");
			}else if(com==2) {
				System.out.println("����:"+rsp[user]+"  VS  "+"��ǻ��:"+rsp[com]);
				System.out.println("You Win!");	
			}
		}
		else if(user==1) {
			if(com==0) {
				System.out.println("����:"+rsp[user]+"  VS  "+"��ǻ��:"+rsp[com]);
				System.out.println("You Win!");
			}
			else if(com==1){
				System.out.println("����:"+rsp[user]+"  VS  "+"��ǻ��:"+rsp[com]);
				System.out.println("�����ϴ�. �ѹ� ��!");
			}
			else if(com==2) {
				System.out.println("����:"+rsp[user]+"  VS  "+"��ǻ��:"+rsp[com]);
				System.out.println("You lose...");
			}
		}
		else if(user==2) {
			if(com==0) {
				System.out.println("����:"+rsp[user]+"  VS  "+"��ǻ��:"+rsp[com]);
				System.out.println("You lose...");
			}
			else if(com==1) {
				System.out.println("����:"+rsp[user]+"  VS  "+"��ǻ��:"+rsp[com]);
				System.out.println("You Win!");
			}
			else if(com==2){
				System.out.println("����:"+rsp[user]+"  VS  "+"��ǻ��:"+rsp[com]);
				System.out.println("�����ϴ�. �ѹ� ��!");
			}
		}	
	   }while((user-com)==0);*/

