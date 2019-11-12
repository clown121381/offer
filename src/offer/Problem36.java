package offer;

/**
 * 
 * »¶µÿ‘À∂Ø
 * 
 */
import java.util.Scanner;

public class Problem36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int maxValue = 0;
		if(n < 3){
			System.out.println(-1);
			return;
		}
		for(int i = 0;i < n;i ++){
			array[i] = sc.nextInt();
			if(array[i] > maxValue){
				maxValue = array[i];
			}
			if(sum(array,i+1) > 2*maxValue){
				System.out.println(i+1);
				return;
			}
			
		}
		System.out.println(-1);
	}
	public static int sum(int[] array,int n){
		int sum = 0;
		for(int i = 0;i < n;i ++){
			sum+=array[i];
		}
		return sum;
	}
}
