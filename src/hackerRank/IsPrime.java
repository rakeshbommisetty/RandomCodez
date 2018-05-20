package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IsPrime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
        	System.out.println( 
                    (isPrime1(in.nextInt()) ? "Prime" : "Not prime") );
        	System.out.println( 
                    (isPrime2(in.nextInt()) ? "Prime" : "Not prime") );
        	System.out.println( 
                    (isPrime3(in.nextInt()) ? "Prime" : "Not prime") );
        }
    }
    
    private static boolean isPrime3(int n) {
		
    	 double sqrt = Math.sqrt(n);
         
         if(n==0)
             return false;
         else if(n==2)
             return true;
         else if(n==1 || (n & 1) == 0){
             return false;
         }
         else {
                      
         for(int i=3;i<=sqrt;i+=2){
             if(n%i == 0){
                 return false;
             }
         }
         
         return true;
         }
		
		
	}

	private static boolean isPrime2(int n) {
		
    	  double sqrt = Math.sqrt(n);
          
          if(n==0)
              return false;
          else if(n==1)
              return false;
          else if(sqrt == Math.ceil(sqrt)){
              return false;
          }
          else {
           
          int count = 1;
          
          for(int i=2;i<=sqrt;++i){
              if(n%i == 0){
                  count++;
                  return false;
              }
              
                  
          }
          
          return true;
          }
		
		
	}

	private static boolean isPrime1(int n){
        
        double sqrt = Math.sqrt(n);
        
        if(n==0)
            return false;
        else if(n==1)
            return false;
        else if(sqrt == Math.ceil(sqrt)){
            return false;
        }
        else {
        int limit = n/2;
        int count = 1;
        
        for(int i=2;i<limit;++i){
            if(n%i == 0){
                count++;
                return false;
            }
            
        }
        
        return true;
        }
        
    }
}

