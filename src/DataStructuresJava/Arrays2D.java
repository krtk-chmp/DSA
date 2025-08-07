package DataStructuresJava;

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        // Memory consumption for 2D arrays = (rows * columns) * data type size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of the array: ");
        int rows = sc.nextInt();
        System.out.print("Enter the columns of the array: ");
        int cols = sc.nextInt();
        System.out.print("Enter the number you have to find: ");
        int number = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        //Rows
        for (int i = 0; i < rows; i++) {
            //Cols
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == number) {
                    System.out.print("(" + i + " " + j + ")");
                }
            }
        }

        System.out.println();

        System.out.println("The matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
