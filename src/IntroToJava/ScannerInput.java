package IntroToJava;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
