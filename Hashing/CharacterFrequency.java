package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("\nCharacter Frequencies:");

        for (char ch : map.keySet()) {
            System.out.println(ch + " = " + map.get(ch));
        }

        sc.close();
    }
}