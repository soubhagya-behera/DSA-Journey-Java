package Recursion;

import java.util.Scanner;

public class Sum_of_N_ByFunctional {

    static int sum(int n) {
        if (n == 0)
            return 0;

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n: ");
        int n = sc.nextInt();

        System.out.println(sum(n));

        sc.close();
    }
}