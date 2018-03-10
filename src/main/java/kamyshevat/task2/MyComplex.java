package kamyshevat.task2;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }

    public boolean isReal() {
        if (real != 0.0) {
            return true;
        } else return false;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public boolean isImaginary() {
        if (real != 0.0) {
            return true;
        } else return false;
    }

    public boolean equals(double real, double imag) {
        return Double.compare(this.real, real) == 0 &&
                Double.compare(this.imag, imag) == 0;
    }

    public boolean equals(MyComplex another) {
        return Double.compare(another.real, real) == 0 &&
                Double.compare(another.imag, imag) == 0;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        return Math.atan(imag / real);
    }

    public MyComplex add(MyComplex right) {
        this.real = this.real + right.real;
        this.imag = this.imag + right.imag;
        return this;
    }

    public MyComplex subtract(MyComplex right) {
        this.real = this.real - right.real;
        this.imag = this.imag - right.imag;
        return this;
    }

    public MyComplex multiply(MyComplex right) {
        this.real = (this.real * right.real) - (this.imag * right.imag);
        this.imag = (this.real * right.imag) - (this.imag * right.real);
        return this;
    }

    public MyComplex divide(MyComplex right) {
        this.real = ((this.real * right.real) + (this.imag * right.imag)) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        this.imag = (right.real * this.imag + this.real * right.imag) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex myComplex = new MyComplex();
        myComplex.imag = this.imag + right.imag;
        myComplex.real = this.real + right.real;
        return myComplex;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex myComplex = new MyComplex();
        myComplex.imag = this.imag - right.imag;
        myComplex.real = this.real - right.real;
        return myComplex;
    }

    public MyComplex conjugate() {
        MyComplex myComplex = new MyComplex(real, imag * (-1));
        return myComplex;
    }


}
