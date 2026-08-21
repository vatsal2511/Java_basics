import java.util.*;
public class Max {
    public static int max(int[] array){
        int max = array[0];

        for(int i = 1; i < array.length ; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements : " );
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int max = max(arr);
        System.out.println("The maximum Element in the array is : " + max);
        sc.close();
    }
}
    
