package dsaFunctionsProblems;

import java.util.Scanner;

public class anyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base1 = sc.nextInt();
        int base2 = sc.nextInt();
        System.out.println(anyToAny(n, base1, base2));
    }

    public static int anyToAny(int n , int base1 , int base2) {
        int rv1 = 0;
        int rv2 = 0;
        int pow = 1;  // base^0
        while (n > 0) {
            int dig = n % 10;
            n /= 10;

            rv1 += dig * pow;
            pow *= base1;  // move to next power
        }

        if (base2 == 10){
            return rv1;
        }
        pow = 1;
        while (rv1 > 0) {
            int dig1 = rv1 % base2;
            rv1 /= base2;
            rv2 += dig1 * pow;
            pow *= 10;
        }

        return rv2;
    }
}
