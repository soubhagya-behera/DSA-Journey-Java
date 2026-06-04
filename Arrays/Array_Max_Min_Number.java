package Arrays;
import java.util.Scanner;

public class Array_Max_Min_Number {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxVal = max(arr, n);
        int minVal = min(arr, n);

        System.out.println("Max of the array :" +maxVal);
        System.out.println("Min of the array :" +minVal);
    }

    public static int max(int[] arr, int num) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        int i = 1;
        while (i < arr.length) {
            if( max < arr[i]){
                max = arr[i];
            }
            i++;
        }
            return max;
    }
    public static int min(int[] arr, int num) {
        int min = arr[0];
        for(int i=1; i<num; i++){
            if (arr[i] <  min){
                min = arr[i];
            }
        }
            return min;
    }
}
