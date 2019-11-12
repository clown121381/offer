package offer;

import java.util.Scanner;

/**
 * ĳ��ѧ��ʦ��Դʮ�ֽ��ţ���n������ͬʱ��������ĳһ��ʹ��ͬһ����ң�
 * �����i������ռ�ý��ҵ�ʱ���Ϊ[li,ri]������ѧУ�涨���������ű��������
 * ȡ��һ�����ŵ�ԤԼ������������n-1�����ŵ���Ҫ����ѧУ�ж�����ȡ������
 * ����������ռ��ʱ��ֱ�Ϊ[l1,r1],[l2,r2],��ʱ��r1=l2,��Ϊʱ��û�г�ͻ��
 * @author admin
 *	3
 *
 *  1  3
 *  3  10
 *  1 20
 *  
 *  
 *  1 3 10
 *  3 10 20
 *  
 *  1 3 1 20 3 10 
 *  
 */
public class Problem41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[2*n];
		int[][] pos = new int[n][2];
		int p = 0;
		for(int i = 0;i < 2*n; i++){
			array[i] = sc.nextInt();
			if(i%2==0){
				pos[p][0]=array[i];
			}else{
				pos[p++][1]=array[i];
			}
		}
		for(int i = 0;i < 2*n-3; i+=2){
			for(int j = i;j < 2*n; j+=2){
				if(array[i] > array[j]){
					int start = array[i];
					array[i] = array[j];
					array[j] = start;		
					int end = array[i+1];
					array[i+1] = array[j+1];
					array[j+1] = end;
				}				
			}
		}
		
		for(int i = 0;i < 2*n; i++){
			System.out.print(array[i]+" ");
		}
		
		int[] delStart = new int[n];
		int[] delEnd = new int[n];
		int len = 0;
		for(int i = 0;i < 2*n-1; i++){
			if(array[i] > array[i+1]){
				delStart[len]=i+1;
				delEnd[len++]=i+2;
			}
		}
		if(len==0){
			System.out.println("û�н��ҵĳ�ͻ");
			return;
		}
		
		int a = 0;
		int[] arr = new int[pos.length];
		for(int i = 0;i < len;i ++){
			if(has(array,delStart[i])){
				for(int j = 0; j< n;j ++){
					if(array[delStart[i]]==pos[j][0] && array[delEnd[i]]==pos[j][1]){
						arr[a++] = j+1;
						break;
					}
				}
			}
		}
		System.out.println("\n"+a);
		for(int i = 0;i < a;i ++){
			System.out.println(arr[i]);
		}
	}
	
	
	public static boolean has(int[] array,int skipStart){
		int[] arr = new int[array.length-2];
		int k = 0;
		for(int i = 0;i < array.length;i ++){
			if(skipStart==i||skipStart+1==i){
				continue;
			}
			arr[k++] = array[i]; 
		}
		
		for(int i = 0;i < arr.length-1; i++){
			if(arr[i] > arr[i+1]){
				return false;
			}
		}
		return true;
	}
}
