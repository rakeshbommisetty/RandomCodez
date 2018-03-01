package assignment.three;

public class MergeSort {

	public static void main(String[] args) {
		String str = "56379810";
		char[] a = str.toCharArray();
		int[] i = new int[a.length];
		int x=-1;
		
		for(int z :a){
			i[++x] = z;
		}
		
		for(Integer ab: i){
			System.out.println("Before:  "+ab);
		}
		
		
		MergeSort(i);
		
		for(Integer ab: i){
			System.out.println(ab);
		}
		

	}

	private static void MergeSort(int[] i) {
		int ilength = i.length;
		if(ilength<2)
			return;
		int mid = ilength/2;
		int[] larray = new int[mid];
		int[] rarray = new int[ilength-mid];
		int ab=0;
		
		for(int x=0;x<mid; x++){
			larray[x]=i[x];
		}
		for(int y=(ilength-mid); y<ilength; y++){
			rarray[ab] = i[y];
			++ab;
		}
		MergeSort(larray);
		MergeSort(rarray);
		Merge(i,larray,rarray);
		
		
	}

	private static void Merge(int[] i, int[] larray, int[] rarray) {
		int x=0,y=0, z=0;
		while(x<larray.length && y<rarray.length){
			if(larray[x] < rarray[y]){
				i[z] = larray[x];
				++z;
				++x;
			}else if(larray[x] > rarray[y]){
				i[z] = rarray[y];
				++z;
				++y;
			}
		}
		
		while(x<larray.length){
			i[z] = larray[x];
			++z;
			++x;
		}
		
		while(y<rarray.length){
			i[z] = rarray[y];
			++z;
			++y;
		}
	}

}
