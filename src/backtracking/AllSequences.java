package backtracking;

import java.util.Arrays;

public class AllSequences {

	public static void main(String[] args) {
		char a = 'A';
		int n =2;
		char[] in = new char[n];
		
		for(int i=0;i<in.length;++i){
			in[i] = (char)(a+i);
		}
		
		System.out.println(Arrays.toString(in));
		System.out.println("display done");
		
		allSeq1(in);
		System.out.println("allseq1 done");
		allSeq2(in);
		System.out.println("allseq2 done");
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
			out[d] = in[i];
			auxSeq(d+1,in,out);
		}
	}

	private static void allSeq2(char[] in) {
		for(int i=0;i<in.length;++i){
			for(int j=0;j<in.length;++j){
				for(int k=0;k<in.length;++k){
					for(int l=0;l<in.length;++l){
						System.out.println(" ["+in[i]+","+in[j]+","+in[k]+","+in[l]+"]");
					}
				}
				
			}
		}
	}

	private static void allSeq1(char[] in) {
		
		for(int i=0;i<in.length;++i){
			for(int j=0;j<in.length;++j){
				System.out.println(" ["+in[i]+","+in[j]+"]");
			}
		}
	}

}
