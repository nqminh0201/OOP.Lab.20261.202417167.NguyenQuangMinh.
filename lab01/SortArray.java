import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = keyboard.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = keyboard.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        double average = (double) sum / n;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        keyboard.close();
    }
}