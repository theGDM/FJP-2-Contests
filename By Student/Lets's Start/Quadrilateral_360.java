// You are given the sizes of angles of a simple quadrilateral (in degrees) A, B, C and D, in some order along its perimeter. 
//Determine whether the quadrilateral is cyclic.Note: A quadrilateral is cyclic if and only if the sum of opposite angles is 180∘.

// Input Format
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first and only line of each test case contains four space-separated integers A, B, C and D.

// Constraints
// 1≤T≤21
// 1≤A,B,C,D≤357
// A+B+C+D=360

// Output Format
// Print a single line containing the string "yes" if the given quadrilateral is cyclic or "no" if it is not (without quotes).

// Sample Input 0
// 3
// 10 20 30 300
// 10 20 170 160
// 179 1 179 1

// Sample Output 0
// no
// yes
// no

// Explanation 0
// Example case 1: The sum of two opposite angles A+C=10+30≠180.
// Example case 2: The sum of two opposite angles A+C=10+170=180 and B+D=20+160=180.
// Example case 3: The sum of two opposite angles B+D=1+1≠180.

 
import java.util.*;

public class Quadrilateral_360 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; ++i) {
            int A = scn.nextInt();
            int B = scn.nextInt();
            int C = scn.nextInt();
            int D = scn.nextInt();
            if (A + C == 180 && B + D == 180) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        scn.close();
    }
}