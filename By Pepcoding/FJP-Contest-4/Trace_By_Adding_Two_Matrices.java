// 1.Take an input r, the size of row.
// 2.Take an input c, the size of column.
// 3.Take r*c more inputs and store that in an Matrix.
// 4.Take r*c more inputs and store that in an another Matrix.


// Consider two matrix ANXM, BNXM. Both matrix A and matrix B contains equal
// elements. The task is to find the trace of the matrix formed by addition of
// A and B. Trace of matrix PNXM is defined as
// P[0][0] + P[1][1] + P[2][2] +….. + P[min(n – 1, m – 1)][min(n – 1, m – 1)]
// i.e addition of main diagonal.

// Example(To be used only for expected output):

// Input:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// 1 4 7
// 2 5 8
// 3 6 9

// output
// 30

// Explanation:
//     1 2 3
// A = 4 5 6
//     7 8 9

//      1 4 7
// B =  2 5 8
//      3 6 9

//         2 6 10
// A + B = 6 10 14
//         10 14 18

// Trace = 2 + 10 + 18 = 30

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

// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// 1 4 7
// 2 5 8
// 3 6 9

// Sample Output 0
// 30

import java.util.*;

public class Trace_By_Adding_Two_Matrices {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        //1st matrix
        int[][] mat1 = new int[n][m];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                mat1[i][j] = scn.nextInt();
            }
        }

        //2nd matrix
        int[][] mat2 = new int[n][m];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                mat2[i][j] = scn.nextInt();
            }
        }

        int trace = addMatrixAndTrace(mat1, mat2);
        System.out.println(trace);
        scn.close();
    }

    public static int addMatrixAndTrace(int[][] mat1, int[][] mat2) {
        int[][] res = new int[mat1.length][mat1[0].length];

        //addition of mat1 and mat2
        for (int i = 0; i < mat1.length; ++i) {
            for (int j = 0; j < mat1[0].length; ++j) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        
        //trace find
        int trace = 0;
        for (int i = 0; i < mat1.length; ++i) {
            for (int j = 0; j < mat1[0].length; ++j) {
                if (i == j) {
                    trace = trace + res[i][j];
                }
            }
        }
        return trace;
    }
}