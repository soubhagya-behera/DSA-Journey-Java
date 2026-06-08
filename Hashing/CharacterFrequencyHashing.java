package Hashing;

import java.util.Scanner;

public class CharacterFrequencyHashing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter String: ");
        String s = sc.next();

        // Frequency array for lowercase letters (a-z)
        int[] hash = new int[26];

        // Pre-compute frequencies
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        // Number of queries
        System.out.print("Enter Number of Queries: ");
        int q = sc.nextInt();

        System.out.println("Enter Characters:");

        // Process queries
        while (q-- > 0) {
            char searchCharacter = sc.next().charAt(0);

            System.out.println(
                    "Frequency of '" + searchCharacter + "' = "
                            + hash[searchCharacter - 'a']
            );
        }

        sc.close();
    }
}