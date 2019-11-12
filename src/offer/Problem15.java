package offer;

import Struct.ListNode;

/**
 * 
 * 
 * 输出两个链表的第一个公共节点
 * @author 爱不会绝迹
 *
 */
public class Problem15 {
	 public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 ListNode p = pHead1;
		 ListNode q = pHead2;
		 if(p==null){
			 return q;
		 }
		 while(p != null){
			 q = pHead2;
			 while(q != null){
				 if(q==p){
					 return q;
				 }
				 q = q.next;
			 }
			 p = p.next;
		 }
		 
		 return null;
	 }
	 
	 public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode p = null;
		for(int i = 1;i < 10;i ++){
			p = new ListNode(i);
			p.next = head.next;
			head.next = p;
		}
		
		//相交的链表
		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(10);
		ListNode node3 = new ListNode(10);
		ListNode node4 = new ListNode(10);
		ListNode node5 = new ListNode(10);
		ListNode node6 = new ListNode(10);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = head.next.next.next.next.next;
		
//		while(head!=null){
//			
//			System.out.println(head.val);
//			
//			head = head.next;
//		}
		
		ListNode p1 = FindFirstCommonNode(head,node1);
		System.out.println(p1.val);
	}
}

