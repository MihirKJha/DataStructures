package mj.programs.datastructureProblems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/**
 * It calculates minimum number of bribes that took place to
 * get the queue into its current state!
 *  
 * Actually This program finds minimum number of shift requires to change
 * original numerical sorted array to modified array .
 *
 * Assumption - One person can bribe maximum 2 person in queue 
 * Input Format

  The first line contains an integer , the number of test cases.

  Each of the next  pairs of lines are as follows: 
   - The first line contains an integer , the number of people in the queue 
   - The second line has  space-separated integers describing the final state of the queue.
 
  Output Format

     Print an integer denoting the minimum number of bribes needed to get the queue into 
     its final state.
     Print Too chaotic if the state is invalid, i.e. it requires a person to have bribed more 
     than  people.
 
 * 
 * @author Mihir
 *
 */
public class MinimumBribesInArray {

    // Complete the minimumBribes function below.
	 // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
       int bribe=0;  
       /*  int[] orgArray= new int[q.length];
      for(int i=0;i<=q.length-1;i++){
    	   orgArray[i]=i;
       }
       */
       for(int i = q.length;i>0;i--){
    	   for(int j=q.length-1;j>=0;j--){
    		   if(i==q[j]){
    			   int diff = i-1-j;
    			   if(diff>0){
    				   if(diff>2){
    					   System.out.println("Too chaotic");  
    					   return;
    				   }else{
    					   bribe+=diff;
    				   }
    			   }else{
    				   break;
    			   }

    		   }
    	   }
       }
      /* for(int p=q.length-1;p>0;p--){
          int num= q[p];
          int originalPosition=num-1;
          if(Math.abs(originalPosition-p )>2){
              System.out.println("Too chaotic");
              return;
          }
          
          if(originalPosition>p){
            bribe+=Math.abs(originalPosition-p);
          }
       } */
     System.out.println(bribe);
  }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}