package backtracking;

import java.util.Arrays;

public class PermutationSequence {


	public static void main(String[] args) {
		char a = 'A';
		int n =2;
		char[] in = new char[n];
		
		for(int i=0;i<in.length;++i){
			in[i] = (char)(a+i);
		}
		
		System.out.println(Arrays.toString(in));
		System.out.println("display done");
		
		allSeq3(in);
		System.out.println("done");
		
	}

	private static void allSeq3(char[] in) {
		char[] out = new char[in.length];
		auxSeq(0,in,out);
	}

	private static void auxSeq(int d, char[] in, char[] out) {
		if(d==in.length){
			System.out.println(Arrays.toString(out));
			return;
		}
		
		for(int i=0;i<in.length;++i){
			if(isValid(d,in[i],out)){
			out[d] = in[i];
			auxSeq(d+1,in,out);
			}
		}
	}

	private static boolean isValid(int d, char in, char[] out) {
		for(int i=0;i<d;++i){
			if(out[i]==in){
				return false;
			}
		}
		
		return true;
		
		
	}




}
