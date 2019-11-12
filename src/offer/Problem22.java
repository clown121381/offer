package offer;


/**
 * 
 * 
 * ���ַ���ת��Ϊ����
 * 
 * @author ���������
 *
 */
public class Problem22 {
	 public static int StrToInt(String str) {
		 int sum = 0;
		 char[] array = str.toCharArray();
		 if("".equals(str.trim())){
			 return 0;
		 }
		 
		 int start = 0;
		 if(array[0]=='-' ||array[0]=='+'){
			 start = 1;
		 }
		 //�ַ����ĸ�ʽУ�飬�ж��Ƿ�Ϊ�Ϸ��ַ���
		 for(int i = start;i < array.length;i ++){
			if(array[i] > '9' || array[i] < '0'){
				return 0;
			}
		 }
		 
		 int a = 1;
		 for(int i = array.length-1;i >= start;i --){
			 sum += a*(array[i]-'0');
			 a = a*10;
		 }
		 if(array[0]=='-'){
			 return -sum;			 
		 }else{
			 return sum;
		 }
	 }
	 
	 public static void main(String[] args) {
		String s = "213456";
		 int i = StrToInt(s);
		 System.out.println(i);
	}
}
