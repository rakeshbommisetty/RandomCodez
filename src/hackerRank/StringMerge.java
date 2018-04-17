package hackerRank;

import java.util.Scanner;

public class StringMerge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		StringBuilder sb = new StringBuilder();
		
		if(str1.length()==0){
			System.out.println(str2);
		}else if(str2.length()==0){
			System.out.println(str1);
		}
		
		int i=0,j=0;
		
		for(;i<str1.length() && j<str2.length(); ++i,++j){
			sb.append(str1.charAt(i));
			sb.append(str2.charAt(j));
		}
		
		while(i<str1.length()){
			sb.append(str1.charAt(i));
			++i;
		}
		
		while(j<str2.length()){
			sb.append(str2.charAt(j));
			++j;
		}
		
		System.out.println(sb.toString());
		
	}

}
