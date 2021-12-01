//Do run the code in the hackerrank ide if it is terminating without taking input

// A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in 
//the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.
// The string contains all letters in the English alphabet, so return pangram.

// Function Description
// Complete the function pangrams in the editor below. It should return the string pangram if the input string is a pangram.
//Otherwise, it should return not pangram.

// pangrams has the following parameter(s):
// string s: a string to test
// Returns
// string: either pangram or not pangram

// Input Format
// A single line with string .


// Sample Input
//We promptly judged antique ivory buckles for the next prize

// Sample Input 0
//pangram

// Sample Explanation 0
// All of the letters of the alphabet are present in the string.

// Sample Input 1
// We promptly judged antique ivory buckles for the prize

// Sample Output 1
// not pangram

// Sample Explanation 0
// The string lacks an x.

import java.util.*;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        
        //This alphabet array will store the total ocuurence of every characters present
        //in the string s.
        int[] alphabet = new int[26];

        //here 0 index corresponds to character 'a'/'A', and 1 corresonds to character
        //'b'/'B', similarily 25 corresponds to character 'z'/'Z'.
        
        for (int i = 0; i < s.length(); ++i) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                int data = s.charAt(i) - 'A';
                ++alphabet[data];
            } else if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                int data = s.charAt(i) - 'a';
                ++alphabet[data];
            }

        }
        
        //Checking if there is any 0 entry in alphabet array, and if that means that
        //character didn't appear in given string
        for (int i = 0; i < alphabet.length; ++i) {
            if (alphabet[i] == 0) {
                return "not pangram";
            }
        } 
        return "pangram";
    }

}

public class Pangrams {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String res = Result.pangrams(s);
        System.out.println(res);
        scn.close();
    }
}
