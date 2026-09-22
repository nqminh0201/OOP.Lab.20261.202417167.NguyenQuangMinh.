import java.util.Scanner;

public class AddMatrices {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = keyboard.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = keyboard.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] c = new int[rows][cols];

        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = keyboard.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        keyboard.close();
    }
}