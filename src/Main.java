public class Main {
    public static void main(String[] args){
        Fraction a=new Fraction(3,0);
        Fraction b=new Fraction(4,9);
        a.print();
        b.print();
        Fraction c = a.add(b);
        c.print();
        b.sub(a).print();

    }
}
