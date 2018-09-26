package de.blackned.training.cucumber;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticTest {

    @Test
    public void add() {
        Arithmetic arithmetic = new Arithmetic();
        Assert.assertEquals(arithmetic.add(1, 3), 4);
    }

    @Test
    public void sum() {
        Arithmetic arithmetic = new Arithmetic();
        Assert.assertEquals(arithmetic.sum(4), 10);
    }

    @Test
    public void weightedAverage() {
        Arithmetic arithmetic = new Arithmetic();
        Assert.assertEquals(arithmetic.weightedAverage(1, 2 , 3, 4), 3, 0.0);
    }

    @Test
    public void gaussSum() {
        Arithmetic arithmetic = new Arithmetic();
        Assert.assertEquals(arithmetic.gaussSum(4), 10);
    }

    @Test
    public void divide() throws Throwable {
        Arithmetic arithmetic = new Arithmetic();
        Assert.assertEquals(arithmetic.divide(10, 5), 2);
    }

    @Test(expectedExceptions = Throwable.class)
    public void dividingByZeroIsEvil() throws Throwable {
        Arithmetic arithmetic = new Arithmetic();
        Assert.assertEquals(arithmetic.divide(1, 0), 0);
    }

    @Test(expectedExceptions = Throwable.class, enabled = false)
    public void anotherEvilDivisionByZero() throws Throwable {
        Arithmetic arithmetic = new Arithmetic();
        Assert.assertEquals(arithmetic.divide(666, 0), 0);
    }
}
