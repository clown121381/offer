package x_2019;

import java.lang.reflect.Array;
import java.util.*;
/**
 * ��Ŀ����
 * �����ϿΣ���ʦ����С����ô����ӷ��ͳ˷����˷������ȼ����ڼӷ����������һ������������ţ���ô�������ȼ�����ߵġ����磺
 * 1+2*3=7
 * 1*(2+3)=5
 * 1*2*3=6
 * (1+2)*3=9
 * ����С��ϣ��������������3����a��b��c���������м����"+"�� "*"�� "("�� ")"���ţ��ܹ���õ����ֵ��
 * ��������:
 * һ��������a��b��c (1 <= a, b, c <= 10)
 * �������:
 * �ܹ���õ����ֵ
 * ʾ��1
 * ����
 * 1 2 3
 * ���
 * 9
 */
public class Problem01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int b = a[0]*a[1]*a[2];
        int b1 = (a[0]+a[1])*a[2];

        System.out.println(Integer.max(b,b1));
    }
}
