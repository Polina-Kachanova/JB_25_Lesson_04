package by.epam.tr.start;

import org.junit.Assert;
import org.junit.Test;

public class FunctionTest {

    @Test
    public void calcYT001(){
        double x = 10;
        double realY;
        double expectedY = 0.00990099;

        realY = Function.calcY(x);
        Assert.assertEquals(expectedY, realY, 0.00000001);
    }

    @Test
    public void calcYT002(){
        double x = 2;
        double realY;
        double expectedY = 9;

        realY = Function.calcY(x);
        Assert.assertEquals(expectedY, realY, 0.00000001);
    }
}
