// Take as input str, a string. We are concerned with all possible permutations of
//  characters in str. E.g. “abc” can produce following words “abc”, “acb”, “bac”,
//   “bca”, “cab”, “cba”

// a. Write a recursive function which returns the count of different permutations
//  for a given string(repetition not allowed). Print the value returned.

// b. Write a recursive function which prints all possible permutations for a
// given string in Laxicographical Order
// (repetition not allowed and void is the return type for function).

// Example(To be used only for expected output):
// Input:
// 213

// output
// 6
// 123
// 132
// 213
// 231
// 312
// 321

// Input Format
// String will be Input

// Constraints
// String may be large.

// Output Format
// print the output.

// Sample Input 0
// 213

// Sample Output 0
// 6
// 123
// 132
// 213
// 231
// 312
// 321

import java.util.*;

public class NonRepeatablePermutation {
    public static ArrayList<String> res = new ArrayList<String>();

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        String input = scn.next();

        // no of permutations
        int count = countPermutations(input.length());
        System.out.println(count);

        // gettinng arraylist of permutation
        printPermutations(input, "");

        // sorting the res al
        Collections.sort(res);

        // printing permutation in sorted order
        for (String str : res) {
            System.out.println(str);
        }

        scn.close();
    }

    public static int countPermutations(int n) {
        int fact = 1;
        for (int i = 1; i <= n; ++i) {
            fact = fact * i;
        }
        return fact;
    }

    public static void printPermutations(String input, String output) {
        if (input.length() == 0) {
            res.add(output);
            return;
        }

        for (int i = 0; i < input.length(); ++i) {
            String newInput = input.substring(0, i) + input.substring(i + 1);
            printPermutations(newInput, output + input.charAt(i));
        }
    }
}