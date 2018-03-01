package geeksForGeeks.searchAlgos;

public class LinearSearch_1 {

	public static void main(String args[]){
		int[] a={56,44,22,788,121,9,332,12,3211,0};
		int elementToSearch = 9;
		int index = searchElement(a,elementToSearch);
		if(index>-1)
			System.out.println("The element to search is found in the index: "+index);
	}

	private static int searchElement(int[] a, int elementToSearch) {
		for(int i=0;i<a.length;++i){
			if(a[i]==elementToSearch){
				System.out.println("Element to search found");
				return i;
			}
			
		}
		return -1;
	}
}
