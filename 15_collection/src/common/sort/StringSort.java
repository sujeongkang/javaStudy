package common.sort;

import java.util.Comparator;

public class StringSort implements Comparator<String>{//제레릭

	//alt s v 엔터
	@Override
	public int compare(String o1, String o2) {
		// String 대소비교 안됨
		//String의 순서를 비교하는 메소드를 구현해 놓음
		return o2.compareTo(o1);//내림차순정렬!
		
		
	}

	

}

