class ArithGeneric<N>{
    private N t;

    public N get(){
        return this.t;
    }

    public void set(N t1){
        this.t=t1;
    }
    public <N>Integer add(ArithGeneric a1, ArithGeneric a2){
        return (Integer) a1.get()+(Integer) a2.get();
    }
    public <N>Integer sub(ArithGeneric a1, ArithGeneric a2){
        return (Integer) a1.get()-(Integer) a2.get();
    }
    public <N>Integer mul(ArithGeneric a1, ArithGeneric a2){
        return (Integer) a1.get()*(Integer) a2.get();
    }
    public <N>Integer div(ArithGeneric a1, ArithGeneric a2){
        return (Integer) a1.get()/(Integer) a2.get();
    }
}

public class solution23 {
    public static void main(String[] args) {
        ArithGeneric<Integer> a =new ArithGeneric<>();
        ArithGeneric<Integer> b =new ArithGeneric<>();
        a.set(60);
        b.set(6);
        System.out.println("Addition:"+a.add(a,b));
        System.out.println("Subtraction:"+a.sub(a,b));
        System.out.println("Multiplication:"+a.mul(a,b));
        System.out.println("Division"+a.div(a,b));
    }
}
