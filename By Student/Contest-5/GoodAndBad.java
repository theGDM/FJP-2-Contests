// Lots of geeky customers visit our restaurant everyday. So, when asked to fill
// the feedback form, these customers represent the
// feedback using a binary string (i.e a string that contains only characters
// '0' and '1'.
// Now since we're not that great in deciphering binary strings, we decided the
// following criteria to classify the feedback as
// Good or Bad :
// If the string contains the substring "010" or "101", then the feedback is
// Good, else it is Bad. Note that, to be Good it is not necessary to have both
// of them as substring.
// So given some binary strings, we need to output whether according to the us,
// the strings are Good or Bad.

// Input Format
// The first line contains an integer T denoting the number of feedbacks. Each
// of the next T lines contains a string composed of
// only '0' and '1'.

// Constraints
// 1 ≤ T ≤ 100
// 1 ≤ |S| ≤ 10^5

// Output Format
// For every test case, print in a single line Good or Bad as per our method of
// classification.

// Sample Input 0
// 2
// 11111110
// 10101010101010

// Sample Output 0
// Bad
// Good

// Explanation 0
// Example case 1. The string doesn't contain 010 or 101 as substrings.
// Example case 2. The string contains both 010 and 101 as substrings.

import java.util.*;

public class GoodAndBad {

    public static String match(String str) {
        for (int st = 0; st < str.length(); ++st) {
            for (int en = st; en < str.length(); ++en) {
                String sub = str.substring(st, en + 1);

                if (sub.equals("101") || sub.equals("010")) {
                    return "Good";
                }
            }
        }
        return "Bad";
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 0; i < t; ++i) {
            String str = scn.next();
            System.out.println(match(str));
        }
        scn.close();
    }
}