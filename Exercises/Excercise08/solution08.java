import java.sql.SQLOutput;
import java.util.Scanner;

public class solution08 {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Reversed string without function is:"+ str_withoutfunction(str));
        System.out.println("Reversed string with function is:" +str_withfunction(str));
    }
    public static String str_withoutfunction(String args){
        String r="";
        for (int i = args.length() - 1; i >= 0; --i) {
            r += args.charAt(i);
        }
        return r;
    }
    public static String str_withfunction(String args){
        StringBuilder buffer = new StringBuilder(args);
        String rev = buffer.reverse().toString();

        return rev;
    }
}
