package offer;
/**
 * ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��
 * дЩ�����ڱ����ϡ�ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish����������
 * ��ȴ������������˼�����磬��student. a am I������������ʶ����
 * ��һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a student.����
 * Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 * @author ���������
 *
 */
public class Problem19 {
	public static String ReverseSentence(String str) {
		if("".equals(str.trim())){
			return str;
		}
		String[] strArray = str.split(" ");
		StringBuffer s = new StringBuffer("");
		for(int i = strArray.length-1;i >=0;i --){
			s.append(strArray[i]).append(" ");
		}
        return s.toString().trim();
    }
	public static void main(String[] args) {
//		String str="I am a student";
//		str = ReverseSentence(str);
//		System.out.println("/"+str+"/");
		
		
		
		System.out.println();
	}
}
