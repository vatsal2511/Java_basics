import java.util.Scanner;
public class Sum_Elements{
    public static void sumArray(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length ; i++){
            sum += array[i];
        }
        System.out.println("The sum of elements is : " + sum);
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
        sumArray(arr);
        sc.close();
    }
}