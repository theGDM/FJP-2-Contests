// In this challenge, you will determine whether a string is funny or not. To determine whether a string is funny, create a 
//copy of the string in reverse e.g. abc -> cba. Iterating through each string, compare the absolute difference in the ascii 
//values of the characters at positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute differences is the same 
//for both strings, they are funny.

// Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.

// Example
// s = "lmnop"
// The ordinal values of the charcters are [108,109,110,111,112]. s(reverse) = "opnml"  and the ordinals are [112,111,110,109,108].
// The absolute differences of the adjacent elements for both strings are [1,1,1,1], so the answer is Funny.

// Function Description
// Complete the funnyString function in the editor below.

// funnyString has the following parameter(s):
// string s: a string to test
// Returns
// string: either Funny or Not Funny

// Input Format
// The first line contains an integer q, the number of queries.
// The next q lines each contain a string, s.

// Constraints
// 1 <= q <= 10
// 2 <= length of s <= 10000

// Sample Input
// STDIN   Function
// -----   --------
// 2       q = 2
// acxz    s = 'acxz'
// bcxz    s = 'bcxz'

// Sample Output
// Funny
// Not Funny

// Explanation
// Let r be the reverse of s.

// Test Case 0:

// s = "acxz", r = "zxca" 
// Corresponding ASCII values of characters of the strings:
// s = [97,99,120,122] and r = [122,120,99,97]
// For both the strings the adjacent difference list is [2, 21, 2].

// Test Case 1:

// s = "bcxz", r = "zxcb"
// Corresponding ASCII values of characters of the strings:
// s = [98,99,120,122] and r = [122,120,99,98]
// The difference list for string  is [1, 21, 2] and for string  is [2, 21, 1].


import java.util.*;

class Result {

    /*
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String funnyString(String s) {
        // Write your code here
        int[] arr1 = new int[s.length() - 1];
        
        int j = 0;
        for (int i = 0; i < s.length() - 1; ++i) {
            int diff = s.charAt(i) - s.charAt(i + 1);
            //if diff obtained between subtraction of ith character and (i+1)th character of 
            //the original string s is -ve we will make it positve and then assign to the jth 
            //index of arr1.
            arr1[j] = Math.abs(diff);
            ++j;
        }
        
        //reverse of the original string s, here we used SB instead of String in order to reduce
        //time complexity from o(n2) to o(n);
        StringBuilder r = new StringBuilder("");
        for (int i = s.length() - 1; i >= 0; --i) {
            r.append(s.charAt(i));
        }
        
        int[] arr2 = new int[r.length() - 1];
    
        j = 0;
        for (int i = 0; i < r.length() - 1; ++i) {
            //if diff obtained between subtraction of ith character and (i+1)th character of 
            //the reverse string r is -ve we will make it positve and then assign to the jth idx
            //of arr2.
            int diff = r.charAt(i) - r.charAt(i + 1);
            arr2[j] = Math.abs(diff);
            ++j;
        }
        
        for (int i = 0; i < arr1.length; ++i) {
            if (arr1[i] != arr2[i]) {
                return "Not Funny";
            }
        }
        return "Funny";
        
    }
}    


public class Funny_String {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int q = scn.nextInt();
        for (int i = 0; i < q; ++i) {
            String s = scn.next();
            String res = Result.funnyString(s);
            System.out.println(res);
        }
        scn.close();
    }
}
