package common.sort;

import java.util.Comparator;

public class NumberSort implements Comparator{

	@Override
	public int compare(Object o,Object o1) {
		//��ȯ���� ����������.
		//���, 0, ���� ->  1, 0, -1
		//return ����� �ΰ����� ��ü��
		//return ������ �ΰ� ���� �������� ����.
		//return 0�̸� �ΰ����� �������� ����.
		if(o instanceof Integer && o1 instanceof Integer) {
			Integer su=(Integer)o;
			Integer su2=(Integer)o1;
			//if(o>o1)  //��ü�� ��Һ� �Ұ�
//			if(su>su2) return -1; //�ڿ����� �����ϱ� �ٲ�����
//			else if (su<su2) return 1;//�ڿ����� ũ�ϱ� �ٲ�.
//			else return 0;
			return su2-su; //if�� ��� Ȱ�밡��
		}
		
		return 0;
	}

}
