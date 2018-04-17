package hackerRank;

import java.util.ArrayList;
import java.util.List;

interface Pancake{
	List<String> doStuff(List<String> s);
}
public class ListAdd implements Pancake{

	public static void main(String[] args) {
		List<String> x = new ArrayList<String>();
		x.add("3"); x.add("7"); x.add("5");
		List<String> y = new ListAdd().doStuff(x);
		y.add("1");
		System.out.println(x);
	}

	@Override
	public List<String> doStuff(List<String> z) {
		z.add("9");
		return z;
		
		
	}

}
