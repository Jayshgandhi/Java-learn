import java.util.Random;

class Name_generator {
    public String name_Suggestor(int length) {
        int[] a = new int[length];
        String[] s = new String[length];
        StringBuilder stringBuilder = new StringBuilder(length);
        Random rd = new Random();

        for (int i = 0; i < length; i++) {
            a[i] = rd.nextInt((90 - 65) + 1) + 65;
            s[i] = Character.toString((char) a[i]);
            stringBuilder.append(s[i]);
        }
        System.out.println("Name of the baby:");
        return stringBuilder.toString();
    }
}
public class solution19 {
    public static void main(String[] args) {
        Name_generator nm = new Name_generator();
        System.out.println(nm.name_Suggestor(5));
    }
}
