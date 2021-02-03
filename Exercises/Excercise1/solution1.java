import java.util.*;

public class Main {
    public static Double Convert(double num)
    {
        double x= num*1.8 +  32;

        return x;


    }

    public static void main(String[] args) throws Exception {
        System.out.println("Enter number");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        Double c=Convert(37.6);

        System.out.println(c);
    }
}
