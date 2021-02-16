import java.util.Scanner;

interface Printer {
    void display(int n);
}
class First implements Printer {
    @Override
    public void display(int rows){
        System.out.println("\nPattern 1: \n");
        for (int i= 1; i<= rows ; i++)
        {
            for (int j=1; j<=i; j++)
            {
                if(j%2!=0){
                    System.out.print(j+ " ");
                }
                else{
                    System.out.print("$"+ " ");
                }
            }
            System.out.println("");
        }
        for (int i=rows-1; i>=0; i--)
        {
            for(int j=1; j <= i;j++)
            {

                if(j%2!=0){
                    System.out.print(j+ " ");
                }
                else{
                    System.out.print("$"+ " ");
                }
            }
            System.out.println("");
        }
    }
}

class Second implements Printer {

    public void display (int rows){
        System.out.println("\nPattern 2: \n");
        Primes pr = new Primes();
        int[] r=pr.number(rows);
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j<= i; j++)
            {

                System.out.print(r[j]+ " ");

            }
            System.out.println("");
        }
        for (int i=rows-2; i>=0; i--)
        {
            for(int j=0; j <= i;j++)
            {

                System.out.print(r[j]+ " ");
            }
            System.out.println("");
        }

    }
}

class Primes {
    public int[] number(int n){

        int status = 1;
        int num = 3;
        int[] a = new int[n];
        int y=0;
        if (n >= 1)
        {

            a[y]=2;
            y++;
        }

        for ( int i = 2 ; i <=n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                a[y] = num;
                i++;
                y++;
            }
            status = 1;
            num++;
        }
        return a;
    }

}

public class solution13 {
    public static void main(String[] args)
    {
        int x=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter number to print the pattern");
        x = s.nextInt();
        First fr = new First();
        fr.display(x);
        Second sc = new Second();
        sc.display(x);

    }
}


