import java.util.ArrayList;
import java.util.Arrays;

interface Multiplication {
    default Integer process(Integer n, Integer y) {
        System.out.println("default");
        return n*y;
    }
    void display(Integer n);
}
class Scalar_multiplication implements Multiplication {
    public Integer process(Integer n, Integer y) {
        return n * y;
    }

    @Override
    public void display(Integer n) {
        System.out.println("Scalar multiplication:\t["+n+"]");
    }

}
class Vector_multiplication extends Scalar_multiplication {
    public Integer[] process(Integer[] n, Integer[] y) {
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

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return k;
    }

    public void display(Integer[] n) {

        System.out.print("Vector multiplication:\t[");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.print("]");
    }
}
class Matrix_multiplication extends Vector_multiplication{
    public Integer[][] process(Integer[][]n, Integer[][]y) {
        Integer p[][] = new Integer[n.length][y.length];
        try {
            if (n.length == y.length) {
//Matrix multiplication using Hadamard product logic.
                for (int i = 0; i < n.length; i++) {
                    for (int j = 0; j < n.length; j++) {
                        p[i][j] = n[i][j] * y[i][j];
                    }
                }
            }
            //User defined exception
            else{
                throw new Exception("Size of the arrays are not equal");
            }
        } catch (Exception e) {
            System.out.println("Out of bound error");
        }
        return p;
    }
    public void display(Integer[][]n){
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
public class solution17 {
    public static void main(String[] args) {
        Matrix_multiplication o = new Matrix_multiplication();
        Integer r=o.process(12,78);
        Integer[]a = new Integer[]{12,6,8,4};
        Integer[]b = new Integer[]{10,6,2,8};
        Integer[]g = o.process(a,b);
        Integer[][]v = new Integer[][]{{12,36,11},{14,37,52},{61,92,23}};
        Integer[][]j = new Integer[][]{{3,4,1},{5,6,2},{1,2,3}};
        Integer[][]h = o.process(v,j);
        o.display(r);
        o.display(g);
        o.display(h);
    }
}
