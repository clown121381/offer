package offer;

import Struct.ListNode;

/**
 * 
 * 
 * Լɪ��ѭ������
 * 
 * ÿ����һ��ͯ��,ţ�Ͷ���׼��һЩС����ȥ�����¶�Ժ��С����,����������ˡ�
 * HF��Ϊţ�͵�����Ԫ��,��ȻҲ׼����һЩС��Ϸ������,�и���Ϸ��������:����
 * ,��С������Χ��һ����Ȧ��Ȼ��,�����ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������
 * ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,
 * ���Ҳ��ٻص�Ȧ��,��������һ��С���ѿ�ʼ,����0...m-1����....������ȥ....
 * ֱ��ʣ�����һ��С����,���Բ��ñ���,�����õ�ţ������ġ�����̽���ϡ���ذ�
 * (��������Ŷ!!^_^)��������������,�ĸ�С���ѻ�õ������Ʒ�أ�
 * (ע��С���ѵı���Ǵ�0��n-1)
 * @author ���������
 *
 */
public class Problem23 {
	 public static int LastRemaining_Solution(int n, int m) {
		 
		 //��ʼ������
		 ListNode head = new ListNode(-1);//ͷ����ʶλ
		 ListNode q = head;
		 ListNode p = null;
		 for(int i = 0;i < n;i ++){
			 p = new ListNode(i);
			 q.next = p;
			 q = p;
		 }
		 //ѭ����������
		 q.next=head;
//-1 0 1 2 3 4 
		 p = head.next;
		 ListNode pre = head;//ǰ���ڵ�
		 int num = 0;
		 while(head.next.next != head){
			 if(num%(m)==m-1 && num != 0 && p.val != -1){
				 pre.next = p.next;
				 p = p.next;
				 num++;
				 continue;
			 }
			 
			 if(p.val != -1){
				 num++;				 
			 }
			 pre = p;
			 p = p.next;
		 }
		 return head.next.val;
	 }
	 public static void main(String[] args) {
		System.out.println(LastRemaining_Solution(5, 3));
	}
}
