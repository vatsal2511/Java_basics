package Java_basics.Sorting;

import java.util.Scanner;

public class Selection_sort {
    
    public static void sort(int[] array) {
        // Run the outer loop n-1 times as we don't have to bother about the last element remaining for comparison as at last, it's already sitting at the right place as other's have arranged themselves 
        for (int i = 0; i < array.length - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++) {//starting from i+1 beacause the first element of the array is already taken to be minimum and we need to compare other remaining elements of the array with it.
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }
            // Swapping using the temp variable.
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    public static void Print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); 
    }


    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        sort(arr);
        
        System.out.println("Sorted array: ");
        Print(arr);
        
        sc.close();
    }    
}
