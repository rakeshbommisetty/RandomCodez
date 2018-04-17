package hackerRank;

public class ParseString {

	public static void main(String[] args) {
		
		String s = "jgkjfgkyfkyufkyuhvhjvkyfkyutfdtd";
		String p = "jf*ky";
		
		System.out.println(findString(s,p));

	}

	private static int findString(String s, String p) {
		@SuppressWarnings("unused")
		String[] split = p.split("\\*");
		if(s.contains(split[0])){
			int index = s.indexOf(split[0]);
			int finalIndex = index + split[0].length()+1;
			int y=0;
			for(int x = finalIndex; x<split[1].length();++x,++y){
				if(s.charAt(x)!=split[1].charAt(y)){
					return -1;
				}
				
			}
			
			return index;
			
		}else{
			return -1;
		}
		
		
	}

}
