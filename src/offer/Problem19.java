package offer;
/**
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，
 * 写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，
 * 但却读不懂它的意思。例如，“student. a am I”。后来才意识到，
 * 这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 * @author 爱不会绝迹
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
