package offer;

import java.util.Arrays;

/**
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 * 
 * @author ���������
 *
 */
public class Problem44 {
	public static String PrintMinNumber(int[] numbers) {
        StringBuffer sf = new StringBuffer();
        String[] array = new String[numbers.length];
        for(int i = 0;i < array.length;i ++){
        	array[i] = numbers[i]+"";
        }
		Arrays.sort(array,(x,y)->{
									String c1 = x+y;
									String c2 = y + x;
									return c1.compareTo(c2);
									});
		for(String i : array){
			sf.append(i);
		}
		return sf.toString(); 
    }
	public static void main(String[] args) {
		int[] array = {3,32,321};
		String s = PrintMinNumber(array);
		System.out.println(s);
	}
}
