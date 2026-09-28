package Java_basics.Strings;

import java.util.*;

public class Substring {
    public static String returnSubstring(String str , int si , int ei){
        String cutString = "";//Initialized with nothing..
        for(int i = si ; i < ei ; i++){
            cutString += str.charAt(i);
        }
        return cutString;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        System.out.println("Enter Starting and Ending Index : ");
        int si = sc.nextInt();
        int ei = sc.nextInt();
        String cutString = returnSubstring(str,si,ei);
        System.out.println("Substring is : " + cutString);
        sc.close();      

    }
}
