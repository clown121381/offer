package offer;

import Struct.ListNode;

/**
 * 
 * 
 * 链表翻转输出链表的头
 * 
 * @author 爱不会绝迹
 *
 */
public class Problem05 {
	public static ListNode ReverseList(ListNode head) {
		ListNode h = new ListNode(-1);
		ListNode p = head;
		ListNode p1 = p;
		while(p1 != null){
			p1 = p1.next;
			p.next = h.next;				
			h.next = p;	
			p = p1;
		}
		return h.next;
	}
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode p = null;
		for(int i = 5;i >1;i --){
			p = new ListNode(i);
			p.next = head.next;
			head.next = p;
		}
		ReverseList(head);
	}
}
