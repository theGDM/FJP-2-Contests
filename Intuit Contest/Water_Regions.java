// 1. Given n non-negative integers a1,a2,...,an.
// 2. Each represents a point at coordinate(i,ai).
// 3."n"vertical lines are drawn such that the two endpoints of the line i is at(i,ai)and(i,0).
// 4. Find two lines,which,together with the x-axis forms a region,such that the region contains the most water.
// Note:that you may not slant the container.

// Constraints
// 1. n==height.length 
// 2. 2<=n<=105 
// 3. 0<=height[i]<=104

// Format
// Input
// 1. Take'n',size of Array 
// 2. Take'n'different element for Array

// Output
// 1. Max water

// Example
// Sample Input
// 9 1 8 6 2 5 4 8 3 7

// Sample Output
// 49

import java.util.*;

public class Water_Regions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = scn.nextInt();
        }
        int maxA = maxWater(arr);
        System.out.println(maxA);
        scn.close();
    }

    public static int maxWater(int[] arr) {
        int maxWaterRegion = Integer.MIN_VALUE;
        for (int st = 0; st < arr.length - 1; ++st) {
            for (int en = st + 1; en < arr.length; ++en) {
                // int area = ((arr[st] + arr[en]) * (en - st)) / 2;
                // area of trapezium = 1/2(a + b)h
                int area = Math.min(arr[st], arr[en]) * (en - st);
                // Area of reactangle, formed with min of length of two lines, and distance
                // between them.
                if (area > maxWaterRegion) {
                    maxWaterRegion = area;
                }
            }
        }
        return maxWaterRegion;
    }
}
