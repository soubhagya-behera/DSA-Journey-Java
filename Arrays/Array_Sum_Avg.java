package Arrays;
import java.util.Scanner;

public class Array_Sum_Avg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int avg=0;
        int i=0;

        System.out.print("Enter the size of elements :");
        int n = sc.nextInt();

        System.out.print("Enter the elements of array :");
        int arr[]= new int[n];

        while(i<n){
            arr[i]=sc.nextInt();
            sum = sum+arr[i];
            i++;
        }
        avg = sum/n;
        System.out.println("sum is : " +sum + "Average is " +avg);
    }
}