package common.sort;


import java.util.Comparator;

import com.collection.model.vo.Sport;

public class SportPlayerSort implements Comparator<Sport>{
		private boolean flag;
		
		public SportPlayerSort(boolean flag) {
			//true ->오름차순
			//false-> 내림차순
			this.flag=flag;
		}
		
		@Override
		public int compare(Sport o1,Sport o2) {
			return flag?o1.getPlayer()-o2.getPlayer()  //true이면 오름차순
						:
						o2.getPlayer()-o1.getPlayer();//false면 내림차순
		}

}
