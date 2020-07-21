package mj.programs.datastructureProblems;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HourGlassMaxSum {

    /*
     * Complete the array2D function below.
     */
    static int array2D(int[][] arr) {
        /*
         * Write your code here.
         */
    	 List<Integer> arrLst= new ArrayList<Integer>();
    	 for(int i=0;i<4;i++){
         	for(int j=0;j<4;j++){
         		 arrLst.add(arr[i][j]+arr[i][j+1]+arr[i][j+2]+
         				arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
         	}
         }
         Collections.sort(arrLst);
         return arrLst.get(arrLst.size()-1);
       }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int arrRowItr = 0; arrRowItr < 6; arrRowItr++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int arrColumnItr = 0; arrColumnItr < 6; arrColumnItr++) {
                int arrItem = Integer.parseInt(arrRowItems[arrColumnItr].trim());
                arr[arrRowItr][arrColumnItr] = arrItem;
            }
        }

        int result = array2D(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

