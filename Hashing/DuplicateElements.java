package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("\nDuplicate Elements:");

        for (int key : map.keySet()) {

            if (map.get(key) > 1) {
                System.out.println(key);
            }
        }

        sc.close();
    }
}