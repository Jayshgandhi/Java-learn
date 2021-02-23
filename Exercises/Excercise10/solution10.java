class Arithmetic{
    public int add(int n,int y){
        return n+y;
    }
    public int sub(int n,int y){
        return n-y;
    }
    public int mul(int n,int y){ return n*y; }
    public int div(int n,int y){
        return n/y;
    }
}
public class solution10 {

    public static void main(String[] args) {
        Arithmetic ar =new Arithmetic();
        System.out.println("Arithmetic add:"+ar.add(4,7));
        System.out.println("Arithmetic sub:"+ar.sub(34,5));
        System.out.println("Arithmetic multiplication:"+ar.mul(23,78));
        System.out.println("Arithmetic division:"+ar.div(56,12));

    }
}

