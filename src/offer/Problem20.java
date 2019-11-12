package offer;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Problem20 {
	public static int GetUglyNumber_Solution(int index) {
		Set<Integer> set = new HashSet<>();
		int ugly = 0;
		set.add(1);
		int i = 1;
		while (ugly < Integer.MAX_VALUE) {
			int a = (int)Math.pow(2,i);
			set.add(a);
			int b = (int)Math.pow(4,i);
			set.add(b);
			int c = (int)Math.pow(5,i);
			set.add(c);
			set.add(a*c);
			set.add(a*b);
			set.add(b*c);
			set.add(a*b*c);
			ugly = a*b*c;
			
		}
		set.stream().sorted(Comparator.reverseOrder());
		Iterator<Integer> it = set.iterator();
		
		int j = 0;
		while(it.hasNext()){
			if(++j == index){
				return it.next();
			}
			it.next();
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(10));
	}
}
