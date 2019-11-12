package offer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
 * ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
 * ���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
	�������:
	�����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
 * @author ���������
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
