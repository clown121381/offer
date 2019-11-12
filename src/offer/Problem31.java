package offer;

import Struct.RandomListNode;

/**
 * ��������ĸ��� 
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬
 * ��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ��������head��
 * ��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 * 
 * @author ���������
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
