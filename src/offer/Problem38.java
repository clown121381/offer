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
    	
   5 6 7 8 9 10 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7   5
   11 10 9 8 7 6 5	
 * @author 爱不会绝迹
 *
 *
 *	请实现一个函数，用来判断一颗二叉树是不是对称的。
 *	注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 *
 */
public class Problem38 {

	public static boolean isSymmetrical(TreeNode pRoot) {
		if(pRoot==null){
			return true;
		}
		return isMirror(pRoot.left,pRoot.right);
	}
	
	public static boolean isMirror(TreeNode left,TreeNode right){
		if(left==null&&right==null){
			return true;
		}
		if(left==null || right==null){
			return false;
		}
		return left.val==right.val&&isMirror(left.left,right.right)&&isMirror(left.right,right.left);
	}
	
	private static int index = -1;
	public static void main(String[] args) {
		Integer[] array = {5,3,3,4,null,null,4,2,null,null,2,1,null,null,1};
		TreeNode tree = createBinTree(array);
		boolean b = isSymmetrical(tree);
		System.out.println(b);
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
}
