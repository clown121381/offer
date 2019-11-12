package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组中只出现了一次的数字
 * 
 * //num1,num2分别为长度为1的数组。传出参数 //将num1[0],num2[0]设置为返回结果 }
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * @author 爱不会绝迹
 *
 */
public class Problem28 {
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i : array){
			if(map.get(i)==null){
				map.put(i,0);
			}
			map.put(i, map.get(i)+1);
		}
		boolean b = true;
		for(int i : array){
			if(map.get(i)==1 && b){
				num1[0]=i;
				b = false;
			}
			if(!b&&map.get(i)==1){
				num2[0]=i;
			}
		}
	}

}
