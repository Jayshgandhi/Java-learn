import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class solution07 {
    public static void main(String[] args) throws Exception {

        Random rd = new Random();
        int []a = new int[6];
        System.out.print("Main array is: [");
        for (int i = 0; i < 6; i++) {
            a[i] = rd.nextInt((100 - 1) + 1) + 1;
            System.out.print(a[i]+",");
        }
        System.out.println("]");
        System.out.println("Reversed array:"+ reverse(a));
    }
    public static List<Integer> reverse(int[] args) {
        List<Integer> ar = new ArrayList<>();
        for (int i = args.length-1; i >0; i--) {

            ar.add(args[i]);
        }
        return ar;
    }
}
