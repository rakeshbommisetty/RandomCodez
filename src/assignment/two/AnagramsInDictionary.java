package assignment.two;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class AnagramsInDictionary {

	
		private static final String FILENAME = "C:\\Rakesh\\RAKESH\\EclipseWorkspace\\t20\\filename.txt";

		public static void main(String[] args) {
			String[] arg = null;

			try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

				String sCurrentLine;
				arg = new String[11];
				int i=0;

				while ((sCurrentLine = br.readLine()) != null) {
				//	System.out.println(sCurrentLine);
					arg[i] = sCurrentLine;
					++i;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
			
			distinctAnagrams(arg);
		}

		private static void distinctAnagrams(String[] arg) {
			
			for(int i=0;i<arg.length;++i){
				char[]	each = arg[i].toCharArray();
				Arrays.sort(each);
				arg[i] = Arrays.toString(each);
			}
			
			Arrays.sort(arg, String.CASE_INSENSITIVE_ORDER);
			
			for(int i=0; i<arg.length;++i){
				String temp = arg[i];                 
				while(i<arg.length && temp.equals(arg[++i])){
					arg[i] = null;
				}
			}
			
			//System.out.println(arg.toString());
			
			for(String each1: arg){
				if(each1!=null)	{
					System.out.println(each1);
				}
			}
		}
	}


