class Arith{

    public int add(int i, int j){
        return i+j;
    }
    public int sub(int i, int j){
        return i-j;
    }
    public int mul(int i, int j){
        return i*j;
    }

}
class FractionArith extends Arith{
    public Fraction fraction_add(Fraction h, Fraction g){

        return new Fraction(mul(h.numerator,g.denominator) + super.mul(h.denominator,g.numerator),super.mul(h.denominator,g.denominator));

    }
    public Fraction fraction_sub(Fraction x, Fraction y){

        return new Fraction(super.mul(x.numerator,y.denominator) - super.mul(y.numerator,x.denominator), super.mul(x.denominator,y.denominator));


    }
    public Fraction fraction_mul(Fraction j, Fraction g){
        return new Fraction(super.mul(j.numerator,g.numerator),super.mul(j.denominator,g.denominator)) ;

    }

}
class Fraction {
    int numerator;
    int denominator;
    Fraction(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    Fraction(){

    }
    public String toString(){
        return numerator+"/"+denominator;
    }
}

public class solution12 {

    public static void main(String[] args) {
        FractionArith d = new FractionArith();
        System.out.println(d.fraction_add(new Fraction(124,8),new Fraction(105,5)));
        System.out.println(d.fraction_sub(new Fraction(12,8),new Fraction(100,5)));
        System.out.println(d.fraction_mul(new Fraction(124,8),new Fraction(105,5)));
    }

}
