package offer;

import java.util.Scanner;

public class Problem35 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     long maxX = Long.MIN_VALUE;
	     long minX = Long.MAX_VALUE;
	     long maxY = Long.MIN_VALUE;
	     long minY = Long.MAX_VALUE;
	     for(int i = 0;i < n;i ++){
	         long x= sc.nextInt();
	         long y = sc.nextInt();
	         maxX = Math.max(maxX,x);
	         maxY = Math.max(maxY,y);
	         minX = Math.min(minX,x);
	         minY = Math.min(minY,y);
	     }
	     long a = Math.max(maxX-minX, maxY-minY);
	     System.out.println(a*a);
	     
	}
}
