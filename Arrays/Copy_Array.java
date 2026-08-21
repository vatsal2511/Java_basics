import java.util.Scanner;

public class Copy_Array {
    public static void Copy(int[] array , int num){
        int[] copy_arr = new int[num];
        for(int i = 0;i < num ; i++ ){
        copy_arr[i] = array[i];
        }
        System.out.print("copy_arr[] = {");
        for(int i = 0;i < num ; i++ ){
        System.out.print(copy_arr[i]);
        if(i != num - 1){
            System.out.print(" , ");
        }
    }
    System.out.print("}");    
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
        Copy(arr,n);
        
        sc.close();
    }
}
