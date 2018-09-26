package de.blackned.training.cucumber;

public class Arithmetic {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int signum(int a) {
        if (a < 0) {
            return -1;
        } else if (a > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public double weightedAverage(int... summands) {
        int i = 0;
        int sum = 0;
        for(int summand : summands) {
            i++;
            sum += summand * i;
        }
        return (double)sum / sum(i);
    }

    public int sum(int x) {
        int result = 0;
        for(int i = 0; i <= Math.abs(x); i++) {
            result += i;
        }
        if (x < 0) {
            result *= -1;
        }
        return result;
    }

    public int gaussSum(int x) {
        return x * (x+1) / 2;
    }

    public int divide(int x, int y) throws Throwable {
        if (y == 0) {
            throw new Throwable("Division by 0 not defined");
        }
        return x / y;
    }
}
