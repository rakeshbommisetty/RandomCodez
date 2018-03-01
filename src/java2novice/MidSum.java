package java2novice;

public class MidSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,4};
		int i=0;
		int j=a.length-1;
		int leftsum = a[i];
		int rightsum =a[j];
		int flag =0;
		while(i<j){
		if(leftsum==rightsum && j==i+1){
		System.out.println("Match found i and j are: "+i);
		flag=1;
		break;
		}
		else if(leftsum==rightsum && j!=i+1){
		i+=1;
		j-=1;
		leftsum = leftsum+a[i];
		rightsum = rightsum +a[j];
		}
		else if(leftsum < rightsum){
		i+=1;
		leftsum = leftsum+a[i];
		}
		else if(leftsum > rightsum){
		j-=1;
		rightsum = rightsum+a[j];
		}else{
		System.out.println("Match not found");
		break;
		}
		}
		
		if(flag!=1){
			System.out.println("match not found");
		}


	}

}
