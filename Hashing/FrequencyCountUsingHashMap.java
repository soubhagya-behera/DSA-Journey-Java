package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCountUsingHashMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Pre-compute frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {

            System.out.print("Enter number to search: ");
            int number = sc.nextInt();

            System.out.println("Frequency of " + number + " = "
                    + map.getOrDefault(number, 0));
        }

        sc.close();
    }
}