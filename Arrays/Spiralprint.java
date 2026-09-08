import java.util.*;

public class Spiralprint {
    public static void spiral(int[][] array , int num_row , int num_col){
        int start_row = 0;
        int end_row_index = num_row - 1;
        int start_col = 0;
        int end_col_index = num_col - 1;
        
        while(start_row <= end_row_index && start_col <= end_col_index){
            for(int j = start_col; j <= end_col_index ; j++){  //upper elements of the 2D array rectangle
                System.out.print(array[start_row][j] + " ");
            }

            for(int i = start_row + 1; i <= end_row_index ; i++){  //right elements of the 2D array rectangle
                System.out.print(array[i][end_col_index] + " ");
            }

            if (start_row < end_row_index) {
                for(int j = end_col_index - 1; j >= start_col ; j--){  //downside elements of the 2D array rectangle
                    System.out.print(array[end_row_index][j] + " ");
                }
            }

            if (start_col < end_col_index) {
                for(int i = end_row_index - 1; i >= start_row + 1 ; i--){  //left elements of the 2D array rectangle
                    System.out.print(array[i][start_col] + " ");
                }
            }

            start_row++; //update starting row to 1..2..3.. as the spiral goes inside, the starting row increases by 1.
            start_col++; //update starting column to 1..2..3.. as the spiral goes inside, the starting column increases by 1.
            end_row_index--; //update ending row to n..n-1..n-2.. as the spiral goes inside, the ending row decreases by 1.
            end_col_index--; //update ending column to n..n-1..n-2.. as the spiral goes inside, the ending column decreases by 1.
            //basically the rectangle shrinks from every direction by 1 index.
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns : ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        for(int i =0; i < arr.length ; i++){
            for(int j = 0; j < arr[i].length;j++){
                System.out.println("Enter element of row "+ i + " and column " + j );
                arr[i][j] = sc.nextInt();
            }
        }
        spiral(arr, rows, columns);
        sc.close();
    }
}