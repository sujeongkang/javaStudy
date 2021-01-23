package com.kh.practice.array;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class ArrayPractice {
	
	Scanner sc=new Scanner(System.in);
	
	public void practice1() {
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		//순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.

		int[] intArr=new int[10];
		for(int i=0;i<intArr.length;i++) {
			intArr[i]=i+1;
		}
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i]+" ");
			
		}
		System.out.println("");
	}
	public void practice2() {
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
		//역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.

		int[] iArr=new int[10];
		for(int i=iArr.length-1;i>=0;i--) {
			iArr[i]=i+1;
		}
		for(int i=iArr.length-1;i>=0;i--) {
			System.out.print(iArr[i]+" ");
		}
		System.out.println("");
	}
	public void practice3() {
		System.out.print("양의 정수: ");
		int num=sc.nextInt();
		int[] iArr=new int[num];
		for(int i=0;i<iArr.length;i++) {
			iArr[i]=i+1;
		}
		for(int i=0;i<iArr.length;i++) {
			System.out.print(iArr[i]+" ");
		}
		System.out.println("");
	}
	public void practice4() {
		String[] fruits={"사과","귤","포도","복숭아","참외"};
		System.out.println(fruits[1]);
	}
	public void practice5() {
		//문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 
		//문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요
		System.out.print("문자열: ");
		String str=sc.nextLine();
		System.out.print("문자: ");
		char text=sc.nextLine().charAt(0);
		
		int count = 0;
		String tag = "";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==text) {
				tag += i+(" ");
				count++;
			}
		}
		System.out.println(str+"에 "+text+" 가 존재하는 위치(인덱스): "+tag);
		System.out.println(text+" 개수: "+count);	
	}
	public void practice6() {
		//“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아 
		//입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 
		//범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		int i=0;
		
		System.out.print("0~6사이 숫자 입력: ");
		int num=sc.nextInt();
		String[] week={"월","화","수","목","금","토","일"};
		
		if(num>=0&&num<=6) {
			i=num+1;
			System.out.println(week[num]+"요일");
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
			
	}
	public void practice7() {
		System.out.print("정수: ");
		int inum=sc.nextInt();
		int[] iArr=new int[inum];
		String str="";
		int sum=0;
		for(int i=0;i<inum;i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값: ");
			int in=sc.nextInt();
			sum=sum+in;
			str+=(in+" ");
			
		}
		System.out.println(str);
		System.out.println("총합: "+sum);
	}
	public void practice8() {
		//3이상인 홀수 자연수를 입력 받아 배열의 중간까지는
		//1부터 1씩 증가하여 오름차순으로 값을 넣고, 
		//중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//다시 정수를 받도록 하세요
		int i,a;
			do{	
				System.out.print("정수를 입력하세요: ");
				a=sc.nextInt();
				if(a>2&&a%2==1) {
					int[] Arr=new int[a];
					for(i=0;i<a;i++) {
						if(i<=(a/2)) {
							Arr[i]=i+1;
						}else if(i>(a/2)) {
							Arr[i]=a-i;
						}		    
						
					}
					for(i=0;i<Arr.length;i++) {
					System.out.print(Arr[i]+" ");
					}
				}
				else {
					System.out.println("다시 입력하세요.");
				}
			}while(a<3||a%2==0);
			System.out.println("");
		}

	public void practice9() {
		//사용자가 입력한 값이 배열에 있는지 검색하여 있으면 “OOO 치킨 배달 가능“, 
		//없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요. 
		//단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		String[] chicken= {"양념", "간장", "깐풍", "파닭"};
		System.out.print("치킨 이름을 입력하세요: ");
		String menu=sc.nextLine();
		for(int i=0;i<chicken.length;i++) {
			
			if(menu.equals(chicken[i])){
				System.out.println(menu+"치킨 배달 가능");break;
			} 
			if(!menu.equals(chicken[i])&&i==chicken.length-1){
				System.out.println(menu+"치킨은 없는 메뉴입니다.");
				
			}
		}
		
	}
	public void practice10() {
		//주민등록번호 성별자리 이후부터 *로 가리고 출력하세요. 
		//단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		String[] pn1=new String[14];
		System.out.print("주민등록번호(-포함): ");
		String num=sc.nextLine();
		for(int i=0;i<pn1.length;i++) {
			pn1[i]=num.charAt(i)+"";
		}
		String pn2[];
		pn2=pn1.clone();
		for(int i=7;i<pn2.length;i++) {
			pn2[i]="*";
		}
		for(int i=0;i<pn2.length;i++) {
			System.out.print(pn2[i]);
		}
		System.out.println("");
	}

	public void practice11() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		
		int[] su=new int[10];
		for(int i=0;i<su.length;i++) {
			su[i]=(int)(Math.random()*10)+1;
		}
		
		for(int i=0;i<su.length;i++) {
			System.out.print(su[i]+" ");
		}
		System.out.println("");
	}
	
	public void practice12() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 발생시켜 배열에 초기화 후 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		int[] nums=new int[10];
		int max=0;
		int min=10;
		for(int i=0;i<nums.length;i++) {
			nums[i]=(int)(Math.random()*10)+1;
			}
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
			if(max<=nums[i]) {
				max=nums[i];
			}
			if(min>=nums[i]) {
				min=nums[i];			
			}
		}
		System.out.println("");
		System.out.println("최대값: "+max+"\n최소값: "+min);
	}
	public void practice13() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 
		//중복된 값이 없게 배열에 초기화한 후 출력하세요.
		int[] su=new int[10];
		for(int i=0;i<su.length;i++) {
			su[i]=(int)(Math.random()*10)+1;

			for(int j=0;j<i;j++) {
				if(su[i]==su[j]) {
					i--;
				}
			}
		}
		for(int i=0;i<su.length;i++) {
			for(i=0;i<su.length-1;i++) {
				System.out.print(su[i]+",");
			}
			System.out.print(su[i]);
		}
		System.out.println("");
	}
	public void practice14() {
		//로또 번호 자동 생성기 프로그램을 작성하는데 
		//중복 값 없이 오름차순으로 정렬하여 출력하세요.
		int[] lotto=new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=((int)(Math.random()*45)+1);
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
			}
			Arrays.sort(lotto);//배열 오름차순 정리 
		
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
			}
		System.out.println("");
		}
//	오름차순 정리.
//	 for (int i=0; i<6;i++) {
//	   for(int k=0;k<6;k++) {
//		    if (choice[i]>choice[k] && i!=k) {
//		     dep[i]++;
//		    }
//		   }
//		   nchoice[dep[i]] =choice[i] ;
//		  }
//		  for (int a : nchoice) {
//		   System.out.print(a+" ");
//		  }
	
	public void practice15() {
		//문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		//문자의 개수와 함께 출력하세요	
		System.out.print("문자열: ");
		String a=sc.next();
		int i=0;
		int k=0;
		String b=""+a.charAt(0);
		int count=0;
		for(i=0;i<a.length();i++) {
			for(k=0;k<i;k++) {
				if(i!=k&&a.charAt(i)==a.charAt(k)) {
					count--;
					
				}
				if(k==i-1&&a.charAt(i)!=a.charAt(k)) {
					b+=a.charAt(i);
				}
			}count++;
		}
		char[] ch=new char[b.length()];
		for(int j=0;j<b.length();j++) {
			ch[j]=b.charAt(j);
		}
		for(char c:ch) {
			System.out.print(c+" ");
		}
		System.out.print("\n 문자 개수: "+count+"\n");
	}	
//		
//		System.out.print("문자열: ");
//		String str=sc.nextLine();
//		char[] t=new char[str.length()];
//		
//		int count=0;
//		
//		for(int i=0;i<t.length;i++) {
//			t[i] =str.charAt(i);
//			for(int j=0;j<t.length;j++) {
//				if(i!=j&&t[i]==t[j]) {
//					
//					count=count-1;
//				}
//			}
//			count++;
//		}
//		System.out.print("문자열에 있는 문자: ");
//		for(int i=0;i<t.length;i++) {
//			for(i=0;i<t.length-1;i++) {
//				System.out.print(t[i]+", ");
//			}
//			System.out.print(t[i]);
//		}
//		System.out.println("\n 문자 개수: "+count);
//	}

	
	public void practice16() {
		//사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		//배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요. 
		//단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지, 
		//늘린 곳에 어떤 데이터를 넣을 것인지 받으세요. 
		//사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		System.out.println("배열의 크기를 입력하세요");
		int size = sc.nextInt();
		String [] arr = new String [size];
		String [] zrr;
		int i = 0;
		sc.nextLine();
		Repeater:
			while(true) {
				for (;i<size;i++) {
					System.out.print((i+1)+"번째 문자 입력 : ");
					arr[i] = sc.nextLine(); 
				}
			while(true) {
				System.out.println("더 값을 입력하시겠습니까? (y/n)");
				char yn=sc.next().charAt(0);
				switch (yn) {
				case 'y': case 'Y' : 
					System.out.println("더 입력하고 싶은 개수:");
					size+=sc.nextInt();
					zrr=arr.clone();
					arr=new String[size];
					System.arraycopy(zrr, 0, arr, 0, zrr.length);
					sc.nextLine(); continue Repeater;
					case 'n': case 'N' : break Repeater;
						}
					}
			}
		
		for (String v : arr) {
			System.out.print(v + " ");
			}
		}
	}
	
