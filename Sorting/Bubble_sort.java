package Java_basics.Sorting;

import java.util.Scanner;

public class Bubble_sort {
    public static void sort(int[] array){
    for(int i = 1; i <= array.length;i++){
        for(int j = 0; j < array.length - 1; j++){
            if(array[j] > array[j+1] ){
                int temp = array[j+1];
                array[j+1] = array[j];
                array[j] = temp;
            }
        }
    }
    for(int i = 0; i < array.length ; i++){
    System.out.print(array[i] + " ");
    }
}    
    public static void main(){//Taking array input and calling the function to bubble sort.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : " );
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        sc.close();
    }    
}
