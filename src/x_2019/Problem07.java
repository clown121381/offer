package x_2019;

import java.util.Scanner;
import java.util.Stack;

/**
 * ��Ŀ����
 * �����Ӽ�������
 * �磺
 * �����ַ�����"1+2+3" �����"6"
 * �����ַ�����"1+2-3" �����"0"
 * �����ַ�����"-1+2+3" �����"4"
 * �����ַ�����"1" �����"1"
 * �����ַ�����"-1" �����"-1"
 *
 * ��֪��������������㶼���������㣬��ֻ�мӼ�����
 * Ҫ�����ΪString���ͣ�����ʹ���ڽ���eval()����
 *
 * ��������:
 * �����ַ�����"1+2+3"
 * �������:
 * �����"6"
 * ʾ��1
 * ����
 * 1+2+3
 * ���
 * 6
 */
public class Problem07 {
    /**
     * ע���������ַ����Ĵ��������Ĵ���������������Ĵ���
     *
     * ��bugû��ȫ��
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
        //���Ϊ����¼��λ������������
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
