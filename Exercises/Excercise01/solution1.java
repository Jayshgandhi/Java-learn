import java.util.*;
public class solution1 {
    public static Float Convert(int num)
    {
        double f=   num*1.8 +  32;
        float d = (float) f;
        return d;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Enter number");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Convert(n));
    }
}




