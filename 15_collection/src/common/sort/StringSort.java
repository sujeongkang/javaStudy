package common.sort;

import java.util.Comparator;

public class StringSort implements Comparator<String>{//������

	//alt s v ����
	@Override
	public int compare(String o1, String o2) {
		// String ��Һ� �ȵ�
		//String�� ������ ���ϴ� �޼ҵ带 ������ ����
		return o2.compareTo(o1);//������������!
		
		
	}

	

}

