
public class Char_In_Str {
public static void main(String[] args) {
	String s="Capgemini";
	int c=0;
	for (int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			c++;
		}
	}
	System.out.println(c);
}
}
