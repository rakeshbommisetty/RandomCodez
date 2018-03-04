package crackcode.bitManipulation;

import java.util.Arrays;

public class NextNumber {

	public static void main(String[] args) {
		int a = 13948;
		String str = Integer.toBinaryString(a);
		System.out.println(str);
		findNextInteger(a, str);
	}

	private static void findNextInteger(int a, String str) {
		char[] in = str.toCharArray();
		
		int count =0, index=-1;
		for(int i=str.length()-1; i>0;--i){
			if(count>0 && in[i] == '0'){
				index=i;
				break;
				
			}else if(in[i]=='1'){
				++count;
			}else {
				continue;
			}
		}
		
		int mask = 1 << ((in.length-1) - index);
		mask = mask-1;
		mask = ~mask;
		mask = a & mask;
		
		String strMask = Integer.toBinaryString(mask);
		
		char[] inMask = strMask.toCharArray();
		
		
		inMask[index] = '1';
		--count;
		
		int j = inMask.length-1;
		while(count>0 && j>0){
			inMask[j] = '1';
			--j;
			--count;
		}
		
		StringBuilder str1 = new StringBuilder();
		for(char c:inMask){
			str1.append(c);
		}
		System.out.println(str1.toString());
		int finalInteger = Integer.parseInt(str1.toString().trim(),2);
		System.out.println("final integer is::"+finalInteger);
		
		
	}

}
