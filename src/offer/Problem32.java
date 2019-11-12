package offer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Struct.ListNode;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * @author 爱不会绝迹
 *
 */
public class Problem32 {
	/**
	 * 我的解法，利用map标记每一个节点的出现的次数，第一个为出现次数为2的节点就是入口节点
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
	 * 新的解法 ，追击问题模型，
	 * 		定义两个指针一快一慢，快指针速度为2，慢指针速度为1，两个指针从起点出发开始前进
	 *
	 * 		当慢指针到达环路的入口时，在这个时候追击问题的模型形成，
	 * 		也就是说在这个时候，快指针在后面追慢指针，
	 * 			在这个时候有两个极端的情况，
	 * 			1、快指针在慢指针进入入口节点的时候两个指针相遇了，（这个时候的相遇是慢指针在环内走的最短的路程）
	 * 			2、快指针在慢指针前方一单位距离，（在这种情况下两个指针追击相遇的话就是慢指针在环内走的最长的路程）
	 * 				在走最长路程的情况下，下面要论证的就是，在满指针走不超过一圈，快慢两指针必定相遇
	 * 					现在的已知条件为快指针的速度为慢指针的速度的二倍，也就是说两指针的相对速度为1个单位，
	 * 					如果说在慢指针静止的情况下，快指针会以1单位的速度前进，也就是说快指针追多不超过一圈就会遇到慢指针，
	 * 					那么慢指针不静止呢，慢指针以单位1的速度前行，在慢指针走了一圈之后快指针，是不是就比慢指针多走一圈
	 * 					然而快慢指针之间路程的差最大不超过一圈，所以说慢指针在进入环内不超过一圈就会被快指针追上
	 * 	现在设
	 * 		注意：链表是单向的
	 * 		a------------->开始点到环路入口的距离
	 * 		b------------->入口点到相遇点的距离
	 * 		c------------->相遇点到入口点的距离
	 *
	 *	那么相遇时
	 *		快指针的路程	A = a+(b+c)*k+b
	 *		慢指针的路程 B = a+b
	 *
	 *		A=2*B
	 *
	 *		2*(a+b)=a+(b+c)*k+b
	 *		做一下提取化简
	 *
	 *		a = (K-1)(b+c)+c
	 *	这个式子也就意味着，
	 *		两个指针一样的速度，一个从起点出发一个从，相遇点出发当他们相遇的时候也就走的k-1倍环路长，
	 *		两个指针同时出发，在一个指针走到了入口时另一个指针也到了入口处，也就是在环路的入口相遇
	 *	这样就ok了	思路就出来了可以顺着写代码了
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
