package offer;

import java.util.ArrayList;

/**
 * ����һ����������������һ������S���������в�����������
 * ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
	�������:
	��Ӧÿ�����԰����������������С���������
 * @author ���������
 *
 */
public class Problem30 {
	 public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		 int num1 = 0;
		 int num2 = 0;
		 int a = Integer.MAX_VALUE;
		 ArrayList<Integer> list = new ArrayList<>();
		 for(int i = 0;i < array.length;i ++){
			 for(int j = i;j < array.length;j ++){
				 if(array[i]+array[j]==sum && array[i]*array[j]<a){
					 num1 = array[i];
					 num2 = array[j];
					 a = num1 * num2;
				 }
			 }
		 }
		 if(num1!=0&&num2!=0){
			 list.add(num1);
			 list.add(num2);			 
		 }
	     return list;
	 }
}