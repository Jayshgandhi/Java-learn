import java.util.*;

public class solutions2 {
    public static Integer Average(float[] num)
    {
        float sum=0;

        for (int i=0;i< num.length;i++){
             sum = sum+ num[i];
        }
        int a = (int) (sum);
        int avg;
        avg= a/num.length;
        return avg;
    }

    public static void main(String[] args) throws Exception {
        //System.out.println("Enter number");
        //Scanner sc =new Scanner(System.in);
        //int n = sc.nextInt();
        float[] val=new float[]{78.3f,44.9f,77.9f,66.9f,39.62f};


        System.out.println("average is:" +Average(val));
    }
}
