package offer;
/**
 * 
 * 
 * 
 * ×Ö·û´®·­×ª
 * @author °®²»»á¾ø¼£
 *
 */
public class Problem34 {
	  public static String LeftRotateString(String str,int n) {
		  if(str==null){
			  return null;
		  }
		  if(str.trim().length()==0){
			  return "";
		  }
	        char[] c = str.toCharArray();
	        char[] a = new char[n];
	        for(int i = 0;i < n;i ++){
	            a[i] = c[i];
	        }
	        
	        for(int i = 0;i < c.length-n;i++){
	            c[i] = c[i+n];
	        }
	        
	        int k = 0;
	        for(int i = c.length-n;i <c.length;i++){
	            c[i] = a[k++];
	        }
	        
	        return new String(c);
	    }
	  
	  
	  public static void main(String[] args) {
		System.out.println(LeftRotateString(null,3));
	}
}
