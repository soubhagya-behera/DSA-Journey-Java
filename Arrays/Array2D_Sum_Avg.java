package Arrays;
import java.util.*;

public class Array2D_Sum_Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Declare and create 2D array
        int[][] arr = new int[rows][columns];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print array
        System.out.println("The array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        long sum = Sum(arr);
        double avg = Avg(arr);

        System.out.println("Your sum is " + sum + " and average is " + avg);

        sc.close();
    }

    public static long Sum(int[][] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double Avg(int[][] arr) {
        long sum = 0;
        int count = 0;

        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                sum += arr[i][j];
                count++;
                j++;
            }
            i++;
        }
        return (double) sum / count;
    }
}
