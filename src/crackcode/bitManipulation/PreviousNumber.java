package crackcode.bitManipulation;

import java.util.Arrays;

public class PreviousNumber {

	public static void main(String[] args) {
		String str = "10011110001100";
		int in = Integer.parseInt(str, 2);
		System.out.println("input is:: "+in);
		
		findPrevious(in,str);
	}

	private static void findPrevious(int in,String str) {
		
		if(str.charAt(str.length()-1)=='1'){
			
		char[] ch = str.toCharArray();
		int flag=0,index=-1, count=0;
		
		for(int i=ch.length-1;i>0;--i){
			
			if(flag==1 && ch[i] == '1'){
				index=i;
				++count;
				break;
			}else if(flag==0&& ch[i]=='1'){
				++count;
				
			}else{
				flag=1;
				continue;
			}
		}
		
		int mask = 1 << (ch.length-1) - index+1;
		mask = mask -1;
		mask = ~mask;
		int inputMask = in & mask;
		
		String strMask = Integer.toBinaryString(inputMask);
		char[] chMask = strMask.toCharArray();
		
		while(count>0){
		chMask[++index] = '1';
		--count;
		}
		
		StringBuilder output = new StringBuilder();
		for(char c:chMask){
			output.append(c);
		}
		System.out.println("output:: "+output);
		int op = Integer.parseInt(output.toString(), 2);
		System.out.println("out put is:: "+op);
		
		}else{
			int i = str.length()-1;
			while(str.charAt(i)=='0'){
				--i;
			}
			
			char[] inChar = str.toCharArray();
			inChar[i] = '0';
			inChar[++i] = '1';
			StringBuilder output = new StringBuilder();
			for(char c:inChar){
				output.append(c);
			}
			System.out.println(output);
			int op = Integer.parseInt(output.toString(), 2);
			System.out.println("out put is:: "+op);
			
		}
		
	}

}
