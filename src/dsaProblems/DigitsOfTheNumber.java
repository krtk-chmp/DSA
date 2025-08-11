package dsaProblems;

import java.util.Scanner;

public class DigitsOfTheNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        digits(num);
    }
    public static void digits(int num) {
        int count = 0;
        int num1 = num;
        while(num1 >= 1){
            num1 /= 10;
            count++;
        }
        int[] digits = new int[count];

        for(int i = digits.length - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        for (int digit : digits) {
            System.out.println(digit);
        }
    }
}

