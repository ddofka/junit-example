package org.example;

public class Skaiciuokle {

    private final int a;
    private final int b;
    private int result;
    private double result_Double;

    public Skaiciuokle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sudetis() {
        result = a + b;
        return result;
    }

    public int atimtis() {
        result = a - b;
        return result;
    }

    public int daugyba() {
        result = a*b;
        return result;
    }

    public double dalyba() {
        if (b == 0){
            throw new ArithmeticException("Dalyba is nulio negalima");
        }
        result_Double = (double) (a / b);
        return result_Double;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
