//program to sort the string entered by the user.Time complexity:O(nlogn)
import java.util.Arrays;
import java.util.Scanner;

public class String1 {
    static void sort(String str){
        char[] ch=str.toCharArray();//toCharArray() converts a string into sequence of characters which will be stored in array
        Arrays.sort(ch);//this method will sort the array of characters
        System.out.println(String.valueOf(ch));//valueOf() converts different type of values into string
    }
//driver code.......................................................................................................
    public static void main(String[] args) {
        String ch;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string");
        ch=s.next();
        System.out.println("unsorted string is "+ch);
        System.out.println("sorted string is");
        sort(ch);
    }
}
