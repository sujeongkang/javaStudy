package common.sort;

import java.util.Comparator;

public class NumberSort implements Comparator{

	@Override
	public int compare(Object o,Object o1) {
		//반환값이 정해져있음.
		//양수, 0, 음수 ->  1, 0, -1
		//return 양수면 두개값을 교체함
		//return 음수면 두개 값을 변경하지 않음.
		//return 0이면 두개값을 변경하지 않음.
		if(o instanceof Integer && o1 instanceof Integer) {
			Integer su=(Integer)o;
			Integer su2=(Integer)o1;
			//if(o>o1)  //객체는 대소비교 불가
//			if(su>su2) return -1; //뒤에수가 작으니까 바꾸지마
//			else if (su<su2) return 1;//뒤에수가 크니까 바꿔.
//			else return 0;
			return su2-su; //if문 대신 활용가능
		}
		
		return 0;
	}

}
