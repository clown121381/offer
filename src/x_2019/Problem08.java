package x_2019;

import java.util.Scanner;

/**
 * ��Ŀ����
 * �ֵ��˷��յļ��ڣ�ǡ��С��ȥţţ�Ĺ�԰�����档
 * ţţ��˵����������԰��ÿ���ط�������ָ�ƣ�С�ײ�̫���ţ��������뿼��ţţ��
 * �ڹ�԰����N��ƻ����ÿ��ƻ��������Ϊai��С��ϣ��֪��������������x��ƻ����������һ�ѵġ�
 * ţţ�����������̫�򵥣�����ϣ�����������ش�
 * ��������:
 * ��һ��һ����n(1 <= n <= 105)��
 * �ڶ���n����ai(1 <= ai <= 1000)����ʾ������������i���ж���ƻ��
 * ������һ����m(1 <= m <= 105)����ʾ��m��ѯ�ʡ�
 * ������m����qi����ʾС��ϣ��֪����qi��ƻ��������һ�ѡ�
 * �������:
 * m�У���i�������qi��ƻ��������һ�ѡ�
 * ʾ��1
 * ����
 * 5
 * 2 7 3 4 9
 * 3
 * 1 25 11
 * ���
 * 1
 * 5
 * 3
 */
public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];

        array[0]  = sc.nextInt();
        for (int i = 1; i < n; i++) {
            array[i] = sc.nextInt()+array[i-1];
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int res = search(array,a);
            System.out.println(res+1);
        }
    }
    public static int search(int[] array,int a){
        int start = 0;
        int end = array.length-1;

        while(a>=array[start]&&a<= array[end]){
            if(array[(start+end)/2]>a){
                end = (start+end)/2;
            }else {
                start = (start+end)/2+1;
            }
            if(start>=end){
                break;
            }
        }
        return start;
    }
}
