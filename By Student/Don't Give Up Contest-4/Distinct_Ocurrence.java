// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

// Input Format
// First line of each test case takes an integer n, size of an array.
// Second line of each test case receives an array arr.

// Constraints
// 1 <= arr.length <= 1000
// -1000 <= arr[i] <= 1000

// Output Format
// Return true or false acc. to desired output.

// Sample Input 0
// 6
// 1 2 2 1 1 3

// Sample Output 0
// true

// Explanation 0
// The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

// Sample Input 1
// 2
// 1 2

// Sample Output 1
// false

// Sample Input 2
// 10
// -3,0,1,-3,1,1,1,-3,10,0

// Sample Output 2
// true

import java.util.*;

public class Distinct_Ocurrence {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        //getting elements in array
        for(int i = 0;i < n;++i){
            arr[i] = scn.nextInt();
        }
        
        //finding maximum and minimum value
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n;++i){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        int lengthIdx = 0;
        
        if (min < 0) {
            lengthIdx = max + Math.abs(min) + 1;//length of idx array if arr contains -ve entry
        } else {
            lengthIdx = max + 1;// length of idx array if arr does not contain any -ve entry
        }
        
        //creating new array idx, which will store the no. of frequency of each characters
        int[] idx = new int[lengthIdx];
        
        //logic for frequency count
        for (int i = 0; i < arr.length; ++i) {
            int j = arr[i];
            if (min < 0) {
                ++idx[j + Math.abs(min)];
            } else {
                ++idx[j];
            }
        }
        
        //we can check out the elements of idx array
        // for(int i = 0; i < idx.length;++i){
        //     System.out.print(idx[i] + " ");
        // }
        
        //now checking if the idx has any entry which, is repeated or not
        for(int i = 0;i < idx.length;++i){
            for(int j = i+1;j < idx.length;++j){
                if(idx[i] == 0){
                    break;
                }else if(idx[i] == idx[j]){
                    System.out.println("false");
                    scn.close();
                    return;
                }
            }
        }
        System.out.println("true");
        scn.close();
    }
}