// Tom is a very lazy person. Whatever work is supposed to be finished in x units of time, he finishes it in m∗x units of time. 
//But there is always a limit to laziness, so he delays the work by at max d units of time. Given x,m,d, find the maximum time 
//taken by tom to complete the work.

// Input Format
// First line will contain T, number of testcases. Then the testcases follow.
// Each testcase contains a single line of input, three integers x,m,d

// Constraints
// 1≤T≤104
// 1≤x,m≤10
// 0≤d<100

// Output Format
// For each testcase, output in a single line answer to the problem.

// Sample Input 0
// 3
// 1 1 0
// 1 3 1
// 2 2 3

// Sample Output 0
// 1
// 2
// 4

// Explanation 0
// TestCase 1: Tom takes 1∗1=1 unit of time which is equal to the upper bound(1+0=1 unit) to do the work.
// TestCase 2: Tom takes min(1∗3,1+1)=min(3,2)=2 units of time to do the work.
// TestCase 3: Tom takes 2∗2=4 units of time which is less than the upper bound(2+3=5 units) to do the work.

import java.util.*;

public class Slow_Tom {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; ++i) {
            int x = scn.nextInt();
            int m = scn.nextInt();
            int d = scn.nextInt();
            int min = 0;
            if (x * m >= x + d) {
                min = x + d;
            } else {
                min = x * m;
            }
            System.out.println(min);
        }
        scn.close();
    }
}