package assignment.two;

public class ReverseStringWords {

	public static void main(String[] args) {
		String st = "That is Rakesh the GREAT :)";
		System.out.println(st);
		reverseWords(st.toCharArray());
	}

	static void reverseWords(char[ ] s){
	
		int i=0, j = s.length-1;
		
		while(i!=j && i<j){
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			++i; --j;
		}
		
		System.out.println(s);
		int x=0;
		for(int y=0;y<s.length;++y){
		x=y;
			while(s[x]!=' ' && x<s.length-1)
				++x;
			
			if(x == s.length-1)
				++x;
			
			int flag = x;
			--x;
			
			while(y!=x && y<x){
				char temp = s[y];
				s[y] = s[x];
				s[x] = temp;
				++y; --x;
			}
			
			y = flag;
			
		}
		
		System.out.println(s);
	}
}
