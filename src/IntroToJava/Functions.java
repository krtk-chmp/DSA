package IntroToJava;

import java.util.Scanner;

public class Functions {
    /*
    public static - primary class
    function name - can't be java keyword and should summarise its operation
    arguments - define type, argument's name, could be different types
    func names - uses camelcase, first word in all small letters then additional word has first letter capital
     */
    public static void printMyName(String name) {
        System.out.println(name);
        return;  //Used to come out of the function
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        printMyName(name); //function call

//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        add(n1, n2);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = factorial(n);
        System.out.println("Factorial = "+fact);

    }

    /*
    Impact of functions on memory:
    - Funcs stored as stack in memory and one function in the stack is known as stack frame (one block) and it contains arguments
    - As soon as main function calls new function, new stack frame created and erased as soon as it gets executed and returns value
     */

    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
        return -1;
    }

    public static int factorial(int n) {

        int product = 1;

        if(n < 0){
            System.out.println("Negative number");
            return 0;
        } else if (n == 0){
            return 1;
        }

        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    /*
    DIFFERENCE BETWEEN FUNCTIONS AND METHODS
    - Functions are called directly
    - Methods are called through class objects
    - Mainly studied in OOP
     */
}
