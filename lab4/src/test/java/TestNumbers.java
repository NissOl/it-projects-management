import org.junit.Assert;
import org.junit.Test;

public class TestNumbers {
    @Test
    public void testAdd() throws Exception{
        Numbers calculator = new Numbers();
        int add = calculator.add(4, 5);
        Assert.assertEquals(9, add);
    }
    @Test
    public void testSubtract() throws Exception{
        Numbers calculator = new Numbers();
        int subtract = calculator.subtract(12, 5);
        Assert.assertEquals(7, subtract);
    }
    @Test
    public void testMultiply() throws Exception{
        Numbers calculator = new Numbers();
        int multiply = calculator.multiply(4, 5);
        Assert.assertEquals(20, multiply);
    }
    @Test
    public void testDivide() throws Exception{
        Numbers calculator = new Numbers();
        int divide = calculator.divide(8, 4);
        Assert.assertEquals(2, divide);
    }
}