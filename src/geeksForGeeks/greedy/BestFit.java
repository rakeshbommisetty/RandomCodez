package geeksForGeeks.greedy;

public class BestFit {

	public static void main(String[] args) {
		int blockSize[] = {100, 500, 200, 300, 600};
        int processSize[] = {212, 417, 112, 426};
        int m = blockSize.length;
        int n = processSize.length;
         
        bestFit(blockSize, m, processSize, n);
	}

	private static void bestFit(int[] blockSize, int m, int[] processSize, int n) {
		for(int i=0;i<n;++i){

			int minBlock=Integer.MAX_VALUE;
			int blockIndex=Integer.MIN_VALUE;
			for(int j=0;j<m;++j){

				if(blockSize[j]-processSize[i]>0){
					int diffSize= blockSize[j]-processSize[i];
					if(minBlock< 0 || minBlock > diffSize){
						minBlock = diffSize;
						blockIndex = j;
					}
				}
			}

			if(blockIndex>=0){
			blockSize[blockIndex] -= processSize[i];
			System.out.println(" process id: "+i+" process Size:: "+processSize[i]+" allocated in block:: "+blockIndex);
			}
		}

	}

}
