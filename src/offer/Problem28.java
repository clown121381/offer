package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * ������ֻ������һ�ε�����
 * 
 * //num1,num2�ֱ�Ϊ����Ϊ1�����顣�������� //��num1[0],num2[0]����Ϊ���ؽ�� }
 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
 * @author ���������
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
