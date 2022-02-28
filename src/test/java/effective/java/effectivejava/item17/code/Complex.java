package effective.java.effectivejava.item17.code;

public class Complex {
    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    public Complex plus(Complex complex) {
        return new Complex(re + complex.re, im + complex.im);
    }
    public Complex minus(Complex complex) {
        return new Complex(re - complex.re, im - complex.im);
    }

    public Complex times(Complex complex) {
        return new Complex(re * complex.re - im * complex.im,
                re * complex.re + im * complex.im);
    }

    public Complex dividedBy(Complex complex) {
        double tmp = complex.re * complex.re + complex.im * complex.im;
        return new Complex((re * complex.re + im * complex.im) / tmp,
                (im * complex.re - re * complex.im) / tmp);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Complex)) {
            return false;
        }
        Complex complex = (Complex) obj;

        return Double.compare(complex.re, re) == 0
                && Double.compare(complex.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
