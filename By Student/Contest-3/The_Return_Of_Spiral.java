//Given a positive integer n, generate an n x n matrix filled with elements from 1 to n^2 in spiral order.
// These both 2d Array represention is same.

// [[1,2,3],[8,9,4],[7,6,5]]       =       1 2 3
//                                         8 9 4 
//                                         7 6 5

// Input Format
// Take an input interger n.

// Constraints
// 1 <= n <= 20

// Output Format
// Print the desired matrix through spiral.

// Sample Input 0
// 3

// Sample Output 0
// 1 2 3
// 8 9 4
// 7 6 5


import java.util.*;

public class The_Return_Of_Spiral{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int count = 0;
        
        //matrix declaration and initialisation
        int[][] mat = new int[n][n];
        
        int frow = 0,fcol = 0, lrow = n-1, lcol = n-1;
        while (count < n * n) {
            //top wall
            for (int i = fcol; i <= lcol; ++i) {
                if (count >= n * n) {
                    break;
                }
                mat[frow][i] = ++count;
            }
            ++frow;

            //right wall
            for (int j = frow; j <= lrow; ++j) {
                if (count >= n * n) {
                    break;
                }
                mat[j][lcol] = ++count;
            }
            --lcol;

            //bottom wall
            for (int k = lcol; k >= fcol; --k) {
                if (count >= n * n) {
                    break;
                }
                mat[lrow][k] = ++count;
            }
            --lrow;

            //right wall
            for (int l = lrow; l >= frow; --l) {
                if (count >= n * n) {
                    break;
                }
                mat[l][fcol] = ++count;
            }
            ++fcol;
        }
        
        //printing spiraled matrix
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}