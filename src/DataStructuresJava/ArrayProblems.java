package DataStructuresJava;

import java.util.Scanner;

public class ArrayProblems {

    public static void main(String[] args) {

        //Q1
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < min) {
//                min = numbers[i];
//            } else if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//        System.out.println("Min = " + min);
//        System.out.println("Max = " + max);
//
        //Q2
//        Boolean isAscending = true;
//        for (int i = 0; i < numbers.length-1; i++) {
//            if(numbers[i] > numbers[i+1]) {
//                isAscending = false;
//            }
//        }
//        System.out.println(isAscending ? "Ascending" :"Not Ascending");

        //Q3
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the finding value: ");
        int x = sc1.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("Number " + x + " is at: " + i);
                return;
            }
        }
        System.out.println("Invalid value to find");

    }
}
