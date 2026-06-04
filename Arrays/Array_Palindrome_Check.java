package Arrays;
import java.util.*;

public class Array_Palindrome_Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the no. of elements of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isPali = isPalindrome(arr, n);
        if(isPali) {
            System.out.println("Array is Palindrome");
        }
        else {
            System.out.println("Array is not Palindrome");
        }
    }

    public static boolean isPalindrome(int[] arr, int num){
        int i =0;

        while (i < arr.length/2) {
            if (arr[i] != arr[arr.length - 1 - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}