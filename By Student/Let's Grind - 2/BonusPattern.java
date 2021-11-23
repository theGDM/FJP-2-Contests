// Write a program that receives a number as input and prints it in the following format as shown in the sample case below.

// Input Format
// A Single line of input, one integers n

// Constraints
// 1 <= n <= 10

// Output Format
// For each n print a desired pattern

// Sample Input 0
// 3

// Sample Output 0
// 1*2*3*10*11*12
// --4*5*8*9
// ----6*7

import java.util.*;

public class BonusPattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = 1;
        int q = n * (n + 1);
        int u = q - n + 1;
        for (int i = 1; i <= n; ++i){
            //print -
            for (int j = 1; j <= 2 * (i - 1); ++j) {
                System.out.print("-");
            }
            for (int k = 1; k <= n - (i - 1); ++k) {
                System.out.print(p + "*");
                ++p;
            }
            int o = u;
            for (int l = 1; l <= n - (i - 1); ++l) {
                if (l == n - (i - 1)) {
                    System.out.print(o);
                } else {
                    System.out.print(o + "*");
                }
                ++o;
            }
            u = u - (n - i);
            System.out.println();
            scn.close();
        }
    }
}