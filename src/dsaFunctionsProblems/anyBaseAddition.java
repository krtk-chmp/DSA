package dsaFunctionsProblems;

import java.util.Scanner;

public class anyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int base = sc.nextInt();
        System.out.println(BaseAddition(n1, n2, base));
    }

    public static int BaseAddition(int n1, int n2, int base) {
        int rv = 0;
        int pow = 1;
        int carry = 0;

        while (n1 > 0 || n2 > 0 || carry > 0) {
            int dig1 = n1 % 10;
            int dig2 = n2 % 10;
            int addResult = dig1 + dig2+ carry;
            carry = addResult / base;
            rv += (addResult % base)*pow;
            pow *= 10;
            n1 /= 10;
            n2 /= 10;
        }
        return rv;
    }
}
