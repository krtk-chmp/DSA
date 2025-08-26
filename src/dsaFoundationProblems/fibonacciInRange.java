package dsaFoundationProblems;

import java.util.Scanner;

public class fibonacciInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }
    public static int fibonacci(int n) {
        int fibSum;
        if(n < 0){
            System.out.println("n is negative");
            return 0;
        }
        if(n == 0 || n == 1){
            return n;
        } else {
            fibSum = fibonacci(n-1) + fibonacci(n-2);
        }
        return fibSum;
    }
}
