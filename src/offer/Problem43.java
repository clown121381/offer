package offer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
	输出描述:
	如果当前字符流没有存在出现一次的字符，返回#字符。
 * @author 爱不会绝迹
 *
 */
public class Problem43 {
	
	static LinkedList<Character> list = new LinkedList<>();
	static Map<Character,Integer> map = new HashMap<>();
    public static void Insert(char ch)
    {
        map.put(ch,map.get(ch)==null?1:map.get(ch)+1);
    	list.add(ch);
    }
    public static char FirstAppearingOnce()
    {
    	for(char c : list){
    		if(map.get(c)==1){
    			return c;
    		}
    	}
    	return '#';
    }
    public static void main(String[] args) {
		Insert('g');
		Insert('o');
		Insert('o');
		Insert('g');
		Insert('l');
		Insert('e');
		System.out.println(FirstAppearingOnce());
	}
}
