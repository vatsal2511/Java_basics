import java.util.Scanner;
public class Reverse {
    public static void reverse(int[] array){
        System.out.print("{");
        for(int i = array.length - 1; i >= 0; i-- ){
            System.out.print(array[i]);
            if(i != 0){     //To stop " , " from printing after the last element.      
            System.out.print(" , ");
            }
        }
        System.out.println("}");
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
        reverse(arr);
        sc.close();
    }
}
