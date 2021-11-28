// There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
// You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

// Input Format
// First line of each test case starts with an integer N denoting the size of the array gain. Next line of input contains N space separated integers, where the ith integer denotes the value gain[i].

// Constraints
// n == gain.length
// 1 <= n <= 100
// -100 <= gain[i] <= 100

// Output Format
// For each test case, print the resultant integer. Which is the highest peak.

// Sample Input 0
// 5
// -5 1 5 0 -7

// Sample Output 0
// 1

// Explanation 0
// The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

// Sample Input 1
// 7
// -4 -3 -2 -1 4 3 2

// Sample Output 1
// 0

// Explanation 1
// The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0

import java.util.*;

public class Peak_Point {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //gain array declaration and initialisation
        int[] gain = new int[n];
        
        //taking inputs
        for (int i = 0; i < gain.length; ++i) {
            gain[i] = scn.nextInt();
        }

        //Maintain 2 variables for curr value of altitude
        //and the maximum value for altitude till now.
        int currAlt = 0, maxAlt = 0;
        for (int i = 0; i < gain.length; ++i) {
            currAlt = currAlt + gain[i];
            maxAlt = Math.max(maxAlt, currAlt);
        }

        //output the maximum altitude
        System.out.println(maxAlt);
        scn.close();
    }
}

