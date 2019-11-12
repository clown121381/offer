package x_2019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ��Ŀ����
 * ��ʵ��һ������������Ϊ�ϲ�������������Ϊһ����������
 * ���ҳ�����½ǡ���2�����˽����ʵ���������
 * ��������:
 * �����ж������������ÿ������������1-2�У�ÿ�ж�����Ӣ�Ķ��ŷָ���С�������е�����
 * �������:
 * ���һ����Ӣ�Ķ��ŷָ���С�������е�����
 * ʾ��1
 * ����
 * 1,5,7,9
 * 2,3,4,6,8,10
 * ���
 * 1,2,3,4,5,6,7,8,9,10
 * ��ע:
 * ������ʹ��ԭ���� sort��concat �Ⱥ���
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
            //��λ����ʱ��ע�⣺������
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
