package offer;
/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 * @author 爱不会绝迹
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
