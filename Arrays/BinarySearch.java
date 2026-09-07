import java.util.*;
class B_search{
    public static int Find_Element(int[] array , int target){
        int start = 0 ; int end = array.length;
        while(start <= end){
            int mid = (start + end)/2;
            if(array[mid] == target){
                return mid;
            }else if(array[mid] < target){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}

public class BinarySearch{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("SIze of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++){
            System.out.println("Enter element " + (i+1) + " :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element : ");
        int target = sc.nextInt();

        int returned = B_search.Find_Element(arr, target);

        if(returned == -1){
            System.out.println("Entered element NOT present");
        }
        else{
            System.out.println("The element is at index " + returned);
        }

    }

}