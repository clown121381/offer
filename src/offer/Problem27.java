package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,
 * ����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��.
 * @author ���������
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
