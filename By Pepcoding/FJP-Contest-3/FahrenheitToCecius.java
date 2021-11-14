// Given a Temperature N in Fahrenheit scale convert it into Celsius scale .

// Take the following as input.
// 1. A number representing Fahrenheit: N

// let us assume Celsius is a float value.

// For Example:
// Input : 32
// Output : 0

// Input : -40
// Output : -40

// Explanantion :

// Formula for converting Fahrenheit scale to Celsius scale

//T(°C) = (T(°F) - 32) × 5/9

import java.util.*;

public class FahrenheitToCecius {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        float res = FToC(n);
        System.out.print(res);
        scn.close();
    }
    
    public static float FToC(float n){
        float res = (float)((n - 32)*5)/9;
        return res;
    }
}