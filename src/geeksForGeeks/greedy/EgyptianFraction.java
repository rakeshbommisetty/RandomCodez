package geeksForGeeks.greedy;

public class EgyptianFraction {
	
	private static StringBuffer st = new StringBuffer();

	public static void main(String[] args) {
		int nr = 2; int dr = 3;
		printEgyptionFraction(nr,dr);
		st = st.replace(st.length()-1, st.length(), "");
		System.out.println(st.toString());
	}

	private static void printEgyptionFraction(int nr, int dr) {
		if(nr==0 || dr==0 ){
			return; 
		}else if(nr%dr == 0){
			st.append(nr/dr).append("+");
			
		}else if(dr % nr==0){
			st.append("1/").append(dr/nr).append("+");
		}else if( nr >dr){
			int n = nr/dr;
			st.append(n).append("+");
			printEgyptionFraction(nr-n*dr, dr );
		}else{
			int n = (int) (dr/nr)+1;
			st.append("1/").append(n).append("+");
			printEgyptionFraction(nr*n-dr,n*dr);
		}
		
		
	}

}
