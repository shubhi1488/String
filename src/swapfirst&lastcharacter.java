//program to swap the first and last character of the words in the given string.
public class Swaping {
	static String swap(String str) {
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int k=i;
			while(i<ch.length && ch[i]!=' ' ) {
				i++;
			}
			char temp=ch[k];
			ch[k]=ch[i-1];
			ch[i-1]=temp;
		}
		return new String(ch);
	}
	public static void main(String ar[]) {
		String str="Geek for Geeks";
		System.out.println(swap(str));
	}

}
