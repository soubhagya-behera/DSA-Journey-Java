package Fundamentals;
import java.util.*;

public class PalindromeOfString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        int left = 0;
        int right = s.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(isPalindrome);

    }
}