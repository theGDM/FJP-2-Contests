// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.

// Input Format
// First line of each test case starts with an integer N denoting the size of the array nums.
// Next line of input contains N space separated integers, where the ith integer denotes the value nums[i].

// Constraints
// 1 <= nums.length <= 100
// -1000 <= nums[i] <= 100
// Output Format

// For each test case, print the resultant array after moving all the zeros.
// Sample Input 0

// 5
// 0 1 0 3 12

// Sample Output 0
// 1 3 12 0 0

// Explanation 0
// Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]

// Sample Input 1
// 1
// 0

// Sample Output 1
// 0

import java.util.*;

public class Zero_Movement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        //size of array
        int n = scn.nextInt();
        
        //array initialisation and declaration
        int[] arr = new int[n];
        
        //taking inputs in the array
        for (int i = 0; i < n; ++i) {
            arr[i] = scn.nextInt();
        }
        
        //traverse the original array and put all the non-zero element in the same array
        //use another variable i to traverse the whole array
        int j = 0;
        for (int i = 0; i < n; ++i) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                ++j;
            }
        }

        //now update theremaining positions by 0
        while (j < n) {
            arr[j] = 0;
            ++j;
        }

        //output the final array
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        
        scn.close();
    }
}