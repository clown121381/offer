package offer;

import java.util.Scanner;
import java.util.Stack;

public class Problem40 {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        long x = sc.nextLong();
	        int k = sc.nextInt();
	        foo(x,k);
	    }
	    
	    public static void foo(long x,int k){
	        Stack<Long> s = new Stack<>();
	        while(x!=0){
	            s.push( (x%k));
	            x /= k;
	        }
	        while(!s.isEmpty()){
	            System.out.print(s.pop());
	        }
	    }
}
