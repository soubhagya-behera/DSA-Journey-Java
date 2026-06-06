package Arrays;
import java.util.Scanner;

public class Array2D_DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of rows :");
        int rows = sc.nextInt();

        System.out.println("Enter the no of columns :");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];

        System.out.println("Enter the elements of the array :");
        for (int i=0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The aray is :");
        for(int i=0; i< rows; i++){
            for(int j=0; j< columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        long sum = diagonalSum(arr);
        System.out.println("Sum of diagonal is : " + sum);

    }

    public static long diagonalSum(int[][] arr){
        long leftSum = sumOfLeftDiagonal(arr);
        long rightSum = sumOfRightDiagonal(arr);

        long sum = leftSum + rightSum;

        if(arr.length % 2 !=0){
            int ind = arr.length /2;
            sum -= arr[ind][ind];
        }
        return sum;
    }

   public static long sumOfLeftDiagonal(int[][] arr){
        long sum = 0;
        int i = 0;

        while(i < arr.length) {
            sum += arr[i][i];
            i++;
        }
        return sum;
    } 

    public static long sumOfRightDiagonal(int[][] arr){
        long sum = 0;
        int i = 0;
        while(i < arr.length) {
            int col = arr.length - 1 - i;
            sum += arr[i][col];
            i++;
        }
        return sum;
    } 
}
