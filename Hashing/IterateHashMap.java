package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IterateHashMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Pre-compute frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Iterate through the HashMap
        System.out.println("\nKey -> Frequency");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Queries
        System.out.print("\nEnter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {

            System.out.print("Enter number to search: ");
            int number = sc.nextInt();

            System.out.println("Frequency = " + map.getOrDefault(number, 0));
        }

        sc.close();
    }
}