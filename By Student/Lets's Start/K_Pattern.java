// You are given a number n. You've to create a pattern of * and separated by a space " " as shown in sample case.

// Input Format
// A Single line of input, one integers n

// Constraints
// 1 <= n <= 10

// Output Format
// For each n print a desired pattern

// Sample Input 0
// 5

// Sample Output 0
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

import java.util.*;

public class K_Pattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //upper half
        for(int i = 1;i <= n;++i){
            for(int j=1;j<=n-(i-1);++j){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //lower half
        for(int i = 1;i <= n-1;++i){
            for(int j=1;j<=i+1;++j){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}