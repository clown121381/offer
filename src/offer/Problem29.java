package offer;

import java.util.ArrayList;

/**
 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,
 * �����Ͼ�д������ȷ����100�����������������ڴ�,�����뾿��
 * �ж������������������еĺ�Ϊ100(���ٰ���������)��û���,��
 * �͵õ���һ������������Ϊ100������:18,19,20,21,22�����ڰ����⽻����,
 * ���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
	�������:
	������к�ΪS�������������С������ڰ��մ�С�����˳��
	���м䰴�տ�ʼ���ִ�С�����˳��
 * 
 * 
 * @author ���������
 *
 */
public class Problem29 {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> sumlist = new ArrayList<>();
		ArrayList<Integer> list = null;
		int s = 0;
		for(int i = 1;i < sum;i ++){
			s = 0;
			for(int j = i;j <sum;j ++){
				s+=j;
				if(s==sum){
					list = new ArrayList<>();
					for(int k = i;k <=j;k ++){
						list.add(k);
					}
					sumlist.add(list);
				}
				if(s>sum){
					break;
				}
			}
		}
	    return sumlist;
    }
	
	public static void main(String[] args) {
		
	}
}
