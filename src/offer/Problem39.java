package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，
 * 那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
 * 那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 * @author 爱不会绝迹
 *
 */
public class Problem39 {
	static List<Integer> list = new ArrayList<>();
    public static void Insert(Integer num) {
        list.add(num);
    }

    public static Double GetMedian() {
        int len = list.size();
        list.sort((x,y)->x-y);
        if(len%2!=0){
            return (double)list.get((len/2));
        }else{
            return (double)(list.get((len/2)-1) + list.get((len/2)))/2;
        }
    }
    
    public static void main(String[] args) {
		Insert(1);
		Insert(2);
		Insert(3);
		Insert(4);
		Insert(5);
		Insert(6);
		
		System.out.println(GetMedian());
		
	}
}
