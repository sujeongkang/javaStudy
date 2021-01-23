package test.method;

public class NonStaticSample {
	public NonStaticSample() {
		// TODO Auto-generated constructor stub
	}
	public void printLottoNumbers(){
		int[]lotto=new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)((Math.random()*45)+1);
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i=i-1;
					break;
				}
				
			}
		}for(int v:lotto) {
			System.out.print(v+" ");
		}
		System.out.println("");
	}
	
	public void outputChar(int num, char ch) {
		for(int i=0;i<num;i++) {
			System.out.print(ch);
		}
		System.out.println("");
	}
	
	public char alphabette() {
		
		int a=((int)(Math.random()*26)+97);
		char ch=(char)a;
		
		return ch;
	}
	
	public String mySubstring(String str,int a,int b) {
		String result="";
		if(str!=null) {
			result=str.substring(a,b);
		}else if(str==null){
			result=null;
		}
		return result;
	}
}	
