package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * �������Ǳ���(�������������ı�����)
 * @author ���������
 * 
 * ��������֮����Сֵ������֮�����ֵ
 * 
 * 6
 * 1 2 3 4 5 6
 */
public class Problem47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Shell> list = new ArrayList<>();
		for(int i = 0;i < n;i ++){
			Shell s = new Shell();
			s.value = sc.nextInt();
			s.num = sc.nextInt();
			list.add(s);
		}
		list.sort((x,y)->{
			if(x.value!=y.value){
				return x.value-y.value;
			}else{
				return x.num-y.num;
			}
		});
		
		int sum = 0;
		int i = 0;
		for(Shell s1 : list){
			for(int j = 0;j < s1.value;j ++){
				sum+=s1.num;
				i++;
				if(sum>m){
					break;
				}
			}
		}
		System.out.println(i-1);
		
		list.stream().forEach(System.out::println);
	}
}
/*
 * ������
 */
class Shell{
	int value;//��ֵ
	int num;   //���
	@Override
	public String toString() {
		return "Shell [value=" + value + ", num=" + num + "]";
	}
}
