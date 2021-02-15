import java.util.*;

public class solution06 {
    public static void main(String[] args) throws Exception {

        Random rd = new Random();
        int []a = new int[10];
        System.out.println("Main array:");
        for (int i = 0; i < 6; i++) {
            a[i] = rd.nextInt((100 - 1) + 1) + 1;

            System.out.print(a[i]+"\t");
        }
        int n=rd.nextInt((100 - 1) + 1) + 1;
        System.out.println("print value less than:"+n);
        System.out.println(filter(a, n));
    }
    public static List<Integer> filter(int[] args, int y) {
        List<Integer> ar = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            if (args[i] <y) {

                ar.add(args[i]);
            }

        }
        return ar;

    }
}
