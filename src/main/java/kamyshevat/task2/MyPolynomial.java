package kamyshevat.task2;


public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = this.getDegree(); i >= 2; i--) {
            str += coeffs[i] + "x^" + i + "+";
        }
        str += coeffs[1] + "x+" + coeffs[0];
        return str;
    }

    public MyPolynomial add(MyPolynomial right) {
        int i;
        int max = Math.max(this.getDegree(), right.getDegree());
        double[] coef = new double[max];
        if (this.getDegree() == right.getDegree()) {
            for (i = 0; i < this.getDegree(); i++)
                coef[i] = this.coeffs[i] + right.coeffs[i];
        }
        if (this.getDegree() > right.getDegree()) {
            for (i = this.getDegree(); i > right.getDegree(); i--)
                coef[i] = this.coeffs[i];
            for (i = right.getDegree(); i >= 0; i--)
                coef[i] = this.coeffs[i] + right.coeffs[i];
        }
        if (this.getDegree() < right.getDegree()) {
            for (i = right.getDegree(); i > this.getDegree(); i--)
                coef[i] = right.coeffs[i];
            for (i = this.getDegree(); i >= 0; i--)
                coef[i] = this.coeffs[i] + right.coeffs[i];
        }
        MyPolynomial myPolynomial = new MyPolynomial(coef);
        return myPolynomial;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int i, j;
        double[] coef = new double[this.getDegree() + right.getDegree() + 1];
        for (i = this.getDegree(); i >= 0; i--)
            for (j = right.getDegree(); j >= 0; j--)
                coef[i + j] += this.coeffs[i] * right.coeffs[j];
        MyPolynomial myPolynomial = new MyPolynomial(coef);
        return myPolynomial;
    }
}
