import java.util.Scanner;

public class Linear_Search {
    public static int search(int[] array , int target_element){
        for(int i = 0; i < array.length ; i++){
            if(array[i] == target_element){
                return i;
            }
        }
        return -1;  //If any element never matched the target element, then after coming out of the for loop, -1 is returned and is jumped out of the loop at the very moment.
    //we chose to return -1 because for an array, the index can never be negative.
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements : " );
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element : ");
        int target = sc.nextInt();

        int result = search(arr , target);

        if(result == -1){
            System.out.println("The target element is not present in the array.");
        }
        else{
            System.out.println("The index value of the target element : " + result);
        }
               
        sc.close();
    } 
}
