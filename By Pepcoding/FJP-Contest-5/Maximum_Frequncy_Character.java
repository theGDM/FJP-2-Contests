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

public class Maximum_Frequncy_Character {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        int freq = 0;
        char ch = 'a';
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); ++i) {
            if (i!= 0 && str.charAt(i) != str.charAt(i - 1)) {
                int j = i - 1;
                freq = 0;
                while (j >= 0 && str.charAt(j) == str.charAt(i - 1)) {
                    ++freq;
                    --j;
                }
                if (freq > max) {
                    max = freq;
                    ch = str.charAt(i - 1);
                }
            } else if (i == str.length() - 1) {
                int j = i;
                freq = 0;
                while (j >= 0 && str.charAt(j) == str.charAt(i)) {
                    ++freq;
                    --j;
                }
                if (freq > max) {
                    max = freq;
                    ch = str.charAt(i);
                }
            }
        }
        System.out.println(ch);
        scn.close();
    }
}
