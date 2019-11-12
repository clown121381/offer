package offer;

import Struct.ListNode;

/**
 * 
 * 输出链表倒数第k个节点
 * 
 * @author 爱不会绝迹
 *
 */
public class Problem04 {
	public static ListNode FindKthToTail(ListNode head, int k) {
		try{
			ListNode h1 = head;
			int length = 0;
			while(h1 != null){
				h1 = h1.next;
				length ++;
			}
			h1 = head;
			while(h1 != null){
				if(length-- == k) break;
				h1 = h1.next;
			}
			return h1;
		}catch(Exception e){
			return null;
		}
}
public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode p = null;
		for(int i = 5;i >1;i --){
			p = new ListNode(i);
			p.next = head.next;
			head.next = p;
		}
		ListNode node = FindKthToTail(head,1);
		
		while(head!=null){
			System.out.print(head.val);
			head = head.next;
		}
		System.out.println(node.val);
	}
}
