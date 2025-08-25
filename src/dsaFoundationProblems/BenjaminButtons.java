package dsaFoundationProblems;

import java.util.Scanner;

public class BenjaminButtons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of fluctuations: ");
        int n = sc.nextInt();
        for (int i = 1; i*i <= n; i++) {
            System.out.println(i * i);
        }
    }
}
