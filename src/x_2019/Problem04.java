package x_2019;

import java.util.Scanner;

/**
 * 题目描述
 * 输入一个long类型的数值, 求该数值的二进制表示中的1的个数 .
 *
 * 输入描述:
 * long 类型的数值
 * 输出描述:
 * 该数值二进制表示中1的个数
 * 示例1
 * 输入
 * 3
 * 输出
 * 2
 * 说明
 * 3的二进制表示: 11, 所以1个数为2
 * 示例2
 * 输入
 * 65
 * 输出
 * 2
 * 说明
 * 65的二进制为:1000001，所以１的个数为：２
 */
public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int sum = 0;

        while(a!=0){
            //相当a于从右侧减少一个1
            a = a & (a-1);
            sum++;
        }
        System.out.println(sum);
    }

}
