import java.util.ArrayList;
import java.util.Arrays;

interface Multiplication {
    default Object process(Object n, Object y) {
        System.out.println("default");
        return 0;
    }
    void display(Object n);
}
class Scalar_multiplication implements Multiplication {
    public Object process(Object n, Object y) {
        int h = (int)n;
        int g= (int)y;
        Object og = new Object();
        og=h*g;
        return og;
    }

    public void display(Object n) {
        int l = (int)n;
        System.out.println("Scalar multiplication:\t["+l+"]");
    }

}
class Vector_multiplication extends Scalar_multiplication {
    public Object process(Object n, Object y) {
        Integer[]h =(Integer[])n;
        Integer[]f= (Integer[])y;
        Integer []k = new Integer[h.length];
        Object[] oi = new Object[h.length];
        try {
            if (h.length == k.length) {
                //Vector multiplication using Hadamard product logic.
                for (int i = 0; i < h.length; i++) {
                    k[i] = h[i] * f[i];
                }
            }
            //User defined exception
            else{
                throw new Exception("Size of the arrays are not equal");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        oi = k;
        return oi;
    }

    public void display(Object n) {
        Integer[] j=(Integer[])n;

        System.out.print("Vector multiplication:\t[");
        for (int i = 0; i < j.length; i++) {
            System.out.print(j[i] + " ");
        }
        System.out.print("]");
    }
}
class Matrix_multiplication extends Vector_multiplication{
    public Object process(Object n, Object y) {
        Object ou = new Object();
        Integer[][]h =(Integer[][])n;
        Integer[][]f= (Integer[][])y;
        Integer p[][] = new Integer[h.length][f.length];
        try {
            if (h.length == f.length) {
//Matrix multiplication using Hadamard product logic.
                for (int i = 0; i < h.length; i++) {
                    for (int j = 0; j < f.length; j++) {
                        p[i][j] = h[i][j] * f[i][j];
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
        ou = p;
        return ou;
    }
    public void display(Object n){
        Integer[][]p =(Integer[][])n;
        System.out.println("\nMatrix multiplication:");
        System.out.print("[");
        for(int i=0;i<p.length;i++){
            System.out.print("\t[");
            for(int j=0;j<p.length;j++){
                System.out.print(p[i][j]+"\t");
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.println("]");
    }

}
public class solution17 {
    public static void main(String[] args) {
        Object obj1,obj2,obj3,obj4,obj5,obj6 = new Object();
        Integer[] i1 = new Integer[]{2,6,9,5};
        Integer[] i2 = new Integer[]{2,6,9,5};
        Integer[][]v = new Integer[][]{{12,3,1},{4,7,2},{1,26,3}};
        Integer[][]j = new Integer[][]{{3,3,1},{5,7,2},{11,2,3}};
        obj1=16;
        obj2=8;
        obj3 = i1;
        obj4 = i2;
        obj5 =v;
        obj6=j;
        Vector_multiplication k = new Vector_multiplication();
        Matrix_multiplication s = new Matrix_multiplication();
        Scalar_multiplication o = new Scalar_multiplication();
        Object gk=o.process(obj1,obj2);
        Object kl= k.process(obj3,obj4);
        Object fo=s.process(obj5,obj6);
        o.display(gk);
        k.display(kl);
        s.display(fo);
    }
}
