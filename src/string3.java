//sort the string in descending order.................................................
import java.util.*;
class string3 {
    static void desc(char[] s){
        Arrays.sort(s);
        reverse(s);
    }

     private static void reverse(char[] a) {
        int i,n=a.length;
        char t;
        for (i=0;i<n/2;i++){
            t=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=t;
        }
     }

     public static void main(String[] args) {
         char[]str= "alkasingh".toCharArray();
         desc(str);
         System.out.println(String.valueOf(str));
     }
 }
