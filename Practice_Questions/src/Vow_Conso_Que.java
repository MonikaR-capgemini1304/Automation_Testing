
public class Vow_Conso_Que {
public static void main(String[] args) {
	String s="Capgemini";
	int c=0;
	for(int i=0;i<s.length();i++) {
		if(String.valueOf(s.charAt(i)).equalsIgnoreCase("a")||
				String.valueOf(s.charAt(i)).equalsIgnoreCase("e")||
				String.valueOf(s.charAt(i)).equalsIgnoreCase("i")||
				String.valueOf(s.charAt(i)).equalsIgnoreCase("o")||
				String.valueOf(s.charAt(i)).equalsIgnoreCase("u")) {
			c++;
		}
	}
	System.out.println("vowel: "+c);
	int co=s.length()-c;
	System.out.println("consonant: "+co);
}
}
