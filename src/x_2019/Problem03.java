package x_2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 请实现一个函数，功能为合并两个升序数组为一个升序数组
 * 点击页面左下角“例2”，了解如何实现输入输出
 * 输入描述:
 * 输入有多个测试用例，每个测试用例有1-2行，每行都是以英文逗号分隔从小到大排列的数字
 * 输出描述:
 * 输出一行以英文逗号分隔从小到大排列的数组
 * 示例1
 * 输入
 * 1,5,7,9
 * 2,3,4,6,8,10
 * 输出
 * 1,2,3,4,5,6,7,8,9,10
 * 备注:
 * 不允许使用原生的 sort、concat 等函数
 */
public class Problem03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a1 = br.readLine();
        String a2 = br.readLine();

        if (a2 == null) {
            System.out.print(a1);
            return;
        }

        String[] array1 = a1.split(",");
        String[] array2 = a2.split(",");
        String[] array3 = new String[array1.length+array2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<array1.length && j<array2.length){
            //两位数的时候注意：掉坑了
            if(Integer.parseInt(array1[i])<=Integer.parseInt(array2[j])){
                array3[k++] = array1[i++];
            }else{
                array3[k++] = array2[j++];
            }
        }

        if(i == array1.length){
            while(j < array2.length){
                array3[k++] = array2[j++];
            }
        }
        if(j == array2.length){
            while(i<array1.length){
                array3[k++] = array1[i++];
            }
        }

        for (int l = 0; l < array3.length; l++) {
            System.out.print(array3[l]);
            if(l<array3.length-1){
                System.out.print(",");
            }
        }
    }

}
