package crackcode.ArraysStrings;

class UniqueChars{
	public static void main(String[] args){
		String str =  "abcd";
		boolean isUnique = isUniqueChars(str);
		System.out.println("has unique chars:: "+isUnique);
		isUnique = isUniqueChars1(str);
		System.out.println("has unique chars:: "+isUnique);
	}

	private static boolean isUniqueChars1(String str) {
		/*int checker= 0;
		for (int i= 0; i < str.length(); i++) {
		int val= str.charAt(i) - 'A';
		int temp = 1 << val;
		if ((checker & (temp)) > 0) {
		return false;
		}
		checker |= (1 << val);
		}
		 return true;*/
		
		int checker =0;
		for(int i=0;i<str.length();++i){
			int diff = str.charAt(i) - 'A';
			int temp = 1 << diff;
			if((checker & temp) > 0){
				return false;
			}
			checker |= (1 << diff);
		}
		return true;
}

	public static boolean isUniqueChars(String str){
		if(str==null || str.length()==0 || str.length() > 128){
			return false;
		}

		boolean[] unique = new boolean[128];

		for(int i=0;i<str.length();++i){
			int charInt = str.charAt(i);
			if(unique[charInt]){
				return false;
			}else{
				unique[charInt] = true;
			}
		}

		return true;
	}
}