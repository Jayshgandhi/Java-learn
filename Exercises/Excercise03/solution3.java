import java.util.*;

public class solution3 {
    public static void main(String[] args) throws Exception {


        System.out.println("Integer to float:" +conv_int(45));
        System.out.println("Float to integer:"+conv_float(67.96f));
        System.out.println("Float to string:"+conv_stringfloat(89.87f));
        System.out.println("String to float"+conv_floatstring("56.789"));
        System.out.println("String to integer:"+conv_intstring("346793"));
        System.out.println("Integer to string:"+conv_stringint(876));
    }
    public static float conv_int(int n){

        float g=(float)n;
        return g;
    }
    public static int conv_float(float n){

        int g=(int)n;
        return g;
    }
    public static String conv_stringfloat(float n){
        String y = String.valueOf(n);
        return y;

    }
    public static float conv_floatstring(String n){
        float y= Float.parseFloat(n);
        return y;

    }
    public static int conv_intstring(String n){
        int y= Integer.parseInt(n);
        return y;

    }
    public static String conv_stringint(int n){
        String y = String.valueOf(n);
        return y;

    }
}
