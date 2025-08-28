package dsaFoundationProblems;

import java.util.Scanner;

public class primeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i = start; i <= end; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
