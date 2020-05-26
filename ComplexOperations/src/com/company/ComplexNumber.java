package com.company;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber temp) {
        this.add(temp.real, temp.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber temp) {
        this.subtract(temp.real, temp.imaginary);
    }
}


// * Method named subtract with two parameters real and imaginary of type double, it needs
// to subtract parameters from fields, in other words, it needs to do a complex number
// subtract operation as described above.

// * Method named subtract with one parameter other of type ComplexNumber. It needs to
// subtract the other parameter from this complex number.