package offer;

import java.util.Arrays;

/**
 * 
 * ������������к�
 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ����������鿪����,
 * ���ַ�����:�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,
 * ������ȫΪ������ʱ��,����ܺý��������,��������а�������,�Ƿ�Ӧ�ð���ĳ������,
 * �������Աߵ��������ֲ����أ�����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8
 * (�ӵ�0����ʼ,����3��Ϊֹ)����һ�����飬
 * ��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
 * @author ���������
 *
 */
public class Problem25 {
	 public static int FindGreatestSumOfSubArray(int[] array) {
		 
		 int max = 0;
		 int b[] = new int[array.length];
		 for(int i = 0;i < array.length;i ++){
			 for(int j = 0;j < array.length-i;j ++){
				 int k = 0;
				 b[j]=0;
				 while(k<=i){
					 b[j]+=array[j+k];
					 k++;
				 }
			 }
			 Arrays.sort(b);
			 max = b[array.length-1];
		 }
		 return max;
	 }
	 
	 public static void main(String[] args) {
		int[] a = {6,-3,2,7,-15,1,2,2};
		int sum = FindGreatestSumOfSubArray(a);
		System.out.println(sum);
	}
}
