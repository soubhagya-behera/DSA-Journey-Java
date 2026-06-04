package Arrays;
import java.util.Scanner;

public class Array_Delete_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the no. of elements of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        // Use correct indexing: i = 0 to n - 1
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to delete: ");
        int numToDelete = sc.nextInt();

        // Call the deleteNumber method and get the new array
        int[] newArr = deleteNumber(arr, numToDelete);

        // Print the updated array
        System.out.println("Array after deleting " + numToDelete + ":");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

        sc.close();
    }

    public static int[] deleteNumber(int[] arr, int numToDelete) {
        // Count how many elements are not equal to numToDelete
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != numToDelete) {
                count++;
            }
        }

        // Create new array of size count
        int[] newArr = new int[count];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != numToDelete) {
                newArr[j] = arr[i];
                j++;
            }
        }

        return newArr;
    }
}

