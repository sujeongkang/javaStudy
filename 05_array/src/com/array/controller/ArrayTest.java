package com.array.controller;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayTest {
Scanner sc=new Scanner(System.in);
	public void basicArray() {
		//기본 배열 선언과 할당하기
		int[] intArr=new int[3]; //선언한 동일 자료형만 배열에 들어갈 수 있음.
		//인트형의 배열생성 3칸의 배열 [0][1][2]
		//double 배열 선언하기
		double[] doubleArr=new double[3]; //0.0
		//String 배열 선언하기
		String[] strArr=new String[3];//null
		//char 배열 선언하기
		char[] chArr=new char[3];//""
		//디폴트 값 확인
		System.out.println(doubleArr[0]); //0.0
		System.out.println(strArr[0]);
		System.out.println(chArr[0]);
		
		
		//값을 대입/출력하기
		intArr[0]=20;
		//intArr[2]="저녁"; //자료형이 다름.다른 타입은 들어갈 수없다.
		
		System.out.println(intArr[0]);
		System.out.println(intArr[1]); //heap에서 생성되면 기본으로 defalt값으로 int형은  0이 생김, String형은 NULL, char형은  ""
		int a = 0;
		System.out.println(a);
		
		//String 5개를 저장할 수 있는 공간을 확보하고
		//자신이 좋아하는 과일 을 5개변수에 저장하고 출력하기!
		String[] fruits=new String[5];
		//인덱스 번호: 0 1 2 3 4
		fruits[0]="오렌지"; //문자열 변수 하나와 같음
		fruits[1]="수박";
		fruits[2]="포도";
		fruits[3]="복숭아";
		fruits[4]="망고";
		//출력하기
		//System.out.println(); //syso + ctrl + space 자동완성
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		System.out.println(fruits[4]);
		//for문을 이용하여 출력하기
		for(int i=0;i<5;i++) {
			//System.out.println(i); //0,1,2,3,4
			System.out.println(fruits[i]);
		}
		//fruits //스트링 배열변수
		fruits=new String[3];//5칸이었던 배열이 3칸으로 주소를 달리해 힙에 새로 생성 , 기존에 있던 배열은 연결이 끊겨 쓰레기 생성.GC치움.
		
		System.out.println("[3]"+fruits.length);
		fruits=new String[100];
		System.out.println("[100]"+fruits.length);
		
		
		//for문을 이용하여 값 대입하기
		
		//for(int i=0;i<5;i++) { //고정 값이 아니라 length를 이용하여 변하게 할 수 있음.
		for(int i=0;i<fruits.length;i++) {
			fruits[i]="수박"; //자동으로 배열에 모두 "수박"
			//ArratIndexOutOfBoundsException 위에 배열이 3으로 선언됨으로 써 범위보다 큰 배열을 선언시 뜨는 에러
		}  //배열 입력따로
		///////////////////////////////////////
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}  //배열 출력 따로 구분해서 화면구현함.
		
		//정수 5개를 저장할 수 있는 공간을 확보하고 
		//각 공간에 1~5까지 값을 대입하기
		int[] nums=new int[5];
		for(int i=0;i<nums.length;i++) {
			nums[i]=i+1;
					
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		//이름을 입력받고 출력 프로그램 만들기
		//1.client로 부터 몇명이름을 입력할지 입력받고
		//2.그 수 만큼 배열을 만들어 이름을 입력받아 저장하기
		//3.배열을 출력하기
		
		System.out.print("몇 명? : ");
		int su=sc.nextInt();
		
		String[] names=new String[su]; //입력한 수 크기의 배열 생성
		
		for(int i=0;i<names.length;i++) { //배열 길이 만큼 이름입력
			System.out.print("이름: ");
			names[i]=sc.next();
			
		}for(int i =0;i<names.length;i++) {
			System.out.println(names[i]); 
			//이때까지 입력한 것 한번에 출력하기 위해서는 별도 선언이 필요
			//구현할때 구분하기 때문에  따로이해필요
		}
		//배열을 선언할 때 선언과 동시에 초기화
		int age=19; //변수선언방법
		
		int[] numbers= {1,2,3,4,5}; // 배열선언{0번 ,1번 ,2번 ,3번 ,4번 인덱스에 보관되는!}
		System.out.println(numbers[3]); //4
		String[] nn= {"김대욱","인하준","이하영","오수완"};
		System.out.println(nn[0]); //김대욱
		//names = {"원빈","송중기","공유","홍석천"};//이미 할당된 배열은 이렇게 선언 불가
		names=new String[]{"원빈","송중기","공유","홍석천"};//할당된 배열 내용 바꾸기
		System.out.println(names[0]);//원빈
		
	}
	//배열에 값을 넣는 기능
	public void inputArray(String[] temp) {
		
		for(int i=0;i<temp.length;i++) {
			System.out.print("입력: ");
			temp[i]=sc.nextLine();
		}
	}
	public void printArray(String[] t) {//출력기능
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i]);
		}
	}
	 //입출력 기능이 다른 클래스나 메소드에 있을 수 있다.
	
	 
	public void arrayCopy() {
		//얕은 복사  //주소값을 복사해서 생성된 배열변수를 같이 쓰는것
		char[] chs= {'A','B','C','D'};
		char[] copyCh=chs; //chs의 생성된 주소를 copyCh에 넣기
		chs[0]='나'; //배열 chs나 배열 copyCh 둘다 'A'가 '나'로 변경
		//주소값이 같이 공유하기 때문에 heap에 있는 원본파일이 변경되어 같이 구현됨.
		copyCh[copyCh.length-1]='다'; 
		//[length]은 배열의 크기: 4, [length-1]은 [3],인덱스 번호 3 값은 'D' 
		//위에 두식  다 주소값이 같아 같은파일이 변경됨
		System.out.println("======chs원본값=======");
		for(int i=0;i<chs.length;i++) {
			System.out.print(chs[i]);
		}
		System.out.println();
		System.out.println("=======복사된 값======");
		for(int i=0;i<copyCh.length;i++) {
			System.out.print(copyCh[i]);
		}
		System.out.println();
		System.out.println(chs+":"+copyCh); 
		//주소값이 같음. 똑같은 위치로 가서 주소값을 참조하고있다.
		//[C@74a14482:[C@74a14482 16진수 주소값
		
		
		//깊은 복사
		//heap영역에 배열공간을 추가적으로 만들어서 값을 복사하는 것!
		//원본 파일 저장소랑 복사본의 저장소 위치(주소)가 다름. 값만!!!!!!! 복사
		//복사 파일을 수정해도 원본 파일 변경 x
		
		//1.for문  
		//2.system.arraycopy(arr1,0,arr2,0,arr.length)
		// (복사당할 배열, 시작값 , 복사할 위치의 배열,  시작값 , 갯수)
		
		
		String[] str= {"집","에","가","자"};
		String[] str2=new String[str.length]; //str과 같은 크기의 배열 할당.
		//1. for문을 이용한 복사
		for(int i=0;i<str.length;i++) {
			str2[i]=str[i];
		}
		str[0]="공부"; //원본 값을 변경.복사본은 변경 되지 않음.
		str2[str2.length-1]="지말자";//str2의 마지막 인덱스만 변경됨.
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
		System.out.println();
		for(int i=0;i<str2.length;i++) {
			System.out.print(str2[i]); 
		}		
		System.out.println();
		
		
		//2.System.arraycopy 메소드 이용 복사하기
		//원하는 위치의 값을 원하는만큼 원하는 위치에 복사할 수있음.
		String[] str3=new String[str.length]; //원본 str크기의 str3 배열 새로 생성
		//할당필요
		//System.arraycopy(str,0,str3,0,str.length);//length는 범위: 전체복사
		System.arraycopy(str,2,str3,2,2);
		//str[2]에 부터 2개'가','자'를 str3[2]부터2개[3]까지를 '가''자'로 변경
		//저장 받은 str3의 배열크기 고려 필요.
		
		//배열을 직접 할당해서  할당한 변수에 값을 복사하는 것
		
		
		
		
		//for(i=0;i<str.leng....
		//for each문을 사용해보자!
		//배열이나, collection객체의 값에 접근할 때 사용
		//for(배열 자료형의 변수 : 배열 OR collection객체){  로직   }
		System.out.println();
		//for(초기식,조건식,증감식)생략
		for(String v : str) { //str에 여러 배열의 값을 저장.  공부 에 가 자  
			//str 의 [0]부터 [3]까지 자동으로 변수에 연관인덱스가 자동으로 들어가면서 순차적으로 돌아감.
			System.out.print(v);//들어간 값을 자동 출력
		} 
		System.out.println();
		for(String v : str3) {
			//변수명으로 v말고 다른 이름으로도 선언가능
			System.out.print(v);
		}
		System.out.println();
		
		
		//Array.copyOf(), clone() 배열변수만 선언하고 대입해주면 됨
		//*할당이 필요없음 new 필요x
		
		//3.Arrays.copyOf() 메소드 이용해서 복사
		//배열을 할당하지 않고 변수만 선언한 후 복사함
		String[] str4;
		str4=Arrays.copyOf(str, str.length);
		str4[0]="곧 퇴근!";
		for(String temp:str4) {
			System.out.print(temp);
		}
		System.out.println();
		
		
		//Arrays.copyOf();
		String[] str5; //NULL
		//System.out.println(str5); //아무것도 없는상태
		str5=Arrays.copyOf(str,str.length);//Arrays.copyOf생성한 배열을 대입!
		System.out.println(str5);
		for(String v:str5) {
			System.out.println(v);
		}
		
		//clone()  ->객체를 복사하는 기능을 하는 메소드
		//배열변수명.clone();  
		str5=str.clone();
		for(String v: str5) {
			System.out.println(v);
		}
		
		
	}
	
	
	public void arrayTest() {
		int[] nums= {1,2,3,4,5};//배열 선언과 동시에 초기화
		//nums=new int[5];
		//nums[0]=1;
		//nums[1]=2;
		//nums[2]=3;
		//nums[3]=4;
		//nums[4]=5;
		nums=new int[]{4,5,6,7};//선언후 배열값을 초기화
	}
	
	//이차원 배열 사용하기
	public void doubleArray() {
		//이차원 배열 선언하기
		int[][] numbers=new int[3][3];
		//이차원 배열에 값 대입하기
		numbers[0][0]=300;
		numbers[0][1]=100;
		numbers[0][2]=200;
		numbers[1][0]=30;
		numbers[1][1]=20;
		numbers[1][2]=50;
		
		//이차원 배열 출력하기
		System.out.println(numbers[1][1]);
		System.out.println(numbers);//number의 주소가 들어 있는 주소값[[I@677327b6
		System.out.println(numbers[0]);//각각의 주소값으로 연결//[I@14ae5a5
		
		//이차원 배열의 선언과 동시에 초기화!
		int[] a= {1,2,3,4};
		int[][] num2= {{1,2,3,4},{5,6,7,8}};
		//new int[2][4];
		numbers= new int[][]{{10,20,},{50,60,}};
		numbers= new int[2][];
		numbers[0]=new int[10];
		numbers[1]=new int[2];
		//선언된 이차원 배열 초기화;
		
		//for문을 이용하여 이차원배열 처리하기!
		//numbers 출력해보자
		//for(int i=0;i<3;i++) {
		//	for(int j=0;j<3;j++) {
		//	 System.out.println(i+":"+j);
		//	}
		//}
		//300 100 200 
		//30 20 50 
		//0 0 0 
		//for(int i=0;i<3;i++) { //배열의 길이가 바뀌면 ArrayIndexOutOfBoundsException
			//for(int j=0;j<3;j++) {
		for(int i=0;i<numbers.length;i++) {	//배열의 주소를 가지고 있어 length사용가능
			//배열의 길이가 바뀌어도 자동으로 적용.
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	public void test1() {
		int[][] num=new int[15][11];
		int a=1;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<11;j++) {
				num[i][j]=a;
				System.out.print(num[i][j]+" ");
				a++;
			}
			System.out.println("");
		}
	}
	public void test2() {
		int[][] stu=new int[2][6];
		
		
	}
	

}
