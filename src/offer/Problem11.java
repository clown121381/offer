package offer;

import java.util.Stack;

/**
 * 
 * ��ջ˳���ж�
 * ���������������У���һ�����б�ʾջ��ѹ��˳��
 * ���жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 * 
 * 
 * 1,2,3,4,5
 * 
 * ��ջ���У�2,1,4,3,5
 * @author ���������
 *
 */
public class Problem11 {
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		if(pushA==null || popA==null){
			return false;
		}
		Stack<Integer> s = new Stack<>();
		for(int i=0,index = 0;i < pushA.length;i ++){
			s.push(pushA[i]);
			while(!s.isEmpty() && s.peek()==popA[index]){
				s.pop();
				index++;
			}
		}
		return s.isEmpty();
    }
	
	public static void main(String[] args) {
		int[] pushA = {1,2,3,4,5};
		int[] popA = {2,1,3,4,5};
		System.out.println(IsPopOrder(pushA,popA));
	}
}







