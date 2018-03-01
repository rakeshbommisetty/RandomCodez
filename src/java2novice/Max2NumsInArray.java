package java2novice;

public class Max2NumsInArray {

	public static void main(String[] args) {
		int[] a = {5,34,78,2,45,1,99,23};
		int max1=0, max2=0;
		
		for(int i=0; i<a.length; ++i){
			if(a[i] > max1){
				max2 = max1;
				max1 = a[i];
			}else if(a[i] > max2){
				max2 = a[i];
			}
		}
		
		System.out.println(max1 +"::" + max2);
	}

}
