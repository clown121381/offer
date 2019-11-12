package offer;

import Struct.TreeNode;

/**
 * 
 * 二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9  11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7   5
 * @author 爱不会绝迹
 *
 */
public class Problem08 {
	/**
	 * 
	 * 镜像二叉树
	 * @param root
	 */
	public static void Mirror(TreeNode root) {
        if(root!=null){
        	TreeNode tmp = root.left;
        	root.left = root.right;
        	root.right = tmp;
        	Mirror(root.left);
        	Mirror(root.right);
        }
    }
	
	private static int index = -1;
	public static void main(String[] args) {
		Integer[] array = {8,6,5,null,null,7,null,null,10,9,null,null,11,null,null};
		TreeNode tree = createBinTree(array);
//		inOrder(tree);
//		postOrder(tree);
		Mirror(tree);
		preOrder(tree);
	}
	private static TreeNode createBinTree(Integer[] array) {
		TreeNode tree = null;
		if(index < array.length-1 && array[++index]!=null){
			tree = new TreeNode(array[index]);
			tree.left = createBinTree(array);
			tree.right = createBinTree(array);
		}
		return tree;
	}
	private static void preOrder(TreeNode root){
		if(root!=null){
			System.out.print(root.val+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	private static void inOrder(TreeNode root){
		if(root!=null){
			preOrder(root.left);
			System.out.print(root.val+" ");
			preOrder(root.right);
		}
	}
	
	private static void postOrder(TreeNode root){
		if(root!=null){
			preOrder(root.left);
			preOrder(root.right);
			System.out.print(root.val+" ");
		}
	}
}
