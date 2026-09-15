import java.util.Scanner;

public class MaxSum_Subarray_1 {
public static void printSubarrays(int[] array){
    int Neginfinite = Integer.MIN_VALUE;
    int MaxSum = Neginfinite; 
        for(int i = 0; i< array.length ; i++){//start to be gradually shifted from 0 to last index
            int start = i;
        for(int j = i;j < array.length; j++){//end also shifted to the last but it keeps on making combinations with the start, like 0,0..0,1..0,2..
            int end = j;
        int Sum_SubArray = 0;//as the sum needs to be reset after adding elements for a subarray.
        for(int k = start ; k <= end;k++){
        Sum_SubArray += array[k];
        System.out.print(array[k] + " ");
        }
        if(Sum_SubArray > MaxSum){
            MaxSum = Sum_SubArray;            
        }
        System.out.println();
        }
        System.out.println();
        System.out.println();
        }
        System.out.print("Maximum sum of a subarray is : " + MaxSum);

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements of the array : ");
    for(int i = 0;i < n; i++){
        System.out.println("Enter element " + (i+1) );
        arr[i] = sc.nextInt();
    }
    System.out.println();
    printSubarrays(arr);
    sc.close();    
}
}
