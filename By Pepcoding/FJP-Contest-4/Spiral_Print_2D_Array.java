// 1.Take an input r, the size of row.
// 2.Take an input c, the size of column.
// 2.Take r*c more inputs and store that in an array.

// Write a function Spiral print it clock wise and then anti-clock wise

// Example(To be used only for expected output):
// Input:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// Output:
// 1 2 3 6 9 8 7 4 5
// 1 4 7 8 9 6 3 2 5

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
// 1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13
// 1 6 11 16 21 22 23 24 25 20 15 10 5 4 3 2 7 12 17 18 19 14 9 8 13

import java.util.*;
public class Spiral_Print_2D_Array {
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

        //Clockwise print
        clockwisePrint(mat);

        System.out.println();

        //Anti-Clockwise print
        antiClockwisePrint(mat);
        scn.close();
    }

    public static void clockwisePrint(int[][] mat) {
        int frow = 0, fcol = 0, lrow = mat.length - 1, lcol = mat[0].length - 1;
        int count = 0;

        while (true) {
            //top wall
            for (int i = fcol; i <= lcol; ++i) {
                System.out.print(mat[frow][i] + " ");
                ++count;
            }
            ++frow;
            if (count == (mat.length) * (mat[0].length)) {
                break;
            }

            //right wall
            for (int j = frow; j <= lrow; ++j) {
                System.out.print(mat[j][lcol] + " ");
                ++count;
            }
            --lcol;
            if (count == (mat.length) * (mat[0].length)) {
                break;
            }

            //bottom wall
            for (int k = lcol; k >= fcol; --k) {
                System.out.print(mat[lrow][k] + " ");
                ++count;
            }
            --lrow;
            if (count == (mat.length) * (mat[0].length)) {
                break;
            }

            for (int l = lrow; l >= frow; --l) {
                System.out.print(mat[l][fcol] + " ");
                ++count;
            }
            ++fcol;
            if (count == (mat.length) * (mat[0].length)) {
                break;
            }
        }
    }
    
    public static void antiClockwisePrint(int[][] mat) {
        int frow = 0, fcol = 0, lrow = mat.length - 1, lcol = mat[0].length - 1;
        int count = 0;

        while (true) {
            //left wall
            for (int i = frow; i <= lrow; ++i) {
                System.out.print(mat[i][fcol] + " ");
                ++count;
                if (count == (mat.length) * (mat[0].length)) {
                    return;
                }
            }
            ++fcol;

            //bottom wall
            for (int j = fcol; j <= lcol; ++j) {
                System.out.print(mat[lrow][j] + " ");
                ++count;
                if (count == (mat.length) * (mat[0].length)) {
                    return;
                }
            }
            --lrow;

            //left wall
            for(int k = lrow; k >= frow; --k) {
                System.out.print(mat[k][lcol] + " ");
                ++count;
                if (count == (mat.length) * (mat[0].length)) {
                    return;
                } 
            }
            --lcol;

            //top wall
            for (int l = lcol; l >= fcol; --l) {
                System.out.print(mat[frow][l] + " ");
                ++count;
                if (count == (mat.length) * (mat[0].length)) {
                    return;
                }
            }
            ++frow;
        }
    }
}

