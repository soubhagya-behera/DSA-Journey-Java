package Recursion;

import java.util.Scanner;

public class Sum_of_N_ByParameterised {

    static void f(int i, int sum) {

        if (i < 1) {
            System.out.println(sum);
            return;
        }

        f(i - 1, sum + i);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the n: ");
        int n = sc.nextInt();

        f(n, 0);

        sc.close();
    }
}