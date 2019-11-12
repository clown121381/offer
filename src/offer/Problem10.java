package offer;

import java.util.Stack;

/**
 * 
 * ����ջ�����ݽṹ�� ���ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min���� 
 * ��ʱ�临�Ӷ�ӦΪO��1����
 * ["PSH3","MIN","PSH4","MIN","PSH2","MIN","PSH3","MIN","POP","MIN","POP","MIN","POP","MIN","PSH0","MIN"]
 * 
 * ����ջ�Ľṹ
 * @author ���������
 *
 */
public class Problem10 {
	
	private Stack<Integer> dataStack = new Stack<>();
	private Stack<Integer> minStack = new Stack<>();
	private int min = Integer.MAX_VALUE;
	public void push(int node) {
		
		dataStack.push(node);
		if(minStack.size()==0){
			minStack.push(node);
			min = node;
		}else{
			if(min > node){
				min = node;
			}
			minStack.push(min);
		}
		
	}

	public void pop() {
		if(minStack.size()!=0){
			minStack.pop();
			dataStack.pop();
		}
	}

	public int top() {
		 return dataStack.peek();
	}

	public int min() {
		if(minStack.size()==0) return 0;
		return minStack.peek();
	}

	public static void main(String[] args) {
		Problem10 p = new Problem10();
		
		p.push(3);
		System.out.println(p.min());
		p.push(4);
		System.out.println(p.min());
		p.push(2);
		System.out.println(p.min());
		p.push(3);
		System.out.println(p.min());
		p.pop();
		System.out.println(p.min());
		p.pop();
		System.out.println(p.min());
		p.pop();
		System.out.println(p.min());
		p.push(0);
		System.out.println(p.min());
	}
}
