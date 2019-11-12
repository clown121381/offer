package offer;

import Struct.RandomListNode;

/**
 * 复杂链表的复制 
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * 
 * @author 爱不会绝迹
 *
 */
public class Problem31 {
	public static RandomListNode Clone(RandomListNode pHead) {
		if(pHead==null){
			return null;
		}
		RandomListNode head = new RandomListNode(pHead.label);
		RandomListNode p = pHead.next;
		RandomListNode tail = head;
		RandomListNode q = null;
		
		while(p!=null){
			q = new RandomListNode(p.label);
			tail.next = q;
			tail = q;
			p = p.next;
		}
		
		p = pHead;
		RandomListNode k = head;
		while(p!=null){
			if(p.random==null){
				k = k.next;
				p = p.next;
				continue;
			}
			q = head;
			while(q!=null){			
				if(p.random.label==q.label){
					k.random = q;
					break;
				}else{
					q = q.next;
				}
			}
			k = k.next;
			p = p.next;
		}
		
		while(head!=null){
			System.out.print(head.label+" ");
			System.out.println(head.random.label);
			head=head.next;
		}
		return head;
	}
	public static void main(String[] args) {
		RandomListNode head = new RandomListNode(1);
		RandomListNode node1 = new RandomListNode(2);
		RandomListNode node2 = new RandomListNode(3);
		RandomListNode node3 = new RandomListNode(4);
		RandomListNode node4 = new RandomListNode(5);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		head.random = node3;
		node1.random = node2;
		node3.random = head;
		node4.random = node1;
		
//		while(head!=null){
//			System.out.print(head.label+" ");
//			System.out.println(head.random.label);
//			head = head.next;
//		}
		head = Clone(head);
	}
}
