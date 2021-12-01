// Dothraki are planning an attack to usurp King Robert's throne. King Robert learns of this conspiracy from Raven and plans to 
//lock the single door through which the enemy can enter his kingdom .

// But, to lock the door he needs a key that is an anagram of a palindrome. He starts to go through his box of strings, 
//checking to see if they can be rearranged into a palindrome. Given a string, determine if it can be rearranged into a 
//palindrome. Return the string YES or NO.

// Example
// s = 'aabbccdd'
// One way this can be arranged into a palindrome is abcddcba. Return YES.

// Function Description
// Complete the gameOfThrones function below.
// gameOfThrones has the following parameter(s):
// string s: a string to analyze

// Returns
// string: either YES or NO

// Input Format
// A single line which contains .

// Constraints

// 1 <= |s| <= 10^5
// s contains only lowercase letters in the range ascii[a...z]

// Sample Input 0
// aaabbbb

// Sample Output 0
// YES

// Explanation 0
// A palindromic permutation of the given string is bbaaabb.

// Sample Input 1
// cdefghmnopqrstuvw

// Sample Output 1
// NO

// Explanation 1
// Palindromes longer than 1 character are made up of pairs of characters. There are none here.

// Sample Input 2
// cdcdcdcdeeeef

// Sample Output 2
// YES

import java.util.*;

class Result {

    /*
     * Complete the 'gameOfThrones' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String gameOfThrones(String s) {
    // Write your code here
        int[] arr = new int[26];
        for(int i = 0; i < s.length();++i){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                int data = s.charAt(i) - 97;
                ++arr[data];
            }
        }
        
        if(s.length()%2 == 0){
            int count = 0;
            for(int i = 0;i < arr.length;++i){
                if(arr[i]!=0 && arr[i]%2 != 0){
                    ++count;
                }
            }
            if(count == 0){
                return "YES";
            }else{
                return "NO";
            }
        }else{    
            int count = 0;
            for(int i = 0;i < arr.length;++i){
                if(arr[i]!=0 && arr[i]%2 != 0){
                    ++count;
                }
            }
            if(count == 1){
                return "YES";
            }else{
                return "NO";
            }
            
        }

    }

}

public class Game_Of_Thrones {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String res = Result.gameOfThrones(s);
        System.out.println(res);
        scn.close();
    }
}
