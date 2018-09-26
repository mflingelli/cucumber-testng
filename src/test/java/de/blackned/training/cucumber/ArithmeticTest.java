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
}
