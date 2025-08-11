package dsaProblems;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in.nextInt();

        int inv = 0;
        int op = 1;

        while(num != 0){
            int od = num % 10;
            int id = op;
            int ip = od;
            //make change to inv using ip and id
            inv = inv + id * (int)Math.pow(10,ip-1);
            num /= 10;
            op++;

        }
        System.out.println(inv);
    }

}
