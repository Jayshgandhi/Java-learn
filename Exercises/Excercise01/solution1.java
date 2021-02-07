import java.util.*;
public class solution1 {
    public static Float Convert(int num)
    {
        return  num*1.8f +  32;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Enter number");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Convert(n));
    }
}




