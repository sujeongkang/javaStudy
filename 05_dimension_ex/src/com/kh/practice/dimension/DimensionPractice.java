package com.kh.practice.dimension;
import java.util.Scanner;

public class DimensionPractice {
	
	Scanner sc=new Scanner(System.in);
	
	public void practice1() {
		String[][] num=new String[3][3];
//		num[0][0]="(0, 0)";
//		num[0][1]="(0, 1)";
//		num[0][2]="(0, 2)";
//		num[1][0]="(1, 0)";
//		num[1][1]="(1, 1)";
//		num[1][2]="(1, 2)";
//		num[2][0]="(2, 0)";
//		num[2][1]="(2, 1)";
//		num[2][2]="(2, 2)";
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				num[i][j]="("+i+","+j+") ";
				System.out.print(num[i][j]);
				
			}
			
			System.out.println("");
		}
	}
	
	public void practice2() {
		int[][] num=new int[4][4];
		int a=1;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<4;j++) {
				num[i][j]=a;
				a++;
				System.out.print(num[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	
	
	public void practice3() {
		int[][] num=new int[4][4];
		int v=16;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				num[i][j]=v;
				v--;
				System.out.print(num[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	public void practice4() {
		int[][] num=new int[4][4];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				num[i][j]=(int)((Math.random()*10)+1);
			}
		}
		//3열
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				num[i][3]+=num[i][j];
			}
		}
		//3행
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				num[3][j]+=num[i][j];
			}
		}
		for(int i=0;i<4;i++) {
			for(int v:num[i]) {
				System.out.print(v+" ");
			}System.out.println(" ");
		}
		
	}
		
	public void practice5() {
		int h,y;
		do{ 
			System.out.print("행 크기: ");
			h=sc.nextInt();
			if(h<1||h>10) {
				System.out.println("1~10사이의 정수를 입력해야 합니다.");
			}
		}while(h<1||h>10);
		do{ 
			System.out.print("열 크기: ");
			y=sc.nextInt();
			if(y<1||y>10) {
				System.out.println("1~10사이의 정수를 입력해야 합니다.");
			}
		}while(y<1||y>10);
		
		char[][] arr=new char[h][y];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int rand=((int)(Math.random()*26)+65);
				char v=(char)rand;
				arr[i][j]=v;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, 
			{"원", "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
		String[][] strArr2=new String[5][5];
		
		for(int j=0;j<strArr.length;j++) {
			for(int i=0;i<strArr.length;i++) {
				strArr2[i][j]=strArr[j][i];
			}
		}
		for(int i=0;i<strArr.length;i++) {	
			for(String v : strArr2[i]) {
				System.out.print(v+" ");
			}System.out.println("");
		}
	}	
	
	public void practice7() {
		//행할당
		System.out.print("행의 크기:");
		char[][]arr=new char[sc.nextInt()][];
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+"행의 열 크기: ");
			arr[i]=new char[sc.nextInt()];
		}
		char ch='a';
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=ch++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
									 	
	public void practice8() {
		String[] stu= {"간건강","남나나","도대담","류라라","문미미","박보배",
				"송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		int k=0;
		String[][] cl1=new String[3][2];
		String[][] cl2=new String[3][2];
		System.out.println("======1분단=====");
		for(int i=0;i<cl1.length;i++) {
			
			for(int j=0;j<cl1[i].length;j++) {
			
				cl1[i][j]=stu[k++];
				System.out.print(cl1[i][j]+" ");
			}System.out.println(" ");
		}
		System.out.println("====2분단=====");
		k=stu.length-6;
		for(int i=0;i<cl2.length;i++) {
			for(int j=0;j<cl2[i].length;j++)
			{
				cl2[i][j]=stu[k++];
				System.out.print(cl2[i][j]+" ");
			}System.out.println(" ");
		}
	}
	
	public void practice9() {
		String[] stu= {"간건강","남나나","도대담","류라라","문미미","박보배",
				"송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		int k=0;
		String[][] cl1=new String[3][2];
		String[][] cl2=new String[3][2];
		System.out.println("======1분단=====");
		for(int i=0;i<cl1.length;i++) {
			
			for(int j=0;j<cl1[i].length;j++) {
			
				cl1[i][j]=stu[k++];
				System.out.print(cl1[i][j]+" ");
			}System.out.println(" ");
		}
		System.out.println("====2분단=====");
		k=stu.length-6;
		for(int i=0;i<cl2.length;i++) {
			for(int j=0;j<cl2[i].length;j++)
			{
				cl2[i][j]=stu[k++];
				System.out.print(cl2[i][j]+" ");
			}System.out.println(" ");
		}
		
		System.out.println("=========================================");
		System.out.print("검색할 학생 이름을 입력하세요: ");
		String name=sc.nextLine();
		for(int i=0;i<cl1.length;i++) {
			for(int j=0;j<cl1[i].length;j++) {
				if(cl1[i][j].equals(name)) {
					System.out.println("검색하신 "+name+"학생은 1분단"+(i+1)+"번째줄 "+(j==0?"왼쪽":"오른쪽")+"에 있습니다.");
				}
			}
		}
		for(int i=0;i<cl2.length;i++) {
			for(int j=0;j<cl2[i].length;j++) {
				if(cl2[i][j].equals(name)) {
					System.out.println("검색하신 "+name+"학생은 2분단"+(i+1)+"번째줄 "+(j==0?"왼쪽":"오른쪽")+"에 있습니다.");
				}
			}
		}
		
			
	}
	public void practice10() {
		System.out.print("정수 하나 입력: ");
		int num=sc.nextInt();
		if(num>0) {
			
			for(int i=1;i<=num;i++) {
				
				for(int j=1;j<i;j++) {
					
					System.out.print("*");
					
				}System.out.println(i);
				
			}
		}else {
			System.out.println("양수가 아닙니다.");
		}
	}
	public void practice11() {
		System.out.print("정수 하나 입력: ");
		int num=sc.nextInt();
		
//		if(num>0) {
//			for(int i=0;i<num;i++) {
//				for(int j=1;j<=num;j++) {
//					
//					System.out.print(j);
//				}System.out.println("");
//			}	
//		}else {
//			System.out.println("양수가 아닙니다.");
//		}
		if(num>0) {
			int[][]a=new int[num][num];
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					a[i][j]=j+1;
				}
			}
			for(int i=0;i<a.length;i++){
				
				for(int v:a[i]) {
					System.out.print(v+" ");
				}System.out.println(" ");
			}
			
			
		}else{
			System.out.println("양수가 아닙니다.");
		}
		

	}
	public void practice12() {
		System.out.print("정수 하나 입력: ");
		int num=sc.nextInt();
		
		if(num>0) {
			String[][]star=new String[num][];
			for(int i=0;i<star.length;i++) {
				star[i]=new String[i+1];
				for(int j=0;j<star[i].length;j++) {
					
					star[i][j]="*";
					System.out.print(star[i][j]);
				}System.out.println(" ");
			}
			
			
		}else if(num<0) {
			String[][]star=new String[-num][-num];
			for(int i=0;i<star.length;i++) {
				for(int j=0;j<star[i].length;j++) {
					if(i>j) star[i][j]=" ";  //행넘버가 열넘버보다 클때만 공백
					else star[i][j]="*";//그 외에는 *반복
					System.out.print(star[i][j]);
				}System.out.println(" ");
			}
				
		}else {
			System.out.println("양수가 아닙니다.");
		}
		
		
	}
	public void practice13() {
		System.out.print("정수입력: ");
		int num=sc.nextInt();
		
		String[][]star=new String[num][];
		for(int i=0;i<star.length;i++) {
			star[i]=new String[i+1];
			for(int j=0;j<star[i].length;j++) {
				star[i][j]="*";
				System.out.print(star[i][j]);
			}System.out.println(" ");
		}
		String[][]star2=new String[num][num];
		for(int i=0;i<star2.length;i++) {
			for(int j=0;j<star2[i].length;j++) {
				if(i>=j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println(" ");
		}
	}
	
	public void practice14() {
		int num=5;
		System.out.println("Q1.");
		for(int i=0;i<num;i++) {
			System.out.print("*");
		}System.out.println("");
		
		System.out.println("Q2.");
		for(int i=0;i<num;i++) {
			System.out.println("*");
		}
		
		System.out.println("Q3.");
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print("*");
			}System.out.println(" ");
		}
		
		System.out.println("Q4.");
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print(i+1);
			}System.out.println("");
		}
		
		System.out.println("Q5.");
		for(int i=01;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print(j+1);
			}System.out.println(" ");
		}
		
		System.out.println("Q6.");
		for(int i=0;i<num;i++) {
			for(int j=i;j<num+i;j++) {
				System.out.print(j+1);
			}System.out.println("");
		}
		System.out.println("Q7.");
		for(int i=0;i<num;i++) {
			for(int j=num-i;j<num+num-i;j++) {
				System.out.print(j);
			}System.out.println("");
		}
		System.out.println("Q8.");
		for(int i=0;i<num;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}System.out.println("");
		}
		System.out.println("Q9.");
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i;j++) {
				System.out.print("*");
			}System.out.println("");
		}
		System.out.println("Q.10");
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i>j) System.out.print(" ");
				else System.out.print("*");
			}System.out.println("");
		}
		System.out.println("Q.11");
		for(int i=0;i<num;i++) {
			for(int j=num-1;j>0;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println("");
		}
		
	}
	public void practice15() {
		System.out.print("가로행의 크기: ");
		int h=sc.nextInt();
		System.out.print("세로열의 크기: ");
		int y=sc.nextInt();
		char[][]a=new char[y][h];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
					a[i][j]=(char) ((int)(Math.random()*26)+65);
					System.out.print(a[i][j]);
			}System.out.println(" ");
		}
	
		
		
	}
	
	
	
}

