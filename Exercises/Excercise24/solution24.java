class Samples<N extends Number>{

    public N add(N a1, N a2){
        if (a1 instanceof Double) {
            return (N) Double.valueOf((a1.doubleValue() + a2.doubleValue()));
        }
        else if (a1 instanceof Float ) {
            return (N) Float.valueOf(((a1.floatValue() + a2.floatValue())));
        } else if (a1 instanceof Integer) {
            return (N) Integer.valueOf(((a1.intValue() + a2.intValue())));
        }
        throw new IllegalArgumentException();
    }
    public N sub(N a1, N a2){
        if (a1 instanceof Double) {
            return (N) Double.valueOf((a1.doubleValue() - a2.doubleValue()));
        }
        else if (a1 instanceof Float ) {
            return (N) Float.valueOf(((a1.floatValue() - a2.floatValue())));
        } else if (a1 instanceof Integer) {
            return (N) Integer.valueOf(((a1.intValue() - a2.intValue())));
        }
        throw new IllegalArgumentException();
    }
    public N mul(N a1, N a2){
        if (a1 instanceof Double) {
            return (N) Double.valueOf((a1.doubleValue() * a2.doubleValue()));
        }
        else if (a1 instanceof Float ) {
            return (N) Float.valueOf(((a1.floatValue() * a2.floatValue())));
        } else if (a1 instanceof Integer) {
            return (N) Integer.valueOf(((a1.intValue() * a2.intValue())));
        }
        throw new IllegalArgumentException();
    }
    public N div(N a1, N a2){
        if (a1 instanceof Double) {
            return (N) Double.valueOf((a1.doubleValue() / a2.doubleValue()));
        }
        else if (a1 instanceof Float ) {
            return (N) Float.valueOf(((a1.floatValue() / a2.floatValue())));
        } else if (a1 instanceof Integer) {
            return (N) Integer.valueOf(((a1.intValue() / a2.intValue())));
        }
        throw new IllegalArgumentException();
    }
}
public class solution24 {
    public static void main(String args[]) {

        Samples<Integer> obj1 = new Samples();
        System.out.println("Instance of Integer");
        System.out.println(obj1.add(2,9));
        System.out.println(obj1.sub(2,9));
        System.out.println(obj1.mul(2,9));
        System.out.println(obj1.div(2,9));
        System.out.println("Instance of Float");
        Samples<Float> obj2 = new Samples();
        System.out.println(obj2.add(2.6f,9.3f));
        System.out.println(obj2.sub(2.7f,9.2f));
        System.out.println(obj2.mul(2.3f,9.2f));
        System.out.println(obj2.div(2.8f,9.3f));
        System.out.println("Instance of Double");
        Samples<Double> obj3 = new Samples();
        System.out.println(obj3.add(2.0,9.0));
        System.out.println(obj3.sub(8.0,9.0));
        System.out.println(obj3.mul(4.0,9.0));
        System.out.println(obj3.div(12.0,9.0));


    }
}


