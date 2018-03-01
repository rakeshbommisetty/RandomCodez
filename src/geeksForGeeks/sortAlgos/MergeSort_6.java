package geeksForGeeks.sortAlgos;

import java.util.Arrays;

public class MergeSort_6 {

	public static void main(String[] args) {
		int arr[] = {64, 25, 12, 22, 11};
		
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeSort(int[] a, int l,int r) {
		if(a.length<=1 || l>=r){
			return;
		}
		int mid = (l+r)/2;
		mergeSort(a,l,mid);
		mergeSort(a,mid+1,r);
		merge(a,l,mid,r);
		
		
		
		
	}

	private static void merge(int[] a, int l, int m, int r) {
		
		int[] la = new int[m-l+1];
		int[] ra = new int[r-m];
		int x=0,y=0;
		
		for(int i=l;i<=m;++i,++x){
			la[x] = a[i];
		}
		
		for(int j=m+1;j<r+1;++j,++y){
			ra[y] = a[j];	
		}
		
		x=0;y=0;
		int k=l;
		
		while(x<la.length && y<ra.length){
			if(la[x] > ra[y]){
				a[k] = ra[y];
				++y;++k;
			}else{
				a[k] = la[x];
				++x;++k;
			}
		}
		
		while(x<la.length){
			a[k] = la[x];
			++x;++k;
		}
		
		while(y<ra.length){
			a[k] = ra[y];
			++y;++k;
		}
		
		
	}

	private static void swap(int[] a, int l, int r) {
		int temp = a[l];
		a[l]= a[r];
		a[r] = temp;
	}

}
