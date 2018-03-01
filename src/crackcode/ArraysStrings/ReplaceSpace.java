package crackcode.ArraysStrings;

import java.util.Arrays;

public class ReplaceSpace {

	public static void main(String[] args) {
		String x = "Just do what you like";
		String st = "Just do what you like        ";
		System.out.println(replaceString(st.toCharArray(), x.length()));
	}

	private static String replaceString(char[] in, int trueLength) {

		int index = in.length-1;
		for(int i= trueLength-1; i>=0;i--){
			if(in[i]== ' '){
				in[index] = '0';
				in[--index] = '2';
				in[--index] = '%';
				index--;
			}else{
				in[index] = in[i];
				index--;
			}
		}
		return Arrays.toString(in);


	}

}
