package hackerRank;

import java.util.LinkedHashMap;
import java.util.Random;

public class test {

	public static void main(String[] args){
		try{
			badmethod();
			System.out.println("A");
		
		}
	catch(Exception ex){
		System.out.println("B");
	}
	finally
	{
		System.out.println("c");
		LinkedHashMap a = new LinkedHashMap();
		Random r = new Random();
		
	}
System.out.println("D");

}
public  static void badmethod(){
	throw new RuntimeException();
}
}