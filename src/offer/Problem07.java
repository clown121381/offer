package offer;

import java.util.ArrayList;
import java.util.List;

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
 *      2
 *     / \
 *    4   5
 * 判断一个二叉树是不是另一个树的子结构
 * @author 爱不会绝迹
 *		   8
 *		  /	\
 *	         8
 */
public class Problem07 {
	private int index = -1;
	public static void main(String[] args) {
		Problem07 p = new Problem07();
//		Integer[] array1 = {1,2,4,8,null,null,9,null,null,5,null,null,3,6,null,null,7,null,null};//建立二叉树的数组
//		Integer[] array2 = {2,4,null,null,5,null,null};	
		Integer[] array1 = {8,null,8,null,9,null,2,null,5};//建立二叉树的数组
		Integer[] array2 = {8,null,9,3,2};	
		TreeNode root1 = p.createBinTree(array1);
		p.index = -1;
		TreeNode root2 = p.createBinTree(array2);
		
//		boolean b = HasSubtree(root1, root2);
//		System.out.println(b);
		
	}
	/**
	 * 创建二叉树
	 * @param index 数组的下标
	 * @param array 数组
	 * @return 
	 */
	public TreeNode createBinTree(Integer[] array){
		TreeNode node = null;
		if(index < array.length-1 && array[++index] != null){
			node = new TreeNode(array[index]); 
			node.left=createBinTree(array);			
			node.right=createBinTree(array);
		}
		return node;
	}
	public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root2==null){
			return false;
		}
		findNode(root1,root2);
		for(TreeNode t : list){
			if(isContain(t,root2)){
				return true;
			}
		}
		return false;
	}
	@SuppressWarnings("unused")
	public static boolean isContain(TreeNode root1,TreeNode root2){
		if(root2!=null){
			if(root1.val==root2.val){
				return isContain(root1.left,root2.left) && isContain(root1.right,root2.right);
			}else{
				return false;
			}
		}
		 if(root2==null){
	         return true;
	     }else{
	         return false;
	     }
	}
	static List<TreeNode> list = new ArrayList<>();
	public static void findNode(TreeNode root1,TreeNode root2){
		if(root1 != null){
			if(root1.val == root2.val){
				list.add(root1);
			}
			findNode(root1.left,root2);
			findNode(root1.right,root2);
		}
	}
}
