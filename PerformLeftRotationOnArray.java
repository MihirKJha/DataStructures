package mj.programs.datastructureProblems;

import java.util.Scanner;

public class PerformLeftRotationOnArray {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scan.nextLine().split(" ");

        int n = Integer.parseInt(nd[0].trim());

        int d = Integer.parseInt(nd[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }
        PerformLeftRotationOnArray obj = new PerformLeftRotationOnArray();
        obj.applyLeftRotations(a,d);
        
    }
    
    public void applyLeftRotations(int[] arr,int num){
    	int temp;
    	int[] rotedArray =new int[arr.length];
    	for(int i=0;i<arr.length;i++){
    		int diffOfPos = i-num;
    		if(diffOfPos<0){
    		    rotedArray[rotedArray.length + diffOfPos]=arr[i];
    	    }else{
    	    	rotedArray[diffOfPos]=arr[i];
    	    }
    	
    }
    
    //Arrays.asList(rotedArray).forEach(i-> System.out.println(i+" "));
    	for(int i:rotedArray){
    		System.out.print(i+" ");
    	}
  }
}
