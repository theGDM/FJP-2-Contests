// You are given a number n. You've to create a pattern of * and separated by a space " " as shown in sample case.

// Input Format
// A Single line of input, one integer n

// Constraints
// 3 <= n <= 10

// Output Format
// For each n print a desired pattern

// Sample Input 0
// 5

// Sample Output 0
//     *****
//    *   *
//   *   *
//  *   *
// *****

import java.io.*;
import java.util.*;

public class HollowRhombusStarPattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;++i){
            //for space decreasing
            for(int j=1;j<=n-i;++j){
                System.out.print(" ");
            }
            //single star
            for(int k=1;k<=1;++k){
                System.out.print("*");
            }
            //odd middle stars
            for(int l=1;l<=n-2;++l){
                if(i==1 || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //single start and newLine
            System.out.println("*");
            scn.close();
        }
    }
}