package offer;
/**
 * 
 * 
 * ͳ��һ�����������������г��ֵĴ���
 * @author ���������
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
