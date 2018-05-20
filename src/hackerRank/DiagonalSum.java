package hackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DiagonalSum {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
        
        int sum1=0, sum2=0;
        int size=a.length;
        
        for(int i=0,j=0;i<size && j<size;++i,++j){
            sum1 += a[i][j];
        }
        
        for(int i=0,j=size-1;i<size && j>=0;++i,--j){
            sum2 += a[i][j];
        }
        
        return Math.abs(sum1-sum2);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        

        int[][] a = new int[][]{{11,2,4},{4,5,6},{10,8,-12}};
       /* a[0] = {11,2,4}
        a[1] = {4,5,6}
        a[2] = {10,8,-12};*/

     

        int result = diagonalDifference(a);

        System.out.println(result);
    }
}

