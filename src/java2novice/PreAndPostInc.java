package java2novice;

public class PreAndPostInc {

	public static void main(String[] args) {
		int a = 5,i;

		i=++a + ++a + a++;        //Ans: i = 6 + 7 + 7 = 20 then a = 8 

		i=a++ + ++a + ++a;        //Ans: i = 8 + 10 + 11 = 29 then a = 11

		a=++a + ++a + a++;        //Ans: a = 12 + 13 + 13 = 38

		System.out.println(a);    //Ans: a = 38

		System.out.println(i);    //Ans: i = 29
	}

}
