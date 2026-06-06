package Arrays;

import java.util.Scanner;

public class Array2D_Number_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
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

        
        System.out.println("The array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Now Enter the number you want to search :");
        int n = sc.nextInt();


        boolean isFound = search(arr,n);
        if (isFound) {
            System.out.println("The number " + n + " is found");
        }
        else {
            System.out.println("The number is not found");
        }

    }

    public static boolean search(int[][] arr,int num) {
        int i = 0;
        while (i< arr.length) {
            int j = 0;
            while (j < arr[i].length){
                if (arr[i][j] == num) {
                    System.out.println("The number " + num + "is found in row " + i + " and column " + j);
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}

// Here we follow 0 based indexing