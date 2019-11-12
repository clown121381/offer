package offer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Struct.ListNode;

/**
 * ��һ�����������а����������ҳ�������Ļ�����ڽ�㣬�������null��
 * @author ���������
 *
 */
public class Problem32 {
	/**
	 * �ҵĽⷨ������map���ÿһ���ڵ�ĳ��ֵĴ�������һ��Ϊ���ִ���Ϊ2�Ľڵ������ڽڵ�
	 * @param pHead
	 * @return
	 */
	 public static ListNode EntryNodeOfLoop(ListNode pHead)
	 {
		 Map<ListNode,Integer> map = new HashMap<>();
		 ListNode p = pHead;
		 while(p!=null){
			 if(map.get(p)==null){
				 map.put(p, 1);
			 }else{
				 return p;
			 }
			 p = p.next;
		 }
		return null;
	 }

	/**
	 * �µĽⷨ ��׷������ģ�ͣ�
	 * 		��������ָ��һ��һ������ָ���ٶ�Ϊ2����ָ���ٶ�Ϊ1������ָ�����������ʼǰ��
	 *
	 * 		����ָ�뵽�ﻷ·�����ʱ�������ʱ��׷�������ģ���γɣ�
	 * 		Ҳ����˵�����ʱ�򣬿�ָ���ں���׷��ָ�룬
	 * 			�����ʱ�����������˵������
	 * 			1����ָ������ָ�������ڽڵ��ʱ������ָ�������ˣ������ʱ�����������ָ���ڻ����ߵ���̵�·�̣�
	 * 			2����ָ������ָ��ǰ��һ��λ���룬�����������������ָ��׷�������Ļ�������ָ���ڻ����ߵ����·�̣�
	 * 				�����·�̵�����£�����Ҫ��֤�ľ��ǣ�����ָ���߲�����һȦ��������ָ��ض�����
	 * 					���ڵ���֪����Ϊ��ָ����ٶ�Ϊ��ָ����ٶȵĶ�����Ҳ����˵��ָ�������ٶ�Ϊ1����λ��
	 * 					���˵����ָ�뾲ֹ������£���ָ�����1��λ���ٶ�ǰ����Ҳ����˵��ָ��׷�಻����һȦ�ͻ�������ָ�룬
	 * 					��ô��ָ�벻��ֹ�أ���ָ���Ե�λ1���ٶ�ǰ�У�����ָ������һȦ֮���ָ�룬�ǲ��Ǿͱ���ָ�����һȦ
	 * 					Ȼ������ָ��֮��·�̵Ĳ���󲻳���һȦ������˵��ָ���ڽ��뻷�ڲ�����һȦ�ͻᱻ��ָ��׷��
	 * 	������
	 * 		ע�⣺�����ǵ����
	 * 		a------------->��ʼ�㵽��·��ڵľ���
	 * 		b------------->��ڵ㵽������ľ���
	 * 		c------------->�����㵽��ڵ�ľ���
	 *
	 *	��ô����ʱ
	 *		��ָ���·��	A = a+(b+c)*k+b
	 *		��ָ���·�� B = a+b
	 *
	 *		A=2*B
	 *
	 *		2*(a+b)=a+(b+c)*k+b
	 *		��һ����ȡ����
	 *
	 *		a = (K-1)(b+c)+c
	 *	���ʽ��Ҳ����ζ�ţ�
	 *		����ָ��һ�����ٶȣ�һ����������һ���ӣ����������������������ʱ��Ҳ���ߵ�k-1����·����
	 *		����ָ��ͬʱ��������һ��ָ���ߵ������ʱ��һ��ָ��Ҳ������ڴ���Ҳ�����ڻ�·���������
	 *	������ok��	˼·�ͳ����˿���˳��д������
	 *
	 * @param pHead
	 * @return
	 */
	private static ListNode EntryNodeOfLoop2(ListNode pHead){
		ListNode p = pHead;
		ListNode meet = findMeetNode(pHead);

		while(p!=null&&meet!=null){
			if(p==meet){
				return p;
			}
			p = p.next;
			meet = meet.next;
		}
		return null;
	}
	private static ListNode findMeetNode(ListNode pHead){
		ListNode fast = pHead;
		ListNode low = fast;

		while(fast!=null&&fast.next!=null){
			fast = fast.next.next;
			low = low.next;
			if(fast==low){
				return low;
			}
		}
		return null;
	}
	 public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		
//		node1.next = node2;
//		node2.next = node3;
//		node3.next = node4;
//		node4.next = node5;
//		node5.next = node3;
		ListNode p = EntryNodeOfLoop2(node1);
		System.out.println(p);
	}
}
