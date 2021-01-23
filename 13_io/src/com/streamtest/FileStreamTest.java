package com.streamtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamTest {
	//데이터 지정파일로 출력(저장)하기
	public void outputStream(String data) {
		//RAM ->file로 이동하시키기.
		//1.데이터를 옮길 위치(file) ->File 생성
		//2.file와 Stream연결 -> OutputStream객체 생성! why?램에 있는 것 파일로 옮겨 영속성있게 저장하기위해서 파일에 저장
		//3.메소드를 통해서 data를 보내줌->write();
		//4.OutputStream반환 -> close();
		
		File saveFile=new File("data.bs");//없을때는 생성. 있을때는 연결
		//byte로 데이터를 주고받는 FileOutputStream을 사용해보자.
		FileOutputStream fos=null;//finally구문에서도 써야 하기대문에 밖에 선언
		//checkedException으로 반드시 예외처리를 해줘야 함.
		try {
			fos=new FileOutputStream(saveFile);//자동으로 매개변수로 들어온 파일을 만들고 연결
			//Stream을 열면서 매개변수로 들어온 파일객체를 생성해줌
			//fos.write("123456".getBytes());//램에든 데이터를 파일에 넘겨주는 명령어(하드웨어에 저장). 바이트로 바꿔서 바이트단위로 전송
			
			//외부에서 전달받은 값(매개변수)을 file로 저장하기
			fos.write(data.getBytes());
			
			//fos.write("function test(){alert('하이');}".getBytes());
		}catch(IOException e){
			e.printStackTrace();
		}
		finally {//반드시 클로즈 해주기
			if(fos!=null) {
				try {
					fos.close();
				}catch(IOException e) {
					e.printStackTrace();//console창에 에러정보출력하는 메소드
				}
			}
		}
		
	}
	//저장된것 읽어오기
	public void InputStreamTest() {
		//file에 저장된 내용을 읽어오기
		//InputStream을 사용함
		//1.file을 선택 ->File객체
		//2.FileInputStream을 생성함.
		//3.read()메소드로 데이터를 읽어줌.
		//4.Stream을 닫아줌.
		File load=new File("data.bs");
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(load);
			//파일을 읽어올때는 read로 읽어옴...
			//byte단위로 data를 읽어오기 때문에,
			//전체 데이터를 받으려면... data의 내용이 끝날때까지.
			//반복문을 사용하여 받아옴.
			int value=0;//byte는 int로 연산처리
			StringBuffer sb=new StringBuffer();
			
			while((value=fis.read())!=-1) { //int형으로 받아옴.
				//-1의 기준값은 file에 더이상 읽어올 데이터가 없는 경우
				//-1을 반환해줌. -1: 데이터 다 읽었다!
				//System.out.println((char)value); //한글은 불러올때 깨짐.
				sb.append((char)value);
			}
			System.out.println(sb); //한줄로 죽~출력

		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fis!=null) {//위에서 fis가 생성이 안됬을 경우,참조형변수가 널이기 때문에
							//널에 접근하여 에러가 날수 있어, 조건으로  예외처리  
				try {
					fis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
				
	}
	//문자열 전용 스트림!!
	//Writer/Reader  저장 먼저 그다음 가져오기
	public void writerTest() {
		//1.file 선정
		//2.Stream생성
		//3.데이터 전송 ->write();
		//4.스트림반환
		File f=new File("strData.bs");
		//FileWriter fw=null;
		try(FileWriter fw=new FileWriter(f);){ //try~with~resource
			String msg="배고프고 집에가고싶고 전남친st";
			fw.write(msg);
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	//파일에 저장된 문자열 데이터 불러오기
	public void readerTest() {
		//1.파일선정->File
		//2.스트림생성->FileReader
		//3.파일불러오기->read();// 바이트 형식으로 읽어옴
		//4.스트림반환->close();
		File f=new File("strData.bs");
		try(FileReader fr=new FileReader(f)){
			int value=0;
			String msg="";
			while((value=fr.read())!=-1) {
				//System.out.println((char)value);
				msg+=(char)value;
			}
			System.out.println(msg);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//-----------------------------------------------------------

	//사용자에게 메세지를 입력받고 (0을누를때까지 반복적으로 받음) 그 메세지를 msg.data파일에 저장후
	//msg.data파일의 내용을 출력하는 기능 구현
	//*메세지 내용은 main에서 전달받아서 처리할 것
	
	//	public String saveMsgData(String msg) {
//		//데이터를 받아서 저장하는 기능
//		File f=new File("msg.data");
//		String returnMsg="정상적으로 저장되었습니다.";
//		try(FileWriter fw=new FileWriter(f)){
//			
//			fw.write(msg);//데이터 file에 저장!
//			
//			
//		}catch(IOException e) {
//			e.printStackTrace(); //익셉션 발생할 정보 출력
//			returnMsg="정상적으로 처리되지 않았습니다. 다시 시도하세요";
//		}
//		return returnMsg;
//	}

//	public String loadMsgData() {
//		String result="";
//		try(FileReader fr=new FileReader("msg.data")){
//			
//			int value=0;
//			while((value=fr.read())!=-1) {
//				result+=(char)value;
//			}
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//			result="파일을 불러오는데 에러가 발생했습니다.";
//		}
//		return result;
//	}
	
	//원하는 파일명으로 저장하고 원하는 파일의 내용을 불러올 수 있게 업데이트 하기
	public String saveMsgData(String msg,String fname) {
		//데이터를 받아서 저장하는 기능
		//File f=new File("msg.data");
		File f=new File(fname);
		String returnMsg="정상적으로 저장되었습니다.";
		try(FileWriter fw=new FileWriter(f)){
			
			fw.write(msg);//데이터 file에 저장!
			
			
		}catch(IOException e) {
			e.printStackTrace(); //익셉션 발생할 정보 출력
			returnMsg="정상적으로 처리되지 않았습니다. 다시 시도하세요";
		}
		return returnMsg;
	}
	public String loadMsgData(String fname) {
		String result="";
		try(FileReader fr=new FileReader(fname)){
			
			int value=0;
			while((value=fr.read())!=-1) {
				result+=(char)value;
			}
			
		}catch(IOException e) {
			e.printStackTrace();
			result="파일을 불러오는데 에러가 발생했습니다.";
		}
		return result;
	}
	
}
