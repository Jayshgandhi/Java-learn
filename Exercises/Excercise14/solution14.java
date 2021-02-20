import java.util.Objects;

class ComplexNumber{
    float real;
    float imaginary;
    ComplexNumber(float real,float imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    @Override
    public String toString() {

        return "ComplexNumber{" +
                "real=" + real +
                ", imaginary=" + imaginary +"i }";
    }
}
abstract class Arithmetics{
    final float add(float f,float g){
        return f+g;
    }
    final float sub(float v,float j){
        return v-j;
    }
    final float mul(float m,float n){
        return m*n;
    }
    abstract void display(ComplexNumber c);


    static class ComplexArith extends Arithmetics
    {
        ComplexNumber complexAdd(ComplexNumber c,ComplexNumber f){
            System.out.println();
            System.out.println("Addition result:");
            return new ComplexNumber (super.add(c.real,f.real),super.add(c.imaginary, f.imaginary));
        }
        ComplexNumber complexSub(ComplexNumber c,ComplexNumber f){
            System.out.println();
            System.out.println("Subtraction result:");
            return new ComplexNumber (super.sub(c.real,f.real),super.sub(c.imaginary, f.imaginary));
        }
        ComplexNumber complexMul(ComplexNumber c,ComplexNumber f){
            System.out.println();
            System.out.println("Division result:");
            return new ComplexNumber (super.mul(c.real,f.real),super.mul(c.imaginary, f.imaginary));
        }
        void display(ComplexNumber c){
            System.out.println(c.real+"  "+c.imaginary+"i");
        }
    }
}
public class solution14{
    public static void main(String[] args) {
        Arithmetics.ComplexArith we = new Arithmetics.ComplexArith();
        ComplexNumber j= new ComplexNumber(15.8f,18.9f);
        ComplexNumber v= new ComplexNumber(9.8f,6.9f);
        System.out.println("Given complex numbers:");
        we.display(j);
        we.display(v);
        System.out.println(we.complexAdd(j,v ));
        System.out.println(we.complexSub(j,v));
        System.out.println(we.complexMul(j,v));


    }
}