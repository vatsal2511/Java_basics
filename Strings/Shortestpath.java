package Java_basics.Strings;
import java.util.Scanner;

public class Shortestpath {
    public static double Shortestdistance(String direction ){
        int x = 0;
        int y = 0;
        for(int i=0;i < direction.length();i++){
        switch(direction.charAt(i)){//direction.chatAt(i) to compare every single character to the 4 cases.
            case 'N' -> y++;
            case 'S' -> y--;
            case 'E' -> x++;
            case 'W' -> x--;
        };
    }
    return Math.sqrt(x * x + y * y);
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Direction : ");
        String dir = sc.nextLine();
        double displacement = Shortestdistance(dir);
        System.out.println("Shortest Path is : " + displacement);
        sc.close();
    }

}
