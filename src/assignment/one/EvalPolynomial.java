package assignment.one;

public class EvalPolynomial {

	public static void main(String[] args) {
		int[] coeff = {4,3,2,1};
		int degree = 2;
		int number = 2;
		
		evalPoly(coeff, number, degree);
		

	}

	private static void evalPoly(int[] coeff, int number, int degree) {
		double sum =0;
		for(int i=0; i<coeff.length; ++i){
			sum = sum + coeff[i]*Math.pow(number, degree);
			degree = (degree>0) ? degree-1 :degree;
		}
		
		System.out.println("sum is:: "+sum);
	}

}
