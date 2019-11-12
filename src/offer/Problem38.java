package offer;

import Struct.TreeNode;
/**
 * 
 * �������ľ����壺Դ������ 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9  11
    	
   5 6 7 8 9 10 11
    	���������
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7   5
   11 10 9 8 7 6 5	
 * @author ���������
 *
 *
 *	��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�
 *	ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
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
