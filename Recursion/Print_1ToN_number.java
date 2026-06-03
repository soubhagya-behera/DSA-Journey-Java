package Recursion;

import java.util.Scanner;

public class Print_1ToN_number {
    static void f(int i, int n) {
        if(i > n) {
            return;
        }
        System.out.println(i);
    f(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:  ");
        int n = sc.nextInt();
        f(1, n);
    }
}


