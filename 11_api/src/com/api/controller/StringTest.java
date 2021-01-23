package com.api.controller;

import java.util.StringTokenizer;

public class StringTest {
	public static void main(String[] args) {
		
		
		//String 객체 이용해보자...
		//String은 String에 있는 값을 수정, 삽입, 삭제가 불가능함.
		String name="유병승";
		//hashCode()-->Heap영역의 주소값을 의미함. 저장된위치
		System.out.println(name+" : "+name.hashCode());
		
		name+="천재";
		System.out.println(name+ ":"+name.hashCode());
		
		//글자가져다 변경 불가  -->불변
		
		//String 객체에서 유용하게 사용하는 메소드
		//문자열에 있는 문자찾기: contains();
		String test="가나다라마바사아차카";
//		for(int i=0;i<test.length;i++) {
//			if(test.charAt(i).equals('아')) {
//				
//			}
//		}
		System.out.println(test.contains("마"));//t
		System.out.println(test.contains("하"));//f
		test="설진호 화이팅! 공부 열심히 하세요 노트북이랑 그만 싸우고!";
		System.out.println(test.contains("공부"));//t
		System.out.println(test.contains("황진호"));//f
		
		
		//특정문자의 위치를 찾아주는 메소드: indexOf(문자);
		//찾은 문자의 인덱스를 반환해줌. 못찾으면 -1을 반환
		System.out.println(test.indexOf("설"));//0
		System.out.println(test.indexOf("노트북"));//20 노트북 단어의 첫 시작인덱스
		System.out.println(test.indexOf("황진호"));//-1 없다
		System.out.println(test.indexOf(" "));//3 제일먼저나온 공백 위치 인덱스 .처음에 찾은 곳의 인덱스만.
		
		char ch='a';
		int ich=ch;
		
		//중복값이 있을때 두번짹 값 찾기
		//test.indexOf(ch, fromIndex)
		System.out.println(test.indexOf(" ",test.indexOf(" ")+1));//8//첫번째 공백이후의 다음 공백을 찾아라
		test="ttt.file.txt"; //확장자 찾기
		//lastIndexOf() 시작을 뒤에서부터 찾음
		System.out.println(test.lastIndexOf("."));//8
		
		//문자열을 변경해주느 메소드: replace();
		System.out.println(test.replace("txt","hwp"));//원본값이 변경되지 않음.//ttt.file.hwp
		
		String test2=test.replace("txt","jpg");// 변수에 담아야만 변경.
		System.out.println(test2);
		
		System.out.println(test);//ttt.file.txt 원본값 그대로..
		
		
		//문자열 공백을 제거해주는 메소드:trim();
		test="          조        현            ";
		System.out.println(test); //공백있게 출력됨
		test2="조현";
		
		System.out.println(test.trim());//앞뒤 공백이 사라짐. 가운데 공백은 사라지지 않음.의도가 있다고 파악
		System.out.println(test.trim().replace(" ",""));//가운데 공백 지울때 공백을 찾으면 지워라
		System.out.println(test.equals(test2)); //조현            과  조현은 다르게 됨.//false
		System.out.println(test.trim().equals(test2)); //true
		System.out.println(test);//원본값은 안바뀜.
//		if(id.equals(dbid)) { //라인내에서 끝나면 변수에 저장 필요하지 않고, 저장해서 써야 하면 변수에 담음 
//			
//		} //데이터 공백을 가져올수 있어 그때 사용
		
		
		//문자열을 원하는 만큼 잘라서 내는 메소드:substring();
		test="식사시간 저녁시간 저녁메뉴 디너타임!";
		//substring(시작인덱스,끝인덱스) //끝인덱스 전까지만 표기
		System.out.println(test.substring(0,4));	//(0,3)식사시//(0,4)식사시간
		//substring(인덱스) //시작인덱스부터 끝까지 나옴.
		System.out.println(test.substring(9));// 저녁메뉴 디터타임
		//substring() indexOf() 연결하여  사용
		System.out.println(test.substring(test.indexOf("저녁메뉴"),test.indexOf("뉴")+1));
		//저녁메뉴
		
		//파일에 대한 학장자만 잘라내기
		test="test.txt";
		System.out.println(test.substring(test.lastIndexOf(".")+1));//txt
		
		//문자열이 특정구분자로 구분할 수 있으면 그 구분자를 기준으로 
		//배열로 만들어주는 메소드: split(구분자);
		test="유병승,조현,설진호,정로희,김다희,유다해";
		String[] names=test.split(",");
		System.out.println(names[3]);//정로희
		//문자열--> 문자열배열: split();
		//문자열배열->문자열: join();
		for(String v:names) {
			System.out.println(v);
		}
		String returnStr=String.join("*^.~*",names);
		//유병승*^.~*조현*^.~*설진호*^.~*정로희*^.~*김다희*^.~*유다해
		System.out.println(returnStr);
	
		
		
		System.out.println("===StringBuffer===");
		//StringBuffer:문자열을 저장하는 객체
		//저장된 문자열을 변경하는 것이 가능함.
		//객체 -->수정, 삭제, 삽입메소드를 통해서 이루어짐.
		
		StringBuffer sb=new StringBuffer("유병승");
		//StringBuffer를 출력하려면
		System.out.println(sb+":"+sb.hashCode());//유병승:705927765  
		//toString(); 오버라이딩 되어있다.
		//StringBuffer에 값 수정하기
		
		//문자열 추가하기(뒤)
		sb.append("선생님");//원본값이 수정됨. String+=
		System.out.println(sb+":"+sb.hashCode());//유병승선생님:705927765
		
		//원본값이 특정위치에 값을 넣을 수도 있음
		//insert메소드 이용
		sb.insert(3,"아부지");//(저장할위치,저장할문구)
		System.out.println(sb);//유병승아부지선생님
		
		//특정위치의 문자를 삭제 할 수 있음
		//delete메소드
		sb.delete(1, 3);
		System.out.println(sb);//유아부지선생님
		
		//특정위치의 문자를 변경
		//replace()
		sb.replace(3, 6, "천재");
		System.out.println(sb);//유아부천재님
		
		//String과 StringBuffer 호환됨
		String str=new String(sb);
		System.out.println(str); //유아부천재님
		sb=new StringBuffer(str);
		
		//StringBuilder
		StringBuilder sbu=new StringBuilder("유병승");
		sbu.append("하하하");
		System.out.println(sbu);//유병승하하하		
		
		stringTokenTest();
		
	}
	
	
	public static void stringTokenTest() {
		
		System.out.println("=====StringTokenizer======");//토크나이저
		//StringTokenizer클래스 이용하기
		//문자열을 특정 구분자로 분리해내는 객체 //문자열을 구분자로 나누어 각토큰에 보관.
		String str="java,oracle_c_c++,html,css,javascript,jquery,spring";
		//String[] lang=str.split(",");
		StringTokenizer st=new StringTokenizer(str,",_");
		while(st.hasMoreTokens()) {//반복문으로 토큰에 있을때마다.
			String temp=st.nextToken(); 
			//if(temp.contains("c")) {  //c가 있는 단어 출력
				System.out.println(temp);
			}
			
//			if(st.nextToken().contains("c")) {  //c가 들어있니 있으면 출력해봐//에러
//				System.out.println(st.nextToken());
			//첫번째에서 찍고 사라지고, 두번째줄에 다시찍고 사라지고.  둘이 다름.
//			}
//			//System.out.println(st.nextToken()); //쓸때마다 사라잠.
			//System.out.println(st.nextToken());//NoSuchElementException 에러
					//출력문이 둘일경우 2개씩 돌아기때문에 문자열이 홀수라 에러
//		}
		
		
	}
	
	
	
}
