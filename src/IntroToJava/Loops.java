package IntroToJava;

import java.util.Scanner;

public class Loops  {
    public static void main(String[] args) {
        //for(initialisation; condition; updation){
            //do something
        //}

        System.out.println("\nFor loop");
        for(int i = 0; i < 11; i++){
            System.out.println(i);
        }

        int i = 0;
        System.out.println("\nWhile loop");
        while(i < 11){
            System.out.println(i);
            i++;
        }

        System.out.println("\nDo-While loop");
        i=0;
        do{
            System.out.println(i);
            i++;
        } while(i<11);

        //Diff b/w while and do-while
        i = 12;
        while(i < 11){
            //This won't print
            System.out.println("Apna College");
        }

        do{
            //This prints once
            System.out.println("Apna University");
        } while(i<11);

        //Sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter number");
        int n = sc.nextInt();
        int sum = 0;
        for(i = 0; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum of numbers till " + n + " is: " + sum);

        //Print table of number input by user
        System.out.println("\nEnter number");
        int j = sc.nextInt();
        for(i = 1; i < 11; i++){
            System.out.println(j*i);
        }
    }
}
