// Input Format
// Integer representing r and c.
// Integer representing r*c numbers.

// Constraints
// N cannot be Negative.
// 0 <= r & c<= 10^9
// -10^9 <= Arr[i] <= 10^9

// Output Format
// print the output.
// Sample Input 0

// 5 5
// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25

// Sample Output 0
// 1 2 3 4 5 10 9 8 7 6 11 12 13 14 15 20 19 18 17 16 21 22 23 24 25
// 1 6 11 16 21 22 17 12 7 2 3 8 13 18 23 24 19 14 9 4 5 10 15 20 25

import java.util.*;
public class Wave_Print_2D_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        //matrix
        int[][] mat = new int[n][m];

        for (int i = 0; i < mat.length; ++i) {
            for (int j = 0; j < mat[0].length; ++j) {
                mat[i][j] = scn.nextInt();
            }
        }

        //Printing alternate coloumn wise
        for (int i = 0; i < mat.length; ++i) {
            if (i % 2 == 0) {
                for (int j = 0; j < mat[0].length; ++j) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int j = mat[0].length - 1; j >= 0; --j) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }

        System.out.println();

        //Printing alternate row wise
        for (int j = 0; j < mat[0].length; ++j) {
            if (j % 2 == 0) {
                for (int i = 0; i < mat.length; ++i) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int i = mat.length - 1; i >= 0; --i) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        
        scn.close();
    }
}
