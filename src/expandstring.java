//Java program to expand a String if range is given
public class ExpandString {
	public static void expand(String word)
    {
 
        
        StringBuilder sb = new StringBuilder();
 
        
        String[] strArr = word.split(", ");
 
        
        for (int i = 0; i < strArr.length; i++) {
 
          
            String[] a = strArr[i].split("-");
 
          
            if (a.length == 2) {
 
                int low = Integer.parseInt(a[0]);
                int high
                    = Integer.parseInt(a[a.length - 1]);
 
                
                while (low <= high) {
 
                    
                    sb.append(low + " ");
                    low++;
                }
            }
 
           
            else {
 
                sb.append(strArr[i] + " ");
            }
        }
 
        
        System.out.println(sb.toString());
    }
	public static void main(String[] args) {
		String str="1-5, 8, 11-14, 18, 20, 26-29";
		expand(str);

	}

}
