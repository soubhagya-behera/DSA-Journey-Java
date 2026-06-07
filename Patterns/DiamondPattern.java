package Patterns;
import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Upper Pyramid
        for(int i = 1; i <= n; i++) {

            // Spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Inverted Pyramid
        for(int i = n - 1; i >= 1; i--) {

            // Spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}