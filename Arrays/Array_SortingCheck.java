package Arrays;

import java.util.*;;
public class Array_SortingCheck {
    public static void main(String[] args) {
        
        System.out.println("Welcome to array sorting check post\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isInc = isIncreasing(arr, n);
        boolean isDec = isDecreasing(arr, n);

        if (isInc || isDec) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

        public static boolean isIncreasing(int[] arr,int num){
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
            return true;
        }

        public static boolean isDecreasing(int[] arr, int num){
        for(int i=1; i<num; i++){
            if(arr[i] > arr[i-1]){
                return false;
            }
        }
            return true;
        }
    }
