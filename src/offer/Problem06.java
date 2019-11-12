package offer;

import Struct.ListNode;

/**
 * 合并链表，非递减
 * @author 爱不会绝迹
 *
 */
public class Problem06 {
	public static ListNode Merge(ListNode list1,ListNode list2) {
		ListNode p1 = list1;
		ListNode p2 = list2;
		ListNode h = new ListNode(-1);
		ListNode p = h;
		while(p1 != null && p2 != null){
			if(p1.val < p2.val){
				p.next = p1;
				p = p1;
				p1 = p1.next;
			}else{
				p.next = p2;
				p = p2;
				p2 = p2.next;
			}
		}
		
		if(p1 != null){
			p.next = p1;
		}else{
			p.next = p2;
		}
		
		return h.next;
    }
	public static void main(String[] args) {
		ListNode h1 = new ListNode(0);
		ListNode p = null;
		for(int i = 10;i >1;i -= 2){
			p = new ListNode(i);
			p.next = h1.next;
			h1.next = p;
		}
		ListNode h2 = new ListNode(1);
		for(int i = 9;i >1;i -= 2){
			p = new ListNode(i);
			p.next = h2.next;
			h2.next = p;
		}
		Merge(h1,h2);
	}
}
