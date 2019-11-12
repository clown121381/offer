package x_2019;

import java.util.Scanner;
import java.util.Stack;

/**
 * 题目描述
 * 解析加减法运算
 * 如：
 * 输入字符串："1+2+3" 输出："6"
 * 输入字符串："1+2-3" 输出："0"
 * 输入字符串："-1+2+3" 输出："4"
 * 输入字符串："1" 输出："1"
 * 输入字符串："-1" 输出："-1"
 *
 * 已知条件：输入的运算都是整数运算，且只有加减运算
 * 要求：输出为String类型，不能使用内建的eval()函数
 *
 * 输入描述:
 * 输入字符串："1+2+3"
 * 输出描述:
 * 输出："6"
 * 示例1
 * 输入
 * 1+2+3
 * 输出
 * 6
 */
public class Problem07 {
    /**
     * 注意对输入的字符串的处理，负数的处理，连续数字输入的处理
     *
     * 有bug没测全面
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length() <= 2){
            System.out.println(s);
            return;
        }
        Stack<Character> characters = new Stack<>();
        Stack<Integer> integers = new Stack<>();
        char[] chars = s.toCharArray();
        //标记为，记录两位数的输入问题
        boolean flag = false;

        for (int i = 0;i < chars.length;i ++) {
            if(i == 0 && chars[i] == '-'){
                integers.push(-(chars[++i]-'0'));
                flag = true;
                continue;
            }
            if(chars[i] >= '0' && chars[i] <= '9'){
                if(flag){
                    int m = integers.pop();
                    integers.push(m*10+chars[i]-'0');
                }else{
                    integers.push(chars[i]-'0');
                }
                flag = true;
            }else{
                characters.push(chars[i]);
                flag = false;
            }
        }

        while(integers.size()!=1&&characters.size()!=0){
            int a = integers.pop();
            int b = integers.pop();
            char c = characters.pop();
            int res = getResult(a,b,c);
            integers.push(res);
        }

        System.out.println(integers.pop());
    }
    public static int getResult(int a,int b,char c){
        if('+' == c){
            return a + b;
        }else if('-' == c){
            return b-a;
        }
        return 0;
    }
}
