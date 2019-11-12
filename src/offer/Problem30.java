package offer;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
	输出描述:
	对应每个测试案例，输出两个数，小的先输出。
 * @author 爱不会绝迹
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