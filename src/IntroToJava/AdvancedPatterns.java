package IntroToJava;

public class AdvancedPatterns {
    public static void main(String[] args) {
        //Q1. Butterfly pattern, n = 4
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        //Q2. Print a solid rhombus, n = 5
        n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        /*
        Q3. Print this pattern
          1
         2 2
        3 3 3
       4 4 4 4
      5 5 5 5 5
         */
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //numbers
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }

        /*
        Q3. Palindromic pattern, n=5
             1
            212
           32123
          4321234
         543212345
         */

        System.out.println();
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //numbers
            //can also use for loop for this
            int j= i;
            while(j > 0){
                System.out.print(j);
                j--;
            }
            j = 2;
            while(j <= i){
                System.out.print(j);
                j++;
            }
            System.out.println();
        }

        System.out.println();

        /*
        Q4. Diamond Pattern
           *
          ***
         *****
        *******
        *******
         *****
          ***
           *
         */
        n=4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }


            System.out.println();
        }
    }



}
