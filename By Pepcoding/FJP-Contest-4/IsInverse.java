// 1.Take an input N, the size of array.
// 2.Take N more inputs and store that in an array.

// Write a function which returns true if the second array is inverse of first and
// false otherwise. Print the value returned.

// Example(To be used only for expected output):

// Input:
// 4
// 1 2 3 0
// 3 0 1 2

// Output:
// true

// Input Format
// Integer representing N
// Integer representing N numbers.

// Constraints
// N cannot be Negative.
// 0 <= N <= 10^9
// -10^9 <= Arr[i] <= 10^9

// Output Format
// print the boolean output.
// Sample Input 0

// 4
// 1 2 3 0
// 3 0 1 2

// Sample Output 0
// true

import java.util.*;

public class IsInverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //size of arrays
        int n = scn.nextInt();

        //1st array Declaration and Initialization
        int[] a = new int[n];

        for (int i = 0; i < a.length; ++i) {
            a[i] = scn.nextInt();
        }

        //2nd array Declaration and Initialization
        int[] b = new int[n];

        for (int i = 0; i < a.length; ++i) {
            b[i] = scn.nextInt();
        }

        boolean res = isArrayInverse(a, b);
        System.out.println(res);
        scn.close();

    }
    
    public static boolean isArrayInverse(int[] a, int[] b) {
        //Inverse array Declaration and Initialization
        int[] inv = new int[b.length];

        for (int i = 0; i < b.length; ++i) {
            int j = b[i];
            inv[j] = i;
        }

        for (int j = 0; j < b.length; ++j) {
            if (a[j] != inv[j]) {
                return false;
            }
        }
        return true;
    }
}
