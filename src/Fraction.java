public class Fraction {
    int n, d;

    Fraction(int n, int d) {
        if (d == 0) {
            System.out.println("Denominator can't be zero. Choose another one.");
        } else {
            this.n = n;
            this.d = d;
        }
    }

    Fraction(int n) {
        this.n = n;
        this.d = 1;
    }

    Fraction(Fraction f) {
        this.n = f.n;
        this.d = f.d;
    }

    public Fraction add(Fraction f) {
        return new Fraction(this.n * f.d + f.n * this.d, this.d * f.d);
    }

    public Fraction sub(Fraction f) {
        return new Fraction(this.n * f.d - f.n * this.d, this.d * f.d);
    }

    public Fraction mult(Fraction f) {
        return new Fraction(this.n * f.n, this.d * f.d);
    }

    public Fraction div(Fraction f) {
        return new Fraction(this.n * f.d, this.d * f.n);
    }

    public void print() {
        System.out.println(n + "/" + d);
    }
}