// Take as input
// 1. A Number: n

// Write a recursive function to print the following pattern to print odd numbers
// in decreasing sequence (up until 0) and even numbers in
// increasing sequence

// Example(To be used only for expected output):

// Input:
// 6

// output
// 5
// 3
// 1
// 2
// 4
// 6

// Input Format
// Integer representing n

// Constraints
// -10^18 <= n <= 10 ^ 18

// Output Format
// print output.

// Sample Input 0
// 6

// Sample Output 0
// 5
// 3
// 1
// 2
// 4
// 6

import java.util.*;

public class PrintingOddAndEven {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printEvenOdd(n);
        scn.close();
    }

    public static void printEvenOdd(int n) {
        // base case
        if (n == 0) {
            return;
        }

        if (n % 2 == 1) {
            System.out.println(n);
        }

        printEvenOdd(n - 1);

        if (n % 2 == 0) {
            System.out.println(n);
        }
    }
}