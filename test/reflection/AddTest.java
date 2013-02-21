package reflection;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddTest {
	
	@Test
	public void testEvaluate() {
		Add add = new Add(new Constant<>(5.0), new Constant<>(3));
		assertEquals(8.0, add.evaluate());
	}


}
