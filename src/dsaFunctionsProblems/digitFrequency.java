package dsaFunctionsProblems;

import java.util.Scanner;

public class digitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(frequency(n, d));
    }
    public static int frequency(int n, int d) {
        int counter = 0;
        while(n != 0){
            int check = n%10;
            if(check == d){
                counter++;
            }
            n = n/10;
        }
        return counter;
    }
}
