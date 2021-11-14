// Take as input
// 1. first number: n
// 2. second number: r

// Print n!, npr & ncr separated by lines.
// Input Format

// Integer representing n
// Integer representing r
// Constraints

// 1 <= n <= 10 ^ 9
// 1 <= r <= n


import java.io.*;
import java.util.*;

public class factFunction {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        //n!
        int nfact = fact(n);
        System.out.println(nfact);
        
        //npr
        int npr = fact(n)/fact(n-r);
        System.out.println(npr);
        
        //ncr
        int ncr = fact(n)/(fact(r)*fact(n-r));
        System.out.println(ncr);
        scn.close();
    }
    
    public static int fact(int n){
        int res = 1;
        for(int i = 1;i <= n;++i){
            res = res*i;
        }
        return res;
    }
}