package mj.programs.datastructureProblems;

import java.io.IOException;
import java.util.Scanner;

public class ArrayManipulations {
	//This will be the "difference array". 
	//The entry arr[i]=k indicates that arr[i] is
	// exactly k units larger than arr[i-1]
    /*
     * Complete the arrayManipulation function below.
     */
    static long arrayManipulation(int n, int[][] queries) {
        /*
         * Write your code here.
         */
   	   /* int a =0;int b=0;int k=0;int rslt=0;
    	
    	//Collections.fill(sampleList, 0);
    	List<Integer> sampleList = IntStream.of(new int[n])
                .boxed()
                .collect(Collectors.toList());

    	for(int i=0;i<queries.length;i++){
    		a=queries[i][0];
    		b=queries[i][1];
    		k=queries[i][2];
    		for(int m=a;m<=b;m++){
    			rslt=sampleList.get(m-1)+k;    			
    			sampleList.remove(m-1);
    			sampleList.add(m-1,rslt);
    		}
    	}
    	Comparator<Integer> comp= (o1,o2)->o1>o2?1:-1;
    	sampleList.sort(comp);
    	return sampleList.get(n-1);*/
    	
    /*	This will be the "difference array". 
    	The entry arr[i]=k indicates that arr[i] is exactly k units larger than arr[i-1]
    	
    	Instead of storing the actual values in the array,
    	you store the difference between the current element and the previous element.
    	So you add sum to a[p] showing that a[p] is greater than its previous element by sum. 
    	You subtract sum from a[q+1] to show that a[q+1] is less than a[q] by sum (since a[q] was 
    	the last element that was added to sum). By the end of all this, you have an array that shows 
    	the difference between every successive element. By adding all the positive differences,
    	you get the value of the maximum element
    	
    	Important points to note in this solution.

    	1)the first element of array a will always remain zero since 1<= a <=b <=n; 2

    	2)the second element of array a is the second element of the array after m operations.*/




    	long[] arr = new long[n];        
    	int lower;
    	int upper;
    	long sum;
    	long max=0;
    	long temp=0;
    	
    	for(int i=0;i<n;i++) arr[i]=0;

    	for(int i=0;i<queries.length;i++){
    	    lower=queries[i][0];
    	    upper=queries[i][1];
    	    sum=queries[i][2];
    	    arr[lower-1]+=sum;
    	    if(upper<n) arr[upper]-=sum; 
    	}
    	        
    	  	for(int i=0;i<n;i++){
    	    temp += arr[i];
    	    if(temp> max) max=temp;
    	}
    	return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[][] queries = new int[m][3];

        for (int queriesRowItr = 0; queriesRowItr < m; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println(result);

        
    }
}

