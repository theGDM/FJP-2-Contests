// 1.You are given a base b.
// 2.You are given two numbers n1 and n2 of base b.
// 3.You are required to multiply n1 and n2 and print the value.

// Input Format
// A base b
// A number n1
// A number n2

// Constraints
// 2 <= b <= 10
// 0 <= n1 <= 10000
// 0 <= n2 <= 10000

// Output Format
// A number of base b equal in value to n2 * n1.

// Sample Input 0
// 5
// 1220
// 31

// Sample Output 0
// 43320

import java.io.*;
import java.util.*;

public class AnyBaseMultiplication {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int mul2=1;
        int finalRes = 0;
        while(n2!=0){
            int temp = n1;
            int rn2 = n2%10;
            int carry = 0;
            int mul1 = 1;
            int res = 0;
            while(temp!=0 || carry!=0){
                int rtemp = temp%10;
                int rem = (rtemp*rn2 + carry)%b;
                carry = (rtemp*rn2 + carry)/b;
                res =res + rem*mul1;
                mul1*=10;
                temp/=10;
            }
            finalRes=anyBaseSum(finalRes,res*mul2,b);
            mul2*=10;
            n2/=10;
        }
        System.out.println(finalRes);
        scn.close();
    }
    
    public static int anyBaseSum(int n1,int n2,int b){
        int res = 0;
        int carry =0;
        int rem;
        int mul = 1;
        while(n1!=0 || n2!=0 || carry!=0){
            int rn1=n1%10;
            int rn2=n2%10;
            rem = (carry+rn1+rn2)%b;
            carry = (carry+rn1+rn2)/b;
            res = res + rem*mul;
            mul*=10;
            n1/=10;
            n2/=10;
        }
        return res;
    }
}