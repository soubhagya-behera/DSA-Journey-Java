package Patterns;
import java.util.Scanner;

public class P_SideTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //13
        int n = 5;
        int num =1;
 
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num = num+1;
            }
            System.out.println();
        }

        System.out.println();


        
        //14
        for (int i = 1; i<=n ; i++) {
        for(char ch= 'A'; ch <= 'A' + i; ch++) {
            System.out.print(ch + " ");
         }
         System.out.println();
        }  
        
        System.out.println();


        //15
        for(int i=1; i<=n; i++) {
            for(char ch = 'A'; ch <= 'A' + (n-i-1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        System.out.println();

        //17
        for(int i = 0; i<n; i++) {
            //space
            for(int j= 0; j< n-i-1; j++) {
                System.out.print(" ");
            }
            //characters
            char ch =  'A';
            int breakpoint = (2*i+1) / 2;

            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print(ch + " ");
                if(j <= breakpoint) {
                    ch++;
                }
                else {
                    ch--;
                }
            }
            //space
            for(int j= 0; j< n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
