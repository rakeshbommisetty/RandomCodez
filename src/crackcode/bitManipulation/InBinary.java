package crackcode.bitManipulation;

public class InBinary {

	public static void main(String[] args) {
		Double d = 0.625;
		System.out.println(toBinaryRep(d));
	}

	private static String toBinaryRep(Double d) {
		if(d<0 || d>1){
			return null;
		}
		StringBuilder str = new StringBuilder();
		str.append(".");
		
		while(d>0){
			if(str.length() > 32){
				return "error";
			}
			d *= 2;
			if(d>=1){
				str.append("1");
				d -= 1;
			}else{
				str.append("0");
			}
		}
		return str.toString();
		
		
	}

}
