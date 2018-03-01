package geeksForGeeks.dynamicProgramming;

import java.util.Arrays;

public class MinimumPartition {

	public static void main(String[] args) {
		int arr[] = {1,6,11,5};
        int n = arr.length;
        findMin(arr, n);
	}

	private static void findMin(int[] arr, int n) {
		
		Arrays.sort(arr);
		
		int i=0, j = arr.length-1;
		
		int leftSum, rightSum;
		
		leftSum = arr[i];
		rightSum = arr[j];
		
		while(i+1<j){
			if(leftSum<rightSum){
				leftSum = leftSum + arr[++i];
			}else if(leftSum > rightSum){
				rightSum = rightSum + arr[--j];
			}else{
				leftSum = leftSum + arr[++i];
				rightSum = rightSum + arr[--j];
			}
		}
		
		System.out.println("left sum:: "+leftSum);
		
		System.out.println("right sum:: "+rightSum);
		
		System.out.println(" diff sum:: "+Math.abs(leftSum-rightSum));
		
		
		
	}

}
