import java.util.*;
class solution02{
    public static void main(String[] args) throws Exception {
        float b[] =new float[]{18.9f,32.4f,6.7f,4.9f,7.9f};
        System.out.println(Average(b));

    }
        public static int Average(float[] num)
        {
            float sum=0;
            for(int i=0;i<num.length;i++){
             sum= sum + num[i];
        }
            return (int)sum / num.length;
    }
}



