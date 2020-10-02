import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){
        //Given
        Calculator calculator = new Calculator();

        int actual = calculator.add(2,2);
        int expected = 4;

        Assert.assertEquals(actual,expected);
    }
    public void subtractTest(){
        Calculator calculator = new Calculator();

        int actual = calculator.subtract(4,1);
        int expected = 3;
        Assert.assertNotEquals(actual, expected);
    }
    public void multiplyTest(){
        Calculator calculator = new Calculator();

        int actual = calculator.multiply(1,9);
        int expected = 9;

        Assert.assertEquals(actual,expected);
    }
    public void divideTest(){
        Calculator calculator = new Calculator();

        int actual = calculator.divide(25, 5);
        int expected = 5;

        Assert.assertEquals(actual, expected);
    }


}
