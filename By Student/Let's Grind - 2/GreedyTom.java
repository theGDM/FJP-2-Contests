// Tom is a little cat. But despite the fact he is still a kitten he already knows about the pretty things that coins are. He knows that for every coin he can get very tasty bone from his master. He believes that some day he will find a treasure and have loads of fishes.
// And finally he found something interesting. A wooden chest containing N coins! But as you should remember, Tom is just a little cat, and so he can't open it by himself. Actually, the only thing he can really do is meowing. He can use his barking to attract nearby people and seek their help. He can set the loudness of his meowing very precisely, and therefore you can assume that he can choose to call any number of people, from a minimum of 1, to a maximum of K.
// When people come and open the chest they divide all the coins between them in such a way that everyone will get the same amount of coins and this amount is maximal possible. If some coins are not used they will leave it on the ground and Tom will take them after they go away. Since Tom is clearly not a fool, he understands that his profit depends on the number of people he will call. While Tom works on his meowing, you have to find the maximum possible number of coins he can get.

// Input Format
// The first line of the input contains an integer T denoting the number of test cases. Each of next T lines contains 2 space-separated integers: N and K, for this test case.

// Constraints
// 1 ≤ T ≤ 50
// 1 ≤ N, K ≤ 105

// Output Format
// For each test case output one integer - the maximum possible number of coins Tom can get.

// Sample Input 0
// 2
// 5 2
// 11 3

// Sample Output 0
// 1
// 2

import java.util.*;

public class GreedyTom {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for(int i=1;i<=T;++i){
            int N =scn.nextInt();
            int K =scn.nextInt();
            int max = Integer.MIN_VALUE;
            int j = 1;
            while(j<=K){
                if(N%j > max){
                    max = N%j;
                }
                ++j;
            }
            System.out.println(max);
        }
        scn.close();
    }
}