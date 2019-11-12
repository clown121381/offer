package offer;

import java.util.ArrayList;
import java.util.LinkedList;

import Struct.TreeNode;

/**
 * 层序遍历二叉树
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 *    		8
 *   	   /  \
 *   	  6   10
 *   	 / \  / \
 *   	5  7 9  11
 *     
 * @author 爱不会绝迹
 *
 */
public class Problem45 {
	
	 
		static  ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
	        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	        depth(pRoot, 1, list);
	        return list;
	    }
	     
	    private static void depth(TreeNode root, int depth, ArrayList<ArrayList<Integer>> list) {
	        if(root == null) return;
	        if(depth > list.size())
	            list.add(new ArrayList<Integer>());
	        list.get(depth -1).add(root.val);
	         
	        depth(root.left, depth + 1, list);
	        depth(root.right, depth + 1, list);
	    }
	 
	 public static void main(String[] args) {
		 Integer[] array =  {8,6,5,null,null,7,null,null,10,9,null,null,11,null,null};
		 
		 TreeNode root = createBinTree(array);
		 System.out.println(Print(root));
	}


	private static int index = -1;
	private static TreeNode createBinTree(Integer[] array) {
		TreeNode root = null;
		if(array[++index]!=null){
			root = new TreeNode(array[index]);
			root.left = createBinTree(array);
			root.right = createBinTree(array);
		}
		return root;
	}
}
