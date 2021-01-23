package test.array.premitive;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class ArraySample {
	
	Scanner sc=new Scanner(System.in);	
	
	public void test1() {
		int[] num=new int[10];
		int sum=0;
		for(int i=0;i<num.length;i++) {
			num[i]=(int)((Math.random()*100)+1);
		}
		for(int v: num) {
			sum+=v;
		}
		System.out.println(sum);
	}
	
	public void test2() {
		int max=0;
		int min=100;
		int[] num=new int[10];
		for(int i=0;i<num.length;i++) {
			num[i]=(int)((Math.random()*100)+1);	
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min){
				min=num[i];
			}
		}
//		for(int v: num) {
//			System.out.print(v+" ");
//		}//난수 확인.
		System.out.println("최대값: "+max+", 최소값: "+min);
		
	}
	public void test3() {
		byte sum=0;
		byte[] b=new byte[10];
		for(int i=0;i<b.length;i++) {
			//Byte.MAX_VALUE byte 최대값
			b[i]=(byte)((Math.random()*Byte.MAX_VALUE));
			if(b[i]%2==0) {
				sum+=b[i];
			}
		}
//		for(byte v:b) {
//			System.out.print(v+" ");
//		}
		System.out.println(sum);
	}
	public void test4() {
		System.out.print("문자열(숫자) 입력: ");
		String input=sc.nextLine();
		
		String[]nums=new String[input.length()];
		int sum=0;
		for(int i=0;i<input.length();i++) {
			nums[i]=input.substring(i,i+1);
			sum+=Integer.parseInt(nums[i]);
		}
		System.out.println("합계: "+sum);
			
		
	}
	public void test5() {
		System.out.print("문자열(숫자) 입력: ");
		String input=sc.nextLine();
		
		char[] nums=new char[input.length()];
		int sum=0;
		for(int i=0;i<input.length();i++) {
			nums[i]=input.charAt(i);
			sum+=nums[i]-'0';
		}
		System.out.println(sum);
	}
	
	public void test6() {
		//1. 문자열 변수 초기화 
		String personID="881225-1234567";
		//2. 문자열에서 생년, 생월, 생일, 성별에 대한 값을 분리 추출함
		String yearStr=personID.substring(0,2);
		String monthStr=personID.substring(2,4);
		String dateStr=personID.substring(4,6);
		String genderStr=personID.substring(7,8);
		int year=Integer.parseInt(yearStr)+1900;
		int month=Integer.parseInt(monthStr);
		int date=Integer.parseInt(dateStr);
		int gender=Integer.parseInt(genderStr);
		//3. java.util 패키지의 날짜 관련 클래스
		//4. 생일의 요일이 무슨 요일이었는지 제공되는 메소드를 사용해서 확인출력
		GregorianCalendar birth=new GregorianCalendar(year,(month-1),date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String strDate=sdf.format(birth.getTimeInMillis());
		//System.out.println(strDate);
		//5. 성별값이 1이면 남자, 2이면 여자라고 출력함
		String gen="";
		if(gender==1) {
			gen="남자";
		}else if(gender==2) {
			gen="여자";
		}
		//6. 날짜 데이터로 바꾼 값에서 년도만, 오늘 날짜의 년도를 빼서 나이 계산 출력함
		GregorianCalendar today=new GregorianCalendar();
		int toyear=today.get(Calendar.YEAR);
		int biryear=birth.get(Calendar.YEAR);
		int age=toyear-biryear;
		
		
		System.out.println("생일:"+strDate+"\n성별:"+gen+"\n나이:"+age);	
		
	}
}
