package offer;
/**
 * ��1�����ֵĴ���
 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
 * Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,
 * ���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯,
 * ���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
 * 
 * 
 * @author ���������
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
