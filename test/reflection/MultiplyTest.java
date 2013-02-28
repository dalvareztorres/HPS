package reflection;

import Nodes.Multiply;
import Nodes.Constant;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultiplyTest {
	
	@Test
	public void testEvaluate() {
		Multiply multiply = new Multiply(new Constant<>(5.0), new Constant<>(3));
		assertEquals(15.0, multiply.evaluate());
	}
        
        @Test
	public void testEvaluate2() {
		Multiply multiply = new Multiply(new Constant<>(-1.0), new Constant<>(2.0));
		assertEquals(-2.0, multiply.evaluate());
	}
        
        @Test
	public void testEvaluate3() {
		Multiply multiply = new Multiply(new Constant<>(8), new Constant<>(3));
		assertEquals(24, multiply.evaluate());
	}
        
        @Test
	public void testEvaluate4() {
		Multiply multiply = new Multiply(new Constant<>(0), new Constant<>(999.5));
		assertEquals(0.0, multiply.evaluate());
	}


}
