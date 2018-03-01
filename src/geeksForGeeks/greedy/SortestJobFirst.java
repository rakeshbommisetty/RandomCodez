package geeksForGeeks.greedy;

import java.util.Arrays;
import java.util.Comparator;

class Process{
	 int pid; // Process ID
	 int bt;  // Burst Time
	 int waitingTime;
	 int tat;
	 
	 public Process(){
		 
	 }
	 
	 public Process(int pid, int bt){
		 this.pid = pid;
		 this.bt = bt;
	 }
	 
	 public String toString(){
		 return "pid:: "+pid+" burst time:: "+bt+" waitingTime: "+waitingTime+" tat:: "+(bt+waitingTime)+"\n";
	 }
}

class BTComparator implements Comparator<Process>{
	public int compare(Process p1, Process p2){
		return p1.bt - p2.bt;
	}
}
public class SortestJobFirst {

	public static void main(String[] args) {
		
		Process[] par = new Process[4];
		par[0] = new Process(1, 6);
		par[1] = new Process(2,8);
		par[2] = new Process(3,7);
		par[3] = new Process(4, 3);
		
		Arrays.sort(par, new BTComparator());
		System.out.println(Arrays.toString(par));
		
		for(int i=0;i<par.length;++i){
			par[i].waitingTime = i==0?0:par[i-1].bt+par[i-1].waitingTime;
			
		}
		
		System.out.println(Arrays.toString(par));
		
		
		
	}

}
