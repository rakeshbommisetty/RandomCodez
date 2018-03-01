package assignment.two;

public class MysteryLength {

	public static void main(String[] args) {
		String str = "JamesBond1012";
		char[] a = str.toCharArray();
		boolean flag = remLength(a);
		System.out.println(flag);
		
	}

	private static boolean remLength(char[] a) {
		int size = a.length-1, cap;
		Character c = null ;
		
		while(c.isDigit(a[size]) && size>0){
			StringBuilder sb = new StringBuilder();
			for(int i =size; i<a.length;i++){
				sb.append(a[i]);
			}
			System.out.println(sb);
			Integer i = Integer.parseInt(sb.toString());
			
			
			if(size==i){
				
				return true;
			}
			--size;
		}
		
		return false;
	}

}
