// 1.Take as input String.
// Write a function that print the character with maximum frequency. Note that the repeated characters need not be adjacent. But, it is guaranteed that all characters are lowercase english alphabets.
// Example(To be used only for expected output):

// Input:
// aabbbccccccc

// output
// c

// Input Format
// String representing S.

// Constraints
// Size of String may be large.

// Output Format
// print the output.

//brute_force_apparoch

import java.util.*;
public class Maximum_Freq_Char_Optimized{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        //This alphabet array will store the total ocuurence of every characters present
        //in the string s.
        int[] alphabets = new int[26];

        //here 0 index corresponds to character 'a'/'A', and 1 corresonds to character
        //'b'/'B', similarily 25 corresponds to character 'z'/'Z'.

        for (int i = 0; i < s.length(); ++i) {
            int data = s.charAt(i) - 'a';
            ++alphabets[data];
        }

        int maxFreq = Integer.MIN_VALUE;
        char ch = s.charAt(0);
        for (int i = 0; i < alphabets.length; ++i) {
            if (alphabets[i] > maxFreq) {
                maxFreq = alphabets[i];
                ch = (char)(i + 'a');
            }
        }
        
        System.out.println(ch);
        scn.close();

    }
}
