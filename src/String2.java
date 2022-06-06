//sorting the user entered string with time complexity O(n)
public class String2 {
    static final int max=26;
    static void sort(String str){
        int letters[]=new int[max];//create the hash array to store the characters of the string
        //traverse the array and sort the array
        for (char x:str.toCharArray()) {
            letters[x-'a']++;
        }
        //now print the sorted array of string
        for (int i=0;i<max;i++){
            for (int j=0;j<letters[i];j++){
                System.out.println((char) (i+'a'));
            }
        }
    }
//driver code...................
    public static void main(String[] args) {
        sort("geekforgeeks");
    }
}
