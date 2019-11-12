package offer;

import java.util.ArrayList;

/**
 * 最小k个数
 * 
 * @author 爱不会绝迹
 *
 */
public class Problem14 {
	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		if(k<=0 || k > input.length){
			return list;
		}
		for (int i = 0; i < input.length; i++) {
			for (int j = i; j < input.length; j++) {
				if (input[i] > input[j]) {
					int swap = input[i];
					input[i] = input[j];
					input[j] = swap;
				}
			}
		}
		for (int i = 0; i < k; i++) {
			list.add(input[i]);
		}
		return list;
	}
	public static void main(String[] args) {
		
		int[] array = {2,3,1,9,8,7,0,4,5,6};
		ArrayList<Integer> a = GetLeastNumbers_Solution(array, 4);
		System.out.println(a);
	}
}
