package x_2019;

import java.util.Scanner;

/**
 * 题目描述
 * 给定一个空的int类型的二维数组array[n][m]。
 * 按下面的填充规则, 请编写一个函数将此二维数组填满并打印出来.
 *
 * 输入描述:
 * 输入的包括两个正整数，表示二维数组的大小n，m(1 <= n, m <= 10)。
 * 输出描述:
 * 打印结果，每行行末无空格。
 * 示例1
 * 输入
 * 4 4
 * 输出
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
    这是一个不规范的注释：总结
        注意条件的划分临界条件的判断，对临界条件的判断一定不要慌乱
 */