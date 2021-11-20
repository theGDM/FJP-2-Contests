// Impressed by the power of this number, Naruto has begun to look for occurrences of four anywhere. He has a list of T integers, 
//for each of them he wants to calculate the number of occurrences of the digit 4 in the decimal representation. He is too busy 
//now, so please help him.

// Input Format
// The first line of input consists of a single integer T, denoting the number of integers in Naruto's list.
// Then, there are T lines, each of them contain a single integer from the list.

// Constraints
// 1 ≤ T ≤ 105
// (Subtask 1): 0 ≤ Numbers from the list ≤ 9 - 33 points.
// (Subtask 2): 0 ≤ Numbers from the list ≤ 109 - 67 points.

// Output Format
// Output T lines. Each of these lines should contain the number of occurences of the digit 4 in the respective integer from 
// Naruto's list.

// Sample Input 0
// 5
// 447474
// 228
// 6664
// 40
// 81

// Sample Output 0
// 4
// 0
// 1
// 1
// 0

import java.util.*;

public class Never_Squad {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 1; i <= t; ++i) {
            int n = scn.nextInt();
            int count = 0;
            while (n != 0) {
                if (n % 10 == 4) {
                    ++count;
                }
                n = n / 10;
            }
            System.out.println(count);
        }
        scn.close();
    }
}