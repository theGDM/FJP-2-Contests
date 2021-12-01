//Do run the code in the hackerrank ide if it is terminating without taking input

// There is a collection of rocks where each rock has various minerals embeded in it. Each type of mineral is designated 
// by a lowercase letter in the range ascii[a - z]. There may be multiple occurrences of a mineral in a rock. A mineral is called a 
//gemstone if it occurs at least once in each of the rocks in the collection.
// Given a list of minerals embedded in each of the rocks, display the number of types of gemstones in the collection.

// Example
// arr['abc','abc','bc']

// The minerals b and c appear in each rock, so there are  gemstones.

// Function Description
// Complete the gemstones function in the editor below.
// gemstones has the following parameter(s):
// string arr[n]: an array of strings

// Returns
// int: the number of gemstones found

// Input Format
// The first line consists of an integer n, the size of arr.
// Each of the next n lines contains a string arr[i] where each letter represents an occurence of a mineral in the current rock.

// Constraints
// 1 <= n <= 100
// 1 <= | arr[i] | <= 100
// Each composition arr[i] consists of only lower-case Latin letters ('a'-'z').

// Sample Input
// STDIN       Function
// -----       --------
// 3           arr[] size n = 3
// abcdde      arr = ['abcdde', 'baccd', 'eeabg']
// baccd
// eeabg

// Sample Output
// 2

// Explanation
// Only  and  occur in every rock.

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static int gemstones(List<String> arr) {
    // Write your code here
    int[] alphabets = new int[26];
        //Loop on array of Strings(i.e List arr)
        for (int i = 0; i < arr.size(); ++i) {
            //temprary Alphabets array to store the total ocuurence of each characters of Strings
            int[] tempAlphabets = new int[26];
            //Loop on characters of String
            for (int j = 0; j < arr.get(i).length(); ++j) {
                char ch = arr.get(i).charAt(j);
                ++tempAlphabets[ch - 'a'];
            }
            
            //increamenting kth element of alphabets array only when the kth element of tempAlphabets 
            //array is greater thatn 0.
            for (int k = 0; k < tempAlphabets.length; ++k) {
                if (tempAlphabets[k] > 0) {
                    ++alphabets[k];
                }
            }
        }
        
        //if ith entry of alphabets array ocuur size of arr times, it means that character ocuured
        //in all the strings of arr List 
        int countGemStone = 0;
        for (int i = 0; i < alphabets.length; ++i) {
            if (alphabets[i] == arr.size()) {
                ++countGemStone;
            }
        } 
        
        return countGemStone;
    }

}

public class GemStones {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

