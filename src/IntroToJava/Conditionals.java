package IntroToJava;

import java.util.Scanner;

public class Conditionals {
    /*
    Topics covered:
            -if-else
            -else-if
            -break
            -switch
    */
    public static void main(String[] args) {

//        //IF-ELSE
//
//        //Age identifier
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }
//
//        //Odd or Even
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        if (number%2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
//
//        //ELSE-IF
//        //Comparator
        System.out.println("Enter your first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter your second number: ");
        int secondNumber = sc.nextInt();
        if (firstNumber == secondNumber) {
            System.out.println("Equal");
        } else if (firstNumber > secondNumber) {
            System.out.println("First is greater");
        } else {
            System.out.println("First is lesser");
        }

        //SWITCH & BREAK
        //To avoid using else if a million times, we use switch
        //It matches the cases and executes the LOC for that case
        //Break is used to get out of the switch
        //Default doesn't need break as it's at the last

        System.out.println("Enter your number (1, 2 or 3): ");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("bonjour");
                break;
            case 3:
                System.out.println("Namaste");
                break;
            default:
                System.out.println("Wrong button");
        }

    }

}
