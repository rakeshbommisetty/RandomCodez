package crackcode.ArraysStrings;

public class EditDistance {

	public static void main(String[] args) {
		String s = "aple";
		String ss = "abble";
		
		System.out.println(isOneEditDistance(s,ss));
		System.out.println(isOneEditDistance1(s,ss));

	}

	private static boolean isOneEditDistance1(String s, String ss) {
		
		if(Math.abs(s.length()-ss.length()) > 1){
			return false;
		}
		
		String s1 = (s.length() < ss.length()) ? s : ss;
		String s2 = (s.length() < ss.length()) ? ss : s;
		
		int i=0,j=0, foundDiff=0;
		
		while(i<s1.length() && j <s2.length()){
			
			if(s1.charAt(i) == s2.charAt(j)){
				++i;
			}else{
				if(foundDiff!=0){
					return false;
				}
				foundDiff = 1;
				if(s1.length() == s2.length()){
					++i;
				}
			}
			++j;
		}
		return true;
		
		
	}

	private static boolean isOneEditDistance(String s, String ss) {
		
		if(s.length() == ss.length()){
			return replaceOne(s,ss);
		}else if(s.length() + 1 == ss.length()){
			return oneEditInsert(s,ss);
		}else if(s.length() - 1 == ss.length()){
			return oneEditInsert(ss,s);
		}
		return false;
		
		
	}

	private static boolean oneEditInsert(String s, String ss) {
		int i=0,j=0,oneInsertFlag=0;
		
		while(i<s.length() && j<ss.length()){
			if(s.charAt(i) == ss.charAt(j)){
				++i;
				++j;
			}else{
				if(oneInsertFlag==0){
				++j;
				oneInsertFlag = 1;
				}
				else
					return false;
			}
		}
	
		return true;
		
		
	}

	private static boolean replaceOne(String s, String ss) {
		
		int i=0,j=0,oneEditFlag=0;
		
		while(i<s.length() && j<ss.length()){
			if(s.charAt(i) == ss.charAt(j)){
				++i;
				++j;
			}else{
				if(oneEditFlag==0){
				++j;++i;
				oneEditFlag = 1;
				}
				else
					return false;
			}
		}
		
		return true;
	}

}
