package offer;

import Struct.TreeNode;

/**
 * 			1
 * 		  /   \
 *       2     3	
 *     /  \   /  \
 *     4   5  6   7
 *    / \   
 *   8   9 
 * 
 * 求二叉树的深度
 * @author 爱不会绝迹
 *
 */
public class Problem17 {
	private static Integer index=-1;
	public static int TreeDepth(TreeNode root) {
		
		if(root!=null){
			int left = TreeDepth(root.left);
			int right = TreeDepth(root.right);
			return left>right?left+1:right+1;
		}
		return 0;
    }
	public static TreeNode createBinTree(Integer[] array){
		TreeNode node = null;
		if(array[++index]!=null){
			node = new TreeNode(array[index]);
			node.left = createBinTree(array);
			node.right = createBinTree(array);
		}
		return node;
	}
	public static void main(String[] args) {
		Integer[] array1 = {1,2,4,8,null,null,9,null,null,5,null,null,3,6,null,null,7,null,null};//建立二叉树的数组
		TreeNode root = createBinTree(array1);
		System.out.println(TreeDepth(root));
	}
}
