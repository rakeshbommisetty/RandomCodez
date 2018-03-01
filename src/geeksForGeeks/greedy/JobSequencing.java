package geeksForGeeks.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Job{
	char jobid;
	int deadline;
	int profit;
	
	public Job(){
		
	}
	
	public Job(char jobid, int deadline, int profit){
		this.jobid = jobid;
		this.deadline = deadline;
		this.profit = profit;
	}
	
	public String toString(){
		return "jobId: "+this.jobid+" deadline: "+this.deadline+" profit: "+this.profit;
	}
}

class DeadLineComparator implements Comparator{
	public int compare(Object o1,Object o2){
		Job j1 = (Job)o1;
		Job j2 = (Job) o2;
		return (j1.deadline) - (j2.deadline);
	}
}

class ProfitComparator implements Comparator{
	public int compare(Object o1,Object o2){
		Job j1 = (Job)o1;
		Job j2 = (Job) o2;
		return (j2.profit) - (j1.profit);
	}
}

public class JobSequencing {

	public static void main(String[] args) {
		
		
		Job[] jobs = new Job[4];
		
		
		jobs[0] = new Job('a', 4, 20);
		jobs[1] = new Job('b', 1, 10);
		jobs[2] = new Job('c', 1, 40);
		jobs[3] = new Job('d', 1, 30);
		
		/*jobs[0] = new Job('a', 2, 100);
		jobs[1] = new Job('b', 1, 19);
		jobs[2] = new Job('c', 2, 27);
		jobs[3] = new Job('d', 1, 25);
		jobs[4] = new Job('e', 3, 15);*/
		/*jobs[5] = new Job('f', 4, 6);
		jobs[6] = new Job('g', 3, 100);*/
		
	
		
	/*	for (int i=0;i<n;++i){
			jobs[i] = new Job();
			jobs[i].jobid = (char) (97+i);
			jobs[i].deadline = 1+i;
			jobs[i].profit = 10*i+10;
			if(i==0){
				jobs[i].deadline = 2;
				jobs[i].profit = 100;
				
			}else if(i==1){
				jobs[i].deadline = 1;
				jobs[i].profit = 19;
				
			}else if(i==2){
				jobs[i].deadline = 2;
				jobs[i].profit = 27;
				
			}else if(i==3){
				jobs[i].deadline = 1;
				jobs[i].profit = 25;
			}else if(i==4){
				jobs[i].deadline = 3;
				jobs[i].profit = 15;
			}
			
		}*/
		
		System.out.println("the input entered is:: "+Arrays.toString(jobs));
		
		findMaxJobSequence(jobs);
	}

	private static void findMaxJobSequence(Job[] jobs) {
		
		/*
		 * *	
		 * The below code doesn't work for 
		 * 
		 * Job arr[] = { {'a', 2, 100}, {'b', 1, 19}, {'c', 2, 27},
                   {'d', 1, 25}, {'e', 3, 15}};
          output should be: c a e
          But I'm getting d a e. Because I'm picking one for each day.
          
          
		DeadLineComparator dlc = new DeadLineComparator();
		ArrayList<Job> res = new ArrayList<Job>();
		Arrays.sort(jobs, dlc);
		System.out.println(Arrays.toString(jobs));
	  	res.add(jobs[0]);
		for(int i=1;i<jobs.length;++i){
				if(res.get(res.size()-1).deadline==jobs[i].deadline && res.get(res.size()-1).profit < jobs[i].profit){
					res.remove(res.size()-1);
					res.add(jobs[i]);
				}else if(res.get(res.size()-1).deadline!=jobs[i].deadline){
					res.add(jobs[i]);
				}
		System.out.println(" output is:: "+res.toString());
		}*/
		
		
	/*	approach 2 also fails
		
		ProfitComparator pc = new ProfitComparator();
		Arrays.sort(jobs, pc);
		
		System.out.println(Arrays.toString(jobs));
		ArrayList<Job> res = new ArrayList<Job>();
		
		for(int i=0;i<jobs.length;++i){
			if(jobs[i].deadline > res.size()){
				res.add(jobs[i]);
			}
		}
		
		System.out.println(res.toString());*/
		
		DeadLineComparator dlc = new DeadLineComparator();
		ArrayList<Job> res = new ArrayList<Job>();
		Arrays.sort(jobs, dlc);
		System.out.println(Arrays.toString(jobs));
		
		for(int i=0;i<jobs.length;++i){
			if(jobs[i].deadline == res.size()){
				for(int y=0;y<res.size();++y){
					if(res.get(y).profit < jobs[i].profit){
						res.remove(y);
						res.add(y, jobs[i]);
						break;
					}
				}
			}else if(jobs[i].deadline > res.size()){
				res.add(jobs[i]);
			}
		}
		
		System.out.println(res);
		
		
	}

}
