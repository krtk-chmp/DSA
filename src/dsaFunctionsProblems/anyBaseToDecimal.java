package dsaFunctionsProblems;

import java.util.Scanner;

public class anyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = sc.nextInt();
        System.out.println(anyToDec(n, base));
    }

    public static int anyToDec(int n , int base) {
        int rv1 = 0;
        int pow = 1;  // base^0
        while (n > 0) {
            int dig = n % 10;
            n /= 10;

            rv1 += dig * pow;
            pow *= base;  // move to next power
        }

        return rv1;
    }
}
