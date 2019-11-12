package offer;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字， 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12
 * 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * 
 * 1  2  3  4 
 * 5  6  7  8 
 * 9  10 11 12 
 * 13 14 15 16
 * 
 * 1  2  3  4  5
 * 6  7  8  9  10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 *
 * 1  2  3 
 * 4  5  6 
 * 7  8  9 
 * 10 11 12
 * 
 * @author 爱不会绝迹
 * 
 * 
 */
public class Problem09 {
	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> li = new ArrayList<>();
		int x = matrix.length; // 行数
		int y = matrix[0].length; // 列数
		if (x == 1 || y == 1) {
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					li.add(matrix[i][j]);
				}
			}
			return li;
		}

		for (int i = 0; i < Math.ceil(x < y ? x : y) / 2; i++) {
			for (int k = i; k < y - i; k++) {
				if (!hashElement(li, matrix[i][k])){
					li.add(matrix[i][k]);
					System.out.print("[" + matrix[i][k] + "]  ");					
				}
			}
			for (int k = i + 1; k < x - i; k++) {
				if (!hashElement(li, matrix[k][y - i - 1])){
					li.add(matrix[k][y - i - 1]);
					System.out.print("[" + matrix[k][y - i - 1] + "]  ");					
				}
			}
			for (int k = y - i - 2; k >= i; k--) {
				if (!hashElement(li, matrix[x - i - 1][k])){
					li.add(matrix[x - i - 1][k]);
					System.out.print("[" + matrix[x - i - 1][k] + "]  ");				
				}
			}
			for (int k = x - i - 2; k > i; k--) {
				if (!hashElement(li, matrix[k][i])){
					li.add(matrix[k][i]);
					System.out.print("[" + matrix[k][i] + "]  ");					
				}
			}

			System.out.println();
		}
		return li;
	}

	public static boolean hashElement(ArrayList<Integer> list, int i) {
		for (int l : list) {
			if (l == i) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = new int[3][5];
		int mun = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = mun++;
			}
		}
		printMatrix(matrix);
		// for(int i = 0;i < 4;i ++){
		// for(int j = 0;j < 4;j ++){
		// System.out.print(matrix[i][j]+" ");
		// }
		// System.out.println();
		// }
	}

}
