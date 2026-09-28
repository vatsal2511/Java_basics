package Java_basics.Strings;
import java.util.*;
public class Pallindrome {
    public static boolean CheckPallindrome(String Word){
        for(int i = 0; i <= Word.length()/2 ; i++){
            if(Word.charAt(i) != Word.charAt((Word.length() - 1) - i)){
                return false;//Is not a pallindrome.
            }
        }
        return true;
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word to be checked : ");
        String Word = sc.next().toLowerCase();//Converted the inputted string to lower case..as Java is case
        if(CheckPallindrome(Word) == true){
            System.out.println("Is a Pallindrome.");
        }else{
            System.out.println("Is NOT a Pallindrome.");
        }
        sc.close();
    }
}
