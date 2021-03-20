import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class JavaStreamWorker{

    public boolean odd_Or_Even(Integer o) {
        if(o%2==1)
            return true;
        else
            return false;
    }
    public Integer cube(Integer n){

        return n*n*n;
    }
    public List process1(List<Integer> vl){

        List<Integer> end = vl.stream().filter(h->odd_Or_Even(h)).sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
        // Odd numbers in sorted order:
        return end;
    }
    public Integer process2(List<Integer> vl){

        Integer end = Math.toIntExact(vl.stream().filter(h->!odd_Or_Even(h)).sorted((i1, i2) -> i1.compareTo(i2)).distinct().count());
        return end;
    }
    public List process3(List<Integer> vl){

        List<Integer> end = vl.stream().filter(h->!odd_Or_Even(h)).map(v->cube(v)).sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
        return end;
    }
    public Integer process4(List<Integer> vl){

        Integer end = vl.stream().sorted((i1, i2) -> i1.compareTo(i2)).map(v->cube(v)).limit(3).collect(Collectors.summingInt(Integer::intValue));
        return end;
    }
}

public class solution21 {


    public static void main(String[] args) {
        List<Integer> val = new ArrayList<>();
        Random rd = new Random();
        Object result = new Object();
        JavaStreamWorker vj = new JavaStreamWorker();

        for (int i = 0; i < 5; i++) {
            val.add(rd.nextInt((100 - 1) + 1) + 1);

        }
        System.out.println("List:"+val);

        List<Integer> d = vj.process1(val);
        System.out.println("Odd numbers in sorted order: "+vj.process1(val));
        System.out.println("Count of distinct even numbers:" +vj.process2(val));
        System.out.println("Cube of even numbers: "+vj.process3(val));
        System.out.println("Sum of max 3 cube numbers: "+vj.process4(val));


    }








}
