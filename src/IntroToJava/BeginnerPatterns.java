package IntroToJava;

public class BeginnerPatterns {
    public static void main(String[] args) {

/*
        Q1. Print solid rectangle with length = 5 and breadth = 4
        *****
        *****
        *****
        *****
 */
        int b = 4;
        int l = 5;
        for(int i = 1; i <= b; i++){ //HANDLES ROWS
            for(int j = 1; j <= l; j++){ //HANDLES COLUMNS
                System.out.print("*");
            }
            System.out.println();
        }

        /*

        Q2. Pattern:
        *****
        *   *
        *   *
        *****
        ROWS = 4
        COLUMNS = 5
        Either rows or columns have 1 or it's max value
        where all stars are printed.

         */
        System.out.println();

        for(int i = 1; i <= b; i++){
            for(int j = 1; j <= l; j++){
                if(i == 1 || j == 1 || i == b || j == l){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        /*
        Q3. Half Pyramid
        * - Row 1
        ** - Row 2
        *** - Row 3
        **** - Row 4
         */
        System.out.println();

        for(int i = 1; i <= b; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //Q4. Opposite of Half Pyramid (Upside Down)
        System.out.println();
        for(int i = 4; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Q5. Q3 but right aligned
        for(int i = 1; i <= b; i++){
            for(int j = 1; j <= b-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Q6. Half pyramid but with numbers
        b=5;
        for(int i = 1; i <= b; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        //Q7. Q4 but with numbers
        for(int i = 4; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        /*
        Q8. Print this
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
         */
        int n = 1;
        for (int i = 1; i <= b; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }

        /*
        Q9. Print this
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
         */

        System.out.println();

        for(int i = 1; i <= b; i++){
            for(int j = 1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
