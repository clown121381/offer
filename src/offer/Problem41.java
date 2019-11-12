package offer;

import java.util.Scanner;

/**
 * 某大学教师资源十分紧张，有n个社团同时申请了在某一天使用同一间教室，
 * 假设第i个社团占用教室的时间记为[li,ri]。根据学校规定，教育部门必须且最多
 * 取消一个社团的预约，来满足另外n-1个社团的需要，问学校有多少种取消方案
 * （若两社团占用时间分别为[l1,r1],[l2,r2],此时若r1=l2,视为时间没有冲突）
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
			System.out.println("没有教室的冲突");
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
