package java2novice;

import java.util.HashSet;
import java.util.Set;

public class SubStringNoRepeatation {

	 
	private static int max =0;
	private static String maxString = null; 
	
	public static void main(String[] args) {
		String str = "java2oice";
		populateSubString(str);
		
		System.out.println("longest sub string is:: "+maxString);
		System.out.println("length of the longest substring is:: "+max);
	}
	private static void populateSubString(String str) {
		char[] strChars = str.toCharArray();
		
		for(int i=0; i<strChars.length;++i){
			boolean[] count = new boolean[256];
			count[strChars[i]]= true;
			for(int j=i+1; j<strChars.length;++j){
				if(count[strChars[j]]==false && j==strChars.length-1){
					getSubString(str, i, j+1);
				}else if(count[strChars[j]]==false){
					count[strChars[j]] = true;
				}else{
					getSubString(str, i, j);
					break;
				}
			}
		}
	}
	private static void getSubString(String str, int i, int j) {
		try{
		String temp = str.substring( i, j);
		int len = temp.length();
		if(len > max){
			maxString = temp;
			max = len;
		}
		}catch(Exception e){
			System.out.println("i is::"+i);
			System.out.println("j is: "+j);
		}
		return;
	}

}
