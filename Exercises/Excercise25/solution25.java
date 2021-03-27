import java.util.*;

class CollectionExercise{

    public List<Integer> insertVal(Integer[]n){
        List<Integer> l = new ArrayList<>();
        for (int i=0;i<10;i++){
            l.add(i,n[i]);
        }
        return l;
    }
    public Stack<Integer> insertValLIFO(Integer[]n){
        Stack<Integer> l = new Stack<Integer>();
        for (int i=0;i<10;i++){
            l.push(n[i]);
        }

        return l;
    }
    public Queue<Integer> insertValFIFO(Integer[]n){
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<10;i++){
            q.add(n[i]);
        }
        return q;
    }
    public HashSet<Integer> insertValueUnique(Integer[]n){
        HashSet<Integer> h = new HashSet<>();
        for (int i=0;i<10;i++){
            h.add(n[i]);
        }
        return h;
    }
    public LinkedHashSet<Integer> insertValUniqueOrdered(Integer[]n){
        LinkedHashSet<Integer> h = new LinkedHashSet<>();
        for (int i=0;i<10;i++){
            h.add(n[i]);
        }
        return h;
    }
    public TreeSet<Integer> insertValUniqueSorted(Integer[]n){
        TreeSet<Integer> h = new TreeSet<>();
        for (int i=0;i<10;i++){
            h.add(n[i]);
        }
        return h;
    }
    public int sizeDisplay(Iterable<Integer> f){
        if (f instanceof Collection) {
            return ((Collection<?>) f).size();
        }
        int counter = 0;
        for (Object i : f) {
            counter++;
        }
        return counter;
    }
}

public class solution25 {
    public static void main(String[] args) {
        Random rd = new Random();
        Integer a[] = new Integer[10];
        for(int i=0;i<10;i++) {
            a[i]= rd.nextInt((20 - 1) + 1) + 1;
        }
        System.out.print("Insertion array:[");
        for(int i=0;i<10;i++) {
            System.out.print(a[i]+", ");
        }
        System.out.println("]");


        CollectionExercise c = new CollectionExercise();
        System.out.println("List:"+c.insertVal(a));
        Stack<Integer>s = c.insertValLIFO(a);
        System.out.print("Stack: [");
        for (int i=0;i<10;i++) {

            System.out.print( s.pop()+", ");
        }
        System.out.print("]");
        System.out.println();
        Queue<Integer> r = c.insertValFIFO(a);
        System.out.print("List:"+r);

        System.out.print("]");
        System.out.println();
        System.out.println("Unique values HashSet: "+ c.insertValueUnique(a));
        System.out.println("Unique value ordered LinkedHashSet: "+ c.insertValUniqueOrdered(a));
        System.out.println("Unique order Sorted TressSet:"+c.insertValUniqueSorted(a));
        System.out.println("Size of given array:"+a.length);
        System.out.println("Size of List:"+c.sizeDisplay(c.insertVal(a)));
        System.out.println("Size of Stack:"+c.sizeDisplay(c.insertValLIFO(a)));
        System.out.println("Size of List:"+c.sizeDisplay(c.insertValFIFO(a)));
        System.out.println("Size of hashset:"+c.sizeDisplay(c.insertValueUnique(a)));
        System.out.println("Size of LinkedHashset:"+c.sizeDisplay(c.insertValUniqueOrdered(a)));
        System.out.println("Size of TreeSet:"+c.sizeDisplay(c.insertValUniqueSorted(a)));




    }
}
