package offer;

import Struct.ListNode;

/**
 * 
 * 
 * 删除链表中重复的节点
 * @author 爱不会绝迹
 *
 */
public class Problem24 {
	//1 2 3 3 4 5 5
	public static ListNode deleteDuplication(ListNode pHead)
	 {
		 ListNode first = new ListNode(-1);
		 first.next = pHead;
		 ListNode p = pHead;
		 ListNode pre = first;

		 while(p!=null){
			 if(p.next!=null&&p.val == p.next.val){
				 while(p.next!=null&&p.next.val == p.val){
					 p = p.next;						 
				 }
				 pre.next = p.next;
				 p = p.next;
				 continue;
			 }
			 pre = p;
			 p = p.next;
		 }
		 
		 
		 return first.next;
	 }
	 public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(1);
		ListNode node4 = new ListNode(1);
		ListNode node5 = new ListNode(1);
		ListNode node6 = new ListNode(2);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		//链表的连接
		head = deleteDuplication(head);
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
	}
}
