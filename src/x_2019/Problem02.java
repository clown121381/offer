package x_2019;

import java.util.Scanner;

/**
 * ��Ŀ����
 * СQ�õ�һ�����������: 1, 12, 123,...12345678910,1234567891011...��
 *
 * ����СQ�����ܷ�3����������ʺܸ���Ȥ��
 *
 * СQ����ϣ�����ܰ�������һ�´����еĵ�l������r��(�����˵�)�ж��ٸ������Ա�3������
 *
 * ��������:
 * ���������������l��r(1 <= l <= r <= 1e9), ��ʾҪ�����������ˡ�
 * �������:
 * ���һ������, ��ʾ�������ܱ�3���������ָ�����
 * ʾ��1
 * ����
 * 2 5
 * ���
 * 3
 * ˵��
 * 12, 123, 1234, 12345...
 * ����12, 123, 12345�ܱ�3������
 */
public class Problem02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r  = sc.nextInt();

        int res = 0;
        for (int i = l; i <= r; i++) {
            int b = sum(i);
            if(b%3==0){
                res++;
            }
        }

        System.out.println(res);
    }

    public static int sum(int n){
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
}
