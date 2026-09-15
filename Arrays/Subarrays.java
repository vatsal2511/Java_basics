import java.util.*;
public class Subarrays{
    public static void printSubarrays(int[] array){
        for(int i = 0; i< array.length ; i++){//start to be gradually shifted from 0 to last index
            int start = i;
        for(int j = i;j < array.length; j++){//end also shifted to the last but it keeps on making combinations with the start, like 0,0..0,1..0,2..
            int end = j;
        for(int k = start ; k <=  end;k++){//printing all the elements of the array, that lies from start to end.
            System.out.print(array[k] + " ");
        }
        System.out.println();
        }
        System.out.println();
        System.out.println();
        }

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