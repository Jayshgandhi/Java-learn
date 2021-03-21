interface Arithmetic2{
    public int operation(int a, int b);
}
@FunctionalInterface
interface ArithmeticGeneric<N,M>{

    public M operation( N t, N y);

}
public class exercise27 {
    public static void main(String[] args) {

        Arithmetic2 add = (int a, int b) -> { return a+b; };
        Arithmetic2 sub = (int a, int b) -> { return a-b; };
        Arithmetic2 mul = (int a, int b) -> { return a*b; };
        Arithmetic2 div = (int a, int b) -> { return a/b; };
        Arithmetic2 mod = (int a, int b) -> { return a%b; };

        ArithmeticGeneric<Integer, Float> add1 = (Integer a, Integer b)->{
            return Float.valueOf(a+b);};

        ArithmeticGeneric<Float,Integer> sub1 = (Float a, Float b)->{
            return Math.round(a+b);};

        ArithmeticGeneric<Double,Float> mul1 = (Double a, Double b)->{
            Double d = a*b;
            return d.floatValue();};

        ArithmeticGeneric<Integer,String> div1 = (Integer a, Integer b)->{
            Integer f = a/b;
            return f.toString();};

        ArithmeticGeneric<Integer,Double> mod1 = (Integer a, Integer b)->{
            Integer d = a*b;
            return d.doubleValue();};


        //Printing operations of Arithmetic interface
        System.out.println(add.operation(8,4));
        System.out.println(sub.operation(8,4));
        System.out.println(mul.operation(8,4));
        System.out.println(div.operation(8,4));
        System.out.println(mod.operation(8,4));

        //Printing operations of Arithmetic with Generics interface
        System.out.println(add1.operation(4,2));
        System.out.println(sub1.operation(4.9f,3.6f));
        System.out.println(mul1.operation(3456.89, 234678.98));
        System.out.println(div1.operation(18, 9));
        System.out.println(mod1.operation(18, 2));
    }
}
