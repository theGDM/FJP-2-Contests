// Naruto opened a company which manufactures cars and bikes. Each car requires 4 tyres while each bike requires 2 tyres. Naruto has a total of N tyres (N is even). He wants to manufacture maximum number of cars from these tyres and then manufacture bikes from the remaining tyres.
// Naruto's friend Sasuke went to Naruto to purchase a bike. If Naruto's company has manufactured even a single bike then Naruto's friend will be able to purchase it.
// Determine whether he will be able to purchase the bike or not.

// Input Format
// The first line contains an integer T denoting the number of test cases. The T test cases then follow.
// The first line of each test case contains an integer N denoting the number of tyres.

// Constraints
// 1≤T≤100
// 2≤N≤1000
// N is even

// Output Format
// For each test case, output YES or NO depending on whether Naruto's friend will be able to purchase the bike or not. Output is case insensitive.

// Sample Input 0
// 3
// 8
// 2
// 6

// Sample Output 0
// NO
// YES
// YES

import java.util.*;

public class  NarutoAndHisBike{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for(int i=1;i<=T;++i){
            int N = scn.nextInt();
            int temp = N%4;
            if(temp == 0 || temp == 1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        scn.close();
    }
}