package Recursion;

import java.util.Scanner;

public class BackTracking_Nto1 {
   static void f(int i, int n) {
    if(i > n){
        return;
    }
    f(i + 1, n);
    System.out.println(i);
 }   

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    f(1, n);
 }
}
