package DataStructuresJava;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//        String name = "Kartik";
//        String fullName = "Kartik Saraswat";
//        String sentence = "My name is Kartik";

        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.println("Your name is " + name);

        //Concatenation
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println("Your full name is " + fullName);

        //Length of a string
        System.out.println(fullName.length());

        //Printing every alphabet in a string (accessing the indexes)
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        //Comparing strings
        //Checks 3 conditions:
        //1 s1 > s2: +ve value
        //2 s1 < s2: -ve value
        //3 s1==s2: 0

        if(firstName.compareTo(lastName) == 0) {
            //if we use directly == instead of compareTo
            //Its not reliable
            System.out.println("Your first name is the last name");
        } else {
            System.out.println("Your full name is " + firstName + " " + lastName);
        }
    }
}
