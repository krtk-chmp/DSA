package dsaFunctionsProblems;

import java.util.Scanner;

public class decimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = sc.nextInt();
        System.out.println(decToAny(n, base));
    }

    public static int decToAny(int n , int base) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % base;
            n /= base;

            rv += dig * p;
            p = p * 10;
        }
        return rv;
    }
}
