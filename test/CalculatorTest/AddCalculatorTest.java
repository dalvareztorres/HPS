package CalculatorTest;

import Calculator.AddCalculator;
import Calculator.Calculator;
import Type.DoubleType;
import Type.IntegerType;
import static org.junit.Assert.*;
import org.junit.Test;

public class AddCalculatorTest {
    
    @Test
    public void testPositiveIntegers(){
        Calculator addCalculator = new AddCalculator();
        IntegerType result = (IntegerType) addCalculator.calculate(new IntegerType(2), new IntegerType(3));
        assertEquals(5, result.getValue());
    }
    
    @Test
    public void testPositiveDoubles(){
        Calculator addCalculator = new AddCalculator();
        DoubleType result = (DoubleType) addCalculator.calculate(new DoubleType(2.6), new DoubleType(2.4));
        assertEquals(5, result.getValue(), 0);
    }
    
    @Test
    public void testPositiveMixed(){
        Calculator addCalculator = new AddCalculator();
        DoubleType result = (DoubleType) addCalculator.calculate(new IntegerType(2), new DoubleType(3));
        assertEquals(5, result.getValue(), 0);
    }
    
    @Test
    public void testNegativeIntegers(){
        Calculator addCalculator = new AddCalculator();
        IntegerType result = (IntegerType) addCalculator.calculate(new IntegerType(-2), new IntegerType(-3));
        assertEquals(-5, result.getValue());
    }
    
    @Test
    public void testNegativeDoubles(){
        Calculator addCalculator = new AddCalculator();
        DoubleType result = (DoubleType) addCalculator.calculate(new DoubleType(-2.6), new DoubleType(-2.4));
        assertEquals(-5, result.getValue(), 0);
    }
    
    @Test
    public void testMixed(){
        Calculator addCalculator = new AddCalculator();
        DoubleType result = (DoubleType) addCalculator.calculate(new IntegerType(-2), new DoubleType(-3));
        assertEquals(-5, result.getValue(), 0);
    }
}
