package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HighestFrequencyElement {

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

        int maxFreq = 0;
        int element = 0;

        for (int key : map.keySet()) {

            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                element = key;
            }
        }

        System.out.println("Highest Frequency Element = " + element);
        System.out.println("Frequency = " + maxFreq);

        sc.close();
    }
}