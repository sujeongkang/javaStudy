package com.condition.function;
import java.util.Scanner;
public class SwitchTest {
		public void basicSwitch() {
			Scanner sc=new Scanner(System.in);
			//switch�� ����ϱ�
			//switch(����){case ��: ó������; break; case ��: ó������; break;.....}
			System.out.print("����� ������(10��?20��?30��?): ");
			int choice=sc.nextInt();
			switch(choice) {
				case 10 : System.out.println("���� �ռ��� 10��!");break;//���ͷ��� ����. �ڷ��� �� �����!
				case 20 : System.out.println("20��!");break;
				case 30 : System.out.println("���� �̷�� 30��!");break;
			}
			//���α׷� �޴������
			System.out.println("=====���α׷� v0.1=====");
			System.out.println("��. ����ȭ��");
			System.out.println("��. ȸ������");
			System.out.println("��. �α���");
			System.out.print("�Է�(��,��,��): ");
			char cho=sc.next().charAt(0);
			switch(cho){
				case '��' : System.out.println("===����ȭ��===");break;
				case '��' : 
					System.out.println("===ȸ������ȭ��===");
					sc.nextLine();
					System.out.print("id: ");
					String id=sc.nextLine();
					System.out.print("password: ");
					String pw=sc.nextLine();
					break;
				case '��' : 
					System.out.println("===�α���==");
					sc.nextLine();
					System.out.print("id: ");
					String id1=sc.nextLine();
					System.out.print("password: ");
					String pw1=sc.nextLine();
					if(id1.equals("admin")&&pw1.equals("1234")) {
						System.out.println("�α��� ����");
					}else {
						System.out.println("�α��� ����");
					}
					break;
			}

			//switch���� ���ڿ��� ������
			System.out.println("�����ϴ� ���� ����");
			sc.nextLine();
			String fruit=sc.nextLine();
			switch(fruit) {
				case "����" : System.out.println("�ÿ��� ���� ����");break; 
				//break���� ���� ��� �ش��ٿ������� �Ʒ��� ���� ��� ����
				case "���" : System.out.println("�� �Ծ");break;
				case "�θ���" : System.out.println("�̰� ��¥?");break;
				case "������" : System.out.println("������ ������!");break;
				default : System.out.println("�ش��ϴ� ������ �����ϴ�."); 
			}//break ��������
			
			//�� 31��, 1,3,5,7,8,10,12  //30��,  4,6,9,11,28  // 28��, 2
			//�� ���� ���ڸ� ����ϴ� ���� �����ϱ�
			//switch������ 
			System.out.print("�� ������ �Է��Ͻÿ�:");
			int month=sc.nextInt();
			switch(month) { //switch���� ���ͷ��� �Է°���
				case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
					System.out.println("31��");break;
				case 4: case 6: case 9: case 11: System.out.println("30��");break;
				case 2 : System.out.println("28��");break;
				default : System.out.println("���� �� �Դϴ�.");
			}
			
		}
}
