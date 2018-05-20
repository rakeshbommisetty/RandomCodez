package hackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class StairCase {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        int spaces;
        int steps;
      //  Arrays.sort(ar,Collections.reverseOrder());
        for(int i=1;i<=n;++i){
            
        	steps = i;
            spaces = n-steps;
            StringBuilder sb= new StringBuilder();
            while(spaces>0){
                sb.append(" ");
                spaces--;
            }
            
            while(steps>0){
                sb.append("#");
                steps--;
            }
            System.out.println(sb.toString());
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
       // int n = Integer.parseInt(scan.nextLine().trim());

        staircase(6);
    }
}
