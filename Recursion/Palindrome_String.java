package Recursion;

import java.util.Scanner;

public class Palindrome_String {

    static boolean palindrome(int i, String s) {

        if(i >= s.length() / 2) {
            return true;
        }

        if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        return palindrome(i + 1, s);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        boolean ans = palindrome(0, s);

        System.out.println(ans);

        sc.close();
    }
}