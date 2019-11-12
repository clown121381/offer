package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Struct.TreeNode;

/**
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ
 *   		8
 *   	   /  \
 *   	  6   10
 *   	 / \  / \
 *   	5  7 9  11
 * 		
 * �������Ĳ�α���
 * @author ���������
 *
 */
public class Problem12 {
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		if(root==null){
			return list;
		}
		//����
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()){
			list.add(q.peek().val);
			root = q.poll();
			if(root.left != null){
				q.offer(root.left);
			}
			if(root.right != null){
				q.offer(root.right);
			}
		}
		 
		return list;
	 }
	
	public static void main(String[] args) {
		Integer[] array1 = {1,2,null,null,3,null,null};//����������������
		
		TreeNode root = createBinTree(array1);
		ArrayList<Integer> list = PrintFromTopToBottom(root);
		System.out.println(list);
	}
	private static Integer index = -1;
	private static TreeNode createBinTree(Integer[] array){
		TreeNode node = null;
		if(array[++index]!=null){
			node = new TreeNode(array[index]);
			node.left = createBinTree(array);
			node.right = createBinTree(array);
		}
		return node;
	}
	
}
