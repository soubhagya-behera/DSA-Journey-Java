package Hashing;

import java.util.Scanner;

public class Number_Frequency {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute

        int[] hash = new int[13];

        for(int i = 0; i<n; i++){
            hash[arr[i]]++;
        }


        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter the number to find the frequency: ");
            int number = sc.nextInt();

            //now fetch
            System.out.println("Frequency of " + number + " = " + hash[number]);
        }
    }
}