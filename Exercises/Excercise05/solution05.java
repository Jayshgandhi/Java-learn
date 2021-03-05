import java.util.Random;
import java.util.Scanner;

public class solution05 {
    public static void main(String[] args) {
        System.out.println("Enter a integer value:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Multiplicative value of given n integers:"+mult(n));

    }
    public static float mult(int n){
        float f[] =new float[n];
        float m=1f;
        Random rd = new Random();

        for (int i = 0; i < n-1; i++) {
            f[i] = (float)(rd.nextInt((n - 1) + 1) + 1);
            System.out.print(+f[i]+" ,");

        }
        f[n-1] = (float)(rd.nextInt((n - 1) + 1) + 1);
        System.out.print(f[n-1]);
        System.out.println();
        for (int i = 0; i < n; i++) {
            m = m * f[i];
        }
        return m;
    }

}

