package offer;
/**
 * 
 * 
 * 统计一个数字在排序数组中出现的次数
 * @author 爱不会绝迹
 *
 */
public class Problem16 {
	 public int GetNumberOfK(int [] array , int k) {
		 int num = 0;
		 for(int i : array){
			 if(i==k){
				 num++;
			 }
			 if(i>k){
				 return num;
			 }
		 }
		 
		 return num;
	 }
}
