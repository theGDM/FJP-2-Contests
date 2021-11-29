// Given a 2D matrix, print all elements of the given matrix in diagonal order. For example, 
//consider the following 5 X 4 input matrix.

// input:
// 5 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// 17 18 19 20
   
// output:
// 1
// 5 2
// 9 6 3
// 13 10 7 4
// 17 14 11 8
// 18 15 12
// 19 16
// 20

// Input Format
// first line of input is row and column
// second line contains row*column elements

// Constraints
// Integer Inout.

// Output Format
// display matrix

// Sample Input 0
// 5 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// 17 18 19 20

// Sample Output 0
// 1
// 5 2
// 9 6 3
// 13 10 7 4
// 17 14 11 8
// 18 15 12
// 19 16
// 20

import java.util.*;
public class Diagonal_Traversal_Of_Matrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        //matrix
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                mat[i][j] = scn.nextInt();
            }
        }

        digonalTraversal(mat);
        scn.close();
    }
    
    public static void digonalTraversal(int[][] mat){
        int rowLastIdx = mat.length - 1;
        int colLastIdx = mat[0].length - 1;
        for (int sum = 0; sum <= rowLastIdx + colLastIdx; ++sum) {
            int i = 0, j = 0;
            if (sum <= (rowLastIdx + colLastIdx) / 2) {
                j = 0;
                i = sum;
            } else {
                i = rowLastIdx;
                j = sum - i;
            }
            for (; i >= 0 && j <= colLastIdx; --i, ++j) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
