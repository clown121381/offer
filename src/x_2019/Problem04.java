package x_2019;

import java.util.Scanner;

/**
 * ��Ŀ����
 * ����һ��long���͵���ֵ, �����ֵ�Ķ����Ʊ�ʾ�е�1�ĸ��� .
 *
 * ��������:
 * long ���͵���ֵ
 * �������:
 * ����ֵ�����Ʊ�ʾ��1�ĸ���
 * ʾ��1
 * ����
 * 3
 * ���
 * 2
 * ˵��
 * 3�Ķ����Ʊ�ʾ: 11, ����1����Ϊ2
 * ʾ��2
 * ����
 * 65
 * ���
 * 2
 * ˵��
 * 65�Ķ�����Ϊ:1000001�����ԣ��ĸ���Ϊ����
 */
public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int sum = 0;

        while(a!=0){
            //�൱a�ڴ��Ҳ����һ��1
            a = a & (a-1);
            sum++;
        }
        System.out.println(sum);
    }

}
