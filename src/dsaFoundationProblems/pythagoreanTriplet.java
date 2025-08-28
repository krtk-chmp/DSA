package dsaFoundationProblems;

import java.util.Scanner;

public class pythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int a = in.nextInt();
        System.out.print("Enter the second side: ");
        int b = in.nextInt();
        System.out.print("Enter the third side: ");
        int c = in.nextInt();

        System.out.println(triplets(a, b, c));
    }
    public static boolean triplets(int a, int b, int c) {
        return (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a);
    }
}
