import java.util.Scanner;

public class Odd_or_Even {
    public static void Check(int[] array){
        int count_Even = 0;
        for(int i = 0; i < array.length ; i++){
            if(array[i] % 2 == 0){
                count_Even++;
            }
        }
        System.out.println("Number of Odd Elements : " + (array.length - count_Even));
        System.out.println("Number of Even Elements : " + count_Even);
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
        Check(arr);       
        sc.close();
    }    
}
