package java2novice;

public class StringRev {
	static String a = "Pega";
	static String b = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

reverse(a);
System.out.println(b);
	}

	private static String reverse(String a) {
		// TODO Auto-generated method stub
		if(a.length()==1){
			return a;
		}
		
		b = a.charAt(a.length()-1)+reverse(a.substring(0, a.length()-1));
		return b;
	}

}
