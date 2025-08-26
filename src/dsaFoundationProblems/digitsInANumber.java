package dsaFoundationProblems;

import java.util.Scanner;

public class digitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }

    public static int count(int n){

        int count = 0;
        while(n >= 1){
            n = n / 10;
            count++;
        }
        return count;
    }

}

