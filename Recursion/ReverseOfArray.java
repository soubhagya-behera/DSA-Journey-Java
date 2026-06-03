package Recursion;

import java.util.Scanner;

public class ReverseOfArray {
    static void reverse(int i, int[] arr, int n) {

        if(i > n/2) return;

        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverse(i+1, arr, n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(0, arr, n);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
