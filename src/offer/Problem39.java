package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * ��εõ�һ���������е���λ����������������ж�����������ֵ��
 * ��ô��λ������������ֵ����֮��λ���м����ֵ��������������ж���ż������ֵ��
 * ��ô��λ������������ֵ����֮���м���������ƽ��ֵ��
 * ����ʹ��Insert()������ȡ��������ʹ��GetMedian()������ȡ��ǰ��ȡ���ݵ���λ����
 * @author ���������
 *
 */
public class Problem39 {
	static List<Integer> list = new ArrayList<>();
    public static void Insert(Integer num) {
        list.add(num);
    }

    public static Double GetMedian() {
        int len = list.size();
        list.sort((x,y)->x-y);
        if(len%2!=0){
            return (double)list.get((len/2));
        }else{
            return (double)(list.get((len/2)-1) + list.get((len/2)))/2;
        }
    }
    
    public static void main(String[] args) {
		Insert(1);
		Insert(2);
		Insert(3);
		Insert(4);
		Insert(5);
		Insert(6);
		
		System.out.println(GetMedian());
		
	}
}
