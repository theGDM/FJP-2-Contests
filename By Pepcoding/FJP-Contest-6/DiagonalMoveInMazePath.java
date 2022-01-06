// Take as input N1 and N2,both numbers.N1 and N2 is the number of rows and columns on a rectangular board.

// Our player starts in top-left corner of the board and must reach bottom-right corner.In one move the player can move 1 step horizontally(right)or 1 step vertically(down)or 1 step diagonally(south-east).

// a.Write a recursive function which returns the count of different ways the player can travel across the board.Print the value returned.

// b.Write a recursive function which returns an ArrayList of moves for all valid paths across the board.Print the value returned.

// c.Write a recursive function which prints moves for all valid paths across the board(void is the return type for function).

// Example(To be used only for expected output):
// Input:
// 2 2 
// output
// 13
//[HHVV,HVHV,HVVH,HVD,HDV,VHHV,VHVH,VHD,VVHH,VDH,DHV,DVH,DD]
//HHVV HVHV HVVH HVD HDV VHHV VHVH VHD VVHH VDH DHV DVH DD 

// Input Format
// Integer Input

// Constraints
// 1<=n<=1000000000

// Output Format
// print the output.

// Sample Input 0
// 2 2 

// Sample Output 0
// 13
// [HHVV,HVHV,HVVH,HVD,HDV,VHHV,VHVH,VHD,VVHH,VDH,DHV,DVH,DD]
// HHVV HVHV HVVH HVD HDV VHHV VHVH VHD VVHH VDH DHV DVH DD

import java.util.*;

public class DiagonalMoveInMazePath {
    public static int count;

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int N1 = scn.nextInt();
        int N2 = scn.nextInt();
        count = 0;
        int rows = N1 + 1;
        int cols = N2 + 1;
        ArrayList<String> res = getMazePath(0, 0, rows - 1, cols - 1);
        System.out.println(count);
        System.out.println(res);
        printMazePath(0, 0, rows - 1, cols - 1, "");
        scn.close();
    }

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            ++count;
            return base;
        }

        if (sr > dr || sc > dc) {
            ArrayList<String> base = new ArrayList<String>();
            return base;
        }

        ArrayList<String> ans = new ArrayList<String>();

        // right moves(faith)
        ArrayList<String> rightPaths = getMazePath(sr, sc + 1, dr, dc);
        for (String str : rightPaths) {
            ans.add("H" + str);
        }

        // down moves(faith)
        ArrayList<String> downPaths = getMazePath(sr + 1, sc, dr, dc);
        for (String str : downPaths) {
            ans.add("V" + str);
        }

        // diagonal moves(faith)
        ArrayList<String> diagonalPaths = getMazePath(sr + 1, sc + 1, dr, dc);
        for (String str : diagonalPaths) {
            ans.add("D" + str);
        }

        return ans;
    }

    public static void printMazePath(int sr, int sc, int dr, int dc, String output) {
        if (sr == dr && sc == dc) {
            System.out.println(output);
            return;
        }

        if (sr > dr || sc > dc) {
            return;
        }

        printMazePath(sr, sc + 1, dr, dc, output + "H");
        printMazePath(sr + 1, sc, dr, dc, output + "V");
        printMazePath(sr + 1, sc + 1, dr, dc, output + "D");
    }

}