// You will be given 2 integer numbers and their base respectively.
// 2. You will also be given an number representing destination base.
// 3. You have to add those numbers and give the result of addition in destination base.
// Input Format

// 1. A integer n1 and its base b1(integer).
// 2. A integer n2 and its base b2(integer).
// 3. Another integer D repersenting destination base.
// Constraints

// 0<= n1,n2 <= 10000;
// 0<b1,b2,d <= 10


import java.io.*;
import java.util.*;

public class AnyBaseToAnyBaseAddition {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int b1 = scn.nextInt();
        int n1d = anyBaseToDecimal(n1,b1);
        int n2 = scn.nextInt();
        int b2 = scn.nextInt();
        int n2d = anyBaseToDecimal(n2,b2);
        int tb = scn.nextInt();
        int res = 0;
        int mul = 1;
        int carry = 0;
        while(carry!=0 || n1d!=0 || n2d!=0){
            int rn1d = n1d%10;
            int rn2d = n2d%10;           
            int rem = (carry + rn1d + rn2d)%10;
            carry = (carry + rn1d + rn2d)/10;
            res = res + rem*mul;
            mul = mul*10;
            n1d = n1d/10;
            n2d = n2d/10;
        }
        
        int finalRes = decimalToAnyBase(res,tb);
        System.out.println(finalRes);
        scn.close();
    }
    
    public static int anyBaseToDecimal(int n, int b){
        int res = 0;
        int mul = 1;
        while(n!=0){
            int rem = n%10;
            n/=10;
            res = res + rem*mul;
            mul*=b; 
        }
        return res;
    }
    
    public static int decimalToAnyBase(int n, int db){
        int res = 0;
        int mul = 1;
        while(n!=0){
            int rem = n%db;
            n/=db;
            res = res + rem*mul;
            mul*=10; 
        }
        return res;
    }
}