package geeksForGeeks.greedy;

public class FirstFit {

	public static void main(String[] args) {
		int blockSize[] = {100, 500, 200, 300, 600};
        int processSize[] = {212, 417, 112, 426};
        int m = blockSize.length;
        int n = processSize.length;
         
        firstFit(blockSize, m, processSize, n);
	}

	private static void firstFit(int[] blockSize, int m, int[] processSize,	int n) {
		
		for(int i=0;i<n;++i){
			int j=0;
			
			while(j<m){
				if(processSize[i]<blockSize[j]){
				blockSize[j] -= processSize[i];
				System.out.println("allocated for the Process: "+i+" Process Size : "+processSize[i]+" block number: "+j);
				
				break;
				}
				++j;
				if(j==m){
					System.out.println("not able to allocate for the Process:: "+i+" Process Size : "+processSize[i]);
				}
			}
		}
	}

}
