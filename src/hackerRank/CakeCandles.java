package hackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class CakeCandles {

    /*
     * Complete the birthdayCakeCandles function below.
     */
    static int birthdayCakeCandles(int n, Integer[] ar) {
        /*
         * Write your code here.
         */
       // Arrays.sort(ar,Collections.reverseOrder());
        Arrays.sort(ar, Collections.reverseOrder());
        int i=0, count=1;
        while(ar[i]==ar[i+1]){
            count++;i++;
        }
        return count;
        

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      //  int n = Integer.parseInt(scan.nextLine().trim());

    	Scanner s = new Scanner(System.in);
    	int n =s.nextInt();
        Integer[] ar = new Integer[n];
        
        for(int i=0;i<n;++i){
        	ar[i] = s.nextInt();
        }

       

        int result = birthdayCakeCandles(n, ar);

      System.out.println(result);
    }
}

