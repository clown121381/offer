package offer;

/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n��
 * �������쳲��������еĵ�n���0��ʼ����0��Ϊ0����n<=39
 * @author ���������
 *
 */
public class Problem02 {
	public static int Fibonacci(int n) {
		if(n==1){
			return 1;			
		}
		if(n==0){
			return 0;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
    }
	
	public static void main(String[] args) {
		System.out.println(Fibonacci(3));
	}
}
