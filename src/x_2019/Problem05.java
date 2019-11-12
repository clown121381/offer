package x_2019;

import java.util.Scanner;

/**
 * ��Ŀ����
 * ����һ���յ�int���͵Ķ�ά����array[n][m]��
 * �������������, ���дһ���������˶�ά������������ӡ����.
 *
 * ��������:
 * ����İ�����������������ʾ��ά����Ĵ�Сn��m(1 <= n, m <= 10)��
 * �������:
 * ��ӡ�����ÿ����ĩ�޿ո�
 * ʾ��1
 * ����
 * 4 4
 * ���
 * 1 2 4 7
 * 3 5 8 11
 * 6 9 12 14
 * 10 13 15 16
 */
public class Problem05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] array = new int[n][m];

        int a = 1;
        for(int k = 0;k < Integer.min(m,n)-1;k++){
            int i = 0;
            int j = k;
            while(i<n-1&&j>=0){
                array[i++][j--] = a++;
            }
        }

        if(n>m){
            for(int k = m-1;k < n;k++){
                int i = k-m+1;
                int j = m-1;
                while(j>=0&&i<n){
                    array[i++][j--] = a++;
                }
            }


            for(int k = 0;k < m;k++){
                int i = n-m+k+1;
                int j = m-1;
                while(i<n&&j>=0){
                    array[i++][j--] = a++;
                }
            }
        }else{
            for(int k = n-1;k < m;k++){
                int i = k;
                int j = 0;
                while(j<n&&i>=0){
                    array[j++][i--] = a++;
                }
            }

            for(int k=0;k<n;k++){
                int i = k+1;
                int j = m-1;
                while(i<n&&j>=0){
                    array[i++][j--] = a++;
                }
            }
        }



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
    ����һ�����淶��ע�ͣ��ܽ�
        ע�������Ļ����ٽ��������жϣ����ٽ��������ж�һ����Ҫ����
 */