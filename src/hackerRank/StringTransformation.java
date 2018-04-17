package hackerRank;

import java.util.Scanner;

public class StringTransformation {

	static char[] ch = new char[26];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		char[] in = new char[count];
		for(int i=0;i<count;++i){
			in[i] = (char)sc.next().trim().charAt(0);
		}
		
		for(int i=0;i<in.length;++i){
			
			ch[in[i]-'a']++;
			int x = ch[in[i]-'a'];
			if(x >1){
				in[i] = (char) (in[i] + x-1);
			}
		}
		
		System.out.println(in);
		
	}

}
