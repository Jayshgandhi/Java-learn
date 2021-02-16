class Arithmetic{
    private int n=89;
    private int y=67;
    public int add(){
        return n+y;
    }
    public int sub(){
        return n-y;
    }
    public int mul(){
        return n*y;
    }
    public int div(){
        return n/y;
    }
}
public class solution10 {

    public static void main(String[] args) {
        Arithmetic ar =new Arithmetic();
        System.out.println("Arithmetic add:"+ar.add());
        System.out.println("Arithmetic sub:"+ar.sub());
        System.out.println("Arithmetic multiplication:"+ar.mul());
        System.out.println("Arithmetic division:"+ar.div());

    }
}

