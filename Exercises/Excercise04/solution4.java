import java.util.*;

public class Main {
    public static void func(double num)
    {

        if(num % 2 == 0){

            double r=Celsius(num);
            System.out.println(r);
        }
        else{

            double d= Fahrenheit(num);
            System.out.println(d);
        }
    }
    public static Double Celsius(double num){
        double f= num*1.8 + 32;
        return f;
    }
    public static Double Fahrenheit(double num){
        double f= num-32 * 0.556;
        return f;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Enter number");
        Scanner sc =new Scanner(System.in);
        double n = sc.nextDouble();
        func(102);

        //System.out.println(c);
    }
}
