package offer;

import java.util.ArrayList;
/**
 * 数组奇数偶数分离
 * @author 爱不会绝迹
 *
 */
public class Problem03 {
	public static void reOrderArray(int [] array) {
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		for(int i = 0;i < array.length;i ++){
			if(array[i]%2!=0){
				a1.add(array[i]);
			}else{
				a2.add(array[i]);
			}
		}
		
		a1.addAll(a1.size(), a2);
		for(int i = 0;i < a1.size();i ++){
			array[i] = a1.get(i);
		}
    }
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		reOrderArray(array);
		
		for(int i : array){
			System.out.println(i);
		}
	}
}
