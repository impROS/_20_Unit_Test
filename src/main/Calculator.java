package main;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) throws ArithmeticException {
        return firstNumber / secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int modulo(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }

    public int power(int firstNumber, int secondNumber) {
        return (int) Math.pow(firstNumber, secondNumber);
    }

    public int factorial(int number) {
        int result = 1;
        for(int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public int absolute(int number) {
        return Math.abs(number);
    }

    public int squareRoot(int number) {
        return (int) Math.sqrt(number);
    }
}