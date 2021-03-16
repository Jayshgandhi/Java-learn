import java.util.Arrays;
import java.util.Random;
class Sample1{
    int a[],count,m,diff,v;

    public Sample1(int []a,int n){
        this.a=a;
        this.count=n;
    }

    public float mean(){
        m= Arrays.stream(a).sum()/count;
        return m;
    }
    public float mode(){
        int c = 1, tempCount;
        int popular = a[0];
        int temp = 0;
        for (int i = 0; i < (count - 1); i++)
        {
            temp = a[i];
            tempCount = 0;
            for (int j = 1; j < count; j++)
            {
                if (temp == a[j])
                    tempCount++;
            }
            if (tempCount > c)
            {
                popular = temp;
                c = tempCount;
            }
        }
        return popular;

    }
    public float variance(){

        for (int i = 0; i < count; i++) {
            diff += (a[i] - m) *
                    (a[i] - m);
        }
        v=diff/count;
        return v;
    }
    public float std_deviation(){
        return (float)Math.sqrt(v);
    }
    public String toString(){
        return "no of elements:" +count;
    }
}

public class solution11 {
    public static void main(String[] args) {
        Random rd = new Random();
        int []b = new int[15000];
        for (int i = 0; i < 10000; i++) {
            b[i] = rd.nextInt((1000 - 1) + 1) + 1;
        }
        int count=b.length;
        Sample1 sp = new Sample1(b,count);
        System.out.println("mean is:"+ sp.mean());
        System.out.println("mode is:"+ sp.mode());
        System.out.println("variance is:"+ sp.variance());
        System.out.println("standard deviation is:"+ sp.std_deviation());
        System.out.println(sp.toString());
    }
}
