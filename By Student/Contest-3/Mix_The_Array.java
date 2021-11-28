// Given the array A consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
// Return the array in the form [x1,y1,x2,y2,...,xn,yn].

// Input Format
// First line of each test case starts with an integer N denoting the size of the array A.
// Next line of input contains 2n space separated integers, where the ith integer denotes the value Ai.

// Constraints
// 1 <= n <= 500
// A.length == 2n
// 1 <= A[i] <= 10^3

// Output Format
// For each test case, print the resultant array after mixing.

// Sample Input 0
// 3
// 2 5 1 3 4 7

// Sample Output 0
// 2 3 5 4 1 7

// Explanation 0
// Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

// Sample Input 1
// 4
// 1 2 3 4 4 3 2 1

// Sample Output 1
// 1 4 2 3 3 2 4 1

// Explanation 1
// Input: nums = [1,2,3,4,4,3,2,1], n = 4
// Output: [1,4,2,3,3,2,4,1]

// Sample Input 2
// 2
// 1 1 2 2

// Sample Output 2
// 1 2 1 2

// Explanation 2
// Input: nums = [1,1,2,2], n = 2
// Output: [1,2,1,2]

import java.util.*;

public class Mix_The_Array {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //array of size 2*n
        int[] arr = new int[2 * n];
        
        //taking inputs in array
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = scn.nextInt();
        }
        
        //call to alternate function
        int[] outputArr = alternate(arr);

        //resultant output matrix
        for (int j = 0; j < outputArr.length; ++j) {
            System.out.print(outputArr[j] + " ");
        }
        
        scn.close();
    }
    
    public static int[] alternate(int[] arr) {
        //temporary array
        int[] temp = new int[arr.length];
        
        int j = 0;
        int len = arr.length/2;
        for (int i = 0; i < len; ++i) {
            temp[j] = arr[i];
            ++j;
            temp[j] = arr[len + i];
            ++j;
        }
        return temp;
    }
}