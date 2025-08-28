package IntroToJava;

import java.util.Scanner;

public class PracticeQuestions {
    public static void main(String[] args) {
        //Function which calculates GCD of two numbers
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter your second number: ");
//        int num2 = sc.nextInt();
//        int gcd = GCD(num1, num2);
//        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int GCD(int num1, int num2) {

        while (num2 > 0 && num1 > 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }

        if (num2 == 0){
            return num1;
        } else {
            return num2;
        }
    }

    public static int fibonacci(int n) {
        int sum;

            if(n<= 1){
                return n;
            }
            sum = fibonacci(n - 1) + fibonacci(n - 2);
            return sum;
    }
}
