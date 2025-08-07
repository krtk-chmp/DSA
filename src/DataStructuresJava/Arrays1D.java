package DataStructuresJava;

import java.util.Scanner;

public class Arrays1D {
    public static void main(String[] args) {
        int[] marks = new int[3]; //Occupies 12 bytes
        //int marks[] = new int[3]; declares the same array so it doesn't matter
        //int marks[] = {10, 20, 30};
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        System.out.println(marks); //Prints memory hash code
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int value = sc.nextInt();
        int[] numbers = new int[size];
//
//        for(int i = 0; i < size; i++){
//            System.out.println(numbers[i]); // Initialised to 0
//        }

        //Find a value in the array
        for(int i = 0; i <= size; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i = 0; i <= size; i++){
            if(numbers[i] == value){
                System.out.println(i);
            }
        }
    }
}
