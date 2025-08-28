package dsaFunctionsProblems;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nfact = fact(n);
        int nmrfact = fact(n-r);
        int npr = nfact/nmrfact;
        System.out.println(npr);
    }
    public static int fact(int n) {
        int rv = 1;
        for (int i = 1; i <= n; i++) {
            rv = rv * i;
        }
        return rv;
    }
}
