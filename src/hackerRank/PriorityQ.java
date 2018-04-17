package hackerRank;

import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue<String> px = new PriorityQueue<String>();
		px.add("dishes");
		px.add("laundry");
		px.add("bills");
		px.offer("bills");
		System.out.println(px.size()+"  "+px.poll());
	//	System.out.println(px.size());
		System.out.println(" "+px.peek()+" "+px.poll());
		System.out.println(" "+px.poll()+" "+px.poll());
	//	System.out.println(px.size());
		
		numberFormat();
	}

	private static void numberFormat() {
		try{
		Float f = new Float("133.0");
		int i = f.intValue();
		byte b = f.byteValue();
		double d = f.doubleValue();
		
		System.out.println(i + b + d);
		}
		catch(NumberFormatException e){
			System.out.println("bad number");
		}
	}

}
