// 1.Take as input String.
// Write a function that removes all consecutive duplicates and then print desired String.

// Example(To be used only for expected output):
// Input:
// aabbbccccccc

// output
// abc

import java.util.*;

public class Remove_Consecutive_Duplicates {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        //declaring empty StringBuilder
        StringBuilder res = new StringBuilder();
     
        res.append(str.charAt(0));
        for (int i = 1; i < str.length(); ++i) {
            //checking present character is not same with the previous character, if it is, then
            //we will append that character in our res StringBuilder
            if (str.charAt(i) != res.charAt(res.length() - 1)) {
                res.append(str.charAt(i));
            }
        }
        
        //converting StringBuilder back into String
        System.out.println(res.toString());
        scn.close();
    }
}