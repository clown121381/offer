package offer;
/**
 * “1”出现的次数
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 * 
 * 
 * @author 爱不会绝迹
 *
 */
public class Problem26 {
	public static int NumberOf1Between1AndN_Solution(int n) {
		int sum = 0;
		for(int i = 0;i <= n;i ++){
			int length = (i+"").length();
			int k = i;
			for(int j = 0;j < length;j++){
				if(k%10==1){
					sum++;
				}
				k = k/10;
			}
		}
		return sum;
    }
	public static void main(String[] args) {
		int num = NumberOf1Between1AndN_Solution(13);
		System.out.println(num);
	}
}
