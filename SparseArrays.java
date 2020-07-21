package mj.programs.datastructureProblems;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SparseArrays {

    /*
     * Complete the findSuffix function below.
     */
    static long findSuffix(String[] collections, String queryString) {
        /*
         * Write your code here.
         */
    	return Arrays.asList(collections)
    							.stream()
    							.filter(str->str.equals(queryString))
    							.count();
        }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        String[] strings = new String[stringsCount];

        for (int stringsItr = 0; stringsItr < stringsCount; stringsItr++) {
            String stringsItem = scanner.nextLine();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
            strings[stringsItr] = stringsItem;
        }

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int qItr = 0; qItr < q; qItr++) {
            String queryString = scanner.nextLine();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            long res = findSuffix(strings, queryString);
            System.out.println(res);
           /* bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();*/
        }

       // bufferedWriter.close();

        scanner.close();
    }
}
