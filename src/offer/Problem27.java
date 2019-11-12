package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 * @author 爱不会绝迹
 *
 */
public class Problem27 {
	 public static int FirstNotRepeatingChar(String str) {
		 char[] c = str.toCharArray();
		 Map<Character,Integer> map = new HashMap<>();
		 for(int i = 0;i < c.length;i ++){
			 if(map.get(c[i])==null){
				 map.put(c[i], 0);
			 }
			 map.put(c[i],map.get(c[i])+1);
		 }
		 
		 for(int i = 0;i < c.length;i ++){
			  if(map.get(c[i])==1){
				  return i;
			  }
		 }
		 return -1;
	 }
	 
	 public static void main(String[] args) {
		int position = FirstNotRepeatingChar("aaewtfxcveaegagadfg");
		System.out.println(position);
	}
}
