package offer;
/**
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ
 * @author ���������
 *
 */
public class Problem21 {
	public static int NumberOf1(int n) {
		int num = 0;
		char[] cs = Integer.toBinaryString(n).toCharArray();
		for(char c : cs){
			if(c=='1'){
				num++;
			}
		}
		return num;
    }
	public static void main(String[] args) {
		System.out.println(NumberOf1(-10));
	}
}
