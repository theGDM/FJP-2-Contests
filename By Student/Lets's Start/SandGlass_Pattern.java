// You are given a number n. You've to create a pattern of * and separated by a space " " as shown in sample case.

// Input Format
// A Single line of input, one integer n

// Constraints
// 1 <= n <= 10
// Also, n is odd.

// Output Format
// For each n print a desired pattern

// Sample Input 0
// 5

// Sample Output 0
// * * * * * 
//  * * * *
//   * * *
//    * *
//     *
//    * *
//   * * *
//  * * * *
// * * * * *

import java.util.*;

public class SandGlass_Pattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //upper half
        for(int i=1;i<=n;++i){
            for(int j=1;j<=i-1;++j){
                System.out.print(" ");
            }
            for(int k=1;k<=n-(i-1);++k){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //lower half
        for(int i=1;i<=(n-1);++i){
            for(int j=1;j<=(n-1)-i;++j){
                System.out.print(" ");
            }
            for(int k=1;k<=i+1;++k){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
       scn.close(); 
    }
}