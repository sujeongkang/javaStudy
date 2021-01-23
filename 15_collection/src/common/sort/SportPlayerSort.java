package common.sort;


import java.util.Comparator;

import com.collection.model.vo.Sport;

public class SportPlayerSort implements Comparator<Sport>{
		private boolean flag;
		
		public SportPlayerSort(boolean flag) {
			//true ->��������
			//false-> ��������
			this.flag=flag;
		}
		
		@Override
		public int compare(Sport o1,Sport o2) {
			return flag?o1.getPlayer()-o2.getPlayer()  //true�̸� ��������
						:
						o2.getPlayer()-o1.getPlayer();//false�� ��������
		}

}
