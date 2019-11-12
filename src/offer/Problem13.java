package offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 * 如果不存在则输出0
 * @author 爱不会绝迹
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
