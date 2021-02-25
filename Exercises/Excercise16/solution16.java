import java.util.ArrayList;
import java.util.Arrays;

class Multiply{
    public Integer process(Integer n, Integer y){
        return n*y;
    }
    public Integer[] process(Integer[]n, Integer[] y){
        Integer k[] = new Integer[n.length];
        try {
            if (n.length == y.length) {
//Vector multiplication using Hadamard product logic.
                for (int i = 0; i < n.length; i++) {
                    k[i] = n[i] * y[i];
                }
            }
            //User defined exception
            else{
                throw new Exception("Size of the arrays are not equal");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return k;
    }
    public Integer[][] process(Integer[][]n, Integer[][]y){
        Integer p[][] = new Integer[n.length][y.length];
        try {
            if (n.length == y.length) {
                //Matrix multiplication using Hadamard product logic.
                for (int i = 0; i < n.length; i++) {
                    for(int j=0;j<n.length;j++){
                        p[i][j] = n[i][j] * y[i][j];
                    }
                }
            }
            //User defined exception
            else{
                throw new Exception("Size of the arrays are not equal");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return p;

    }

    void display(Integer n){

        System.out.println("Scalar multiplication:\t["+n+"]");
    }
    void display(Integer[]n){

        System.out.print("Vector multiplication:\t[");
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.print("]");
    }
    void display(Integer[][]n){
        System.out.println("\nMatrix multiplication:");
        System.out.print("[");
        for(int i=0;i<n.length;i++){
            System.out.print("\t[");
            for(int j=0;j<n.length;j++){
                System.out.print(n[i][j]+"\t");
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.println("]");
    }
}
public class solution16 {
    public static void main(String[] args) {
        Multiply m = new Multiply();
        Integer r=m.process(12,78);
        Integer[]a = new Integer[]{23,67,89,11};
        Integer[]b = new Integer[]{5,6,7,9};
        Integer[]g = m.process(a,b);
        Integer[][]v = new Integer[][]{{2,3,1},{4,7,2},{1,2,3}};
        Integer[][]j = new Integer[][]{{3,4,1},{5,6,2},{1,2,3}};
        Integer[][]h = m.process(v,j);
        m.display(r);
        m.display(g);
        m.display(h);
    }
}
