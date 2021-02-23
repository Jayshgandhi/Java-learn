import java.util.*;

public class solution04 {
    public static void func(int num)
    {

        if(num % 2 == 0){
            System.out.println("Celsius value is:"+Celsius(num));
        }
        else{
            System.out.println("Fahrenheit value is:"+Fahrenheit(num));
        }
    }
    public static Float Celsius(int num){
        double f= num*1.8 + 32;
        return (float)f;
    }
    public static Float Fahrenheit(int num){
        double f= num-32 * 0.556;
        return (float)f;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Enter number");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }
}
