// Naruto has an array consisting of N+K−1 integers. The array contains only the first N positive odd numbers. 
//Each number appears exactly once, except for one number which appears exactly K times. The sum of integers in Naruto's array is equal to S.
// For example, for N=3, K=2, the possible arrays could be [1,1,3,5], [3,1,3,5], [5,3,5,1]. For N=1, K=3, there is only one possible array: [1,1,1].
// Naruto gives you three integers N, K and S and asks you to find the only element which appears K times in his array.
// It is guaranteed that for the given input, there exists a valid array consisting of N+K−1 elements with a sum exactly equal to S.

// Input Format
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first and only line of each test case contains three space-separated integers N,K,S.

// Constraints
// 1≤T≤1000
// 1≤N≤10^4
// 1≤S≤10^9
// 2≤K≤10^4

// Output Format
// For each test case, print a single line containing the integer which appeared K times in Naruto's array.

// Sample Input 0
// 3
// 3 2 14
// 5 4 28
// 2 3 10

// Sample Output 0
// 5
// 1
// 3

// Explanation 0
// Test case 1 : Naruto's array could be [5,3,5,1].
// Test case 2 : Naruto's array could be [1,1,1,1,3,5,7,9].
// Test case 3 : Naruto's array could be [3,1,3,3]
import java.util.*;

public class Repeating_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; ++i) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            int s = scn.nextInt();
            //as we know sum of first N +ve odd integers is N^2,so remaining sum would be S-N^2
            int remainingSum = s - n * n;
            //now the unknown repeating element should apper K-1 times more, as it has already appered one time
            int x = remainingSum / (k - 1);
            System.out.println(x);

        }
        scn.close();
    }
}