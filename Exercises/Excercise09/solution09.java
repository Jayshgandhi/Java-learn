import java.util.Random;
import java.util.Scanner;

public class solution09 {
    public static void main(String[] args) {
        Random rd = new Random();
        int []a = new int[10];
        for (int i = 0; i < 6; i++) {
            a[i] = rd.nextInt((100 - 1) + 1) + 1;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find:");
        int n = sc.nextInt();
        System.out.print("Random generated array:[");
        for (int i = 0; i < 6; i++) {
            System.out.print(","+a[i]);
        }
        System.out.print("]");
        System.out.println();
        System.out.println("Output is:"+filter(a,n));
    }
    public static Integer filter(int[]s,int y){
        for(int i=0;i< s.length;i++){
            if (s[i]==y){
                System.out.println("Element found");
                return i;
            }
        }

        return -100;
    }

}
