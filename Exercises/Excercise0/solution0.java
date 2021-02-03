import java.util.Scanner;

public class exercise0 {



    public static String odd(int num)
    {

        if(num % 2 == 0){
            return "even";
        }
        else
            return "odd";
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Enter number");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        String c=odd(n);

        System.out.println(c);
    }

}

