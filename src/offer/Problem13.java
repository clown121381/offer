package offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2��
 * ��������������0
 * @author ���������
 *
 */
public class Problem13 {
	 public static int MoreThanHalfNum_Solution(int [] array) {
		 Map<Integer,Integer> map = new HashMap<>();
		 for(int i : array){
			 Integer val = map.get(i);
			 map.put(i, val==null?1:val+1);
		 }
		 int len = array.length/2;
		 for(int i : array){
			 if(map.get(i)>len){
				 return i;
			 }
		 }
		 return 0;
	 }
	 public static void main(String[] args) {
		 int[] array = {1,2,3,2,2,2,5,4,2};
		 int i = MoreThanHalfNum_Solution(array);
		 
		 System.out.println(i);
	}
}
