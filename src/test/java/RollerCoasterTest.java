import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

	RollerCoaster rollerCoaster;
	Visitor visitor;

	@Before
	public void before(){
		rollerCoaster = new RollerCoaster("Oblivion");
		visitor = new Visitor("Jon", 28, 175, 40);
	}

	@Test
	public void hasName(){
		assertEquals("Oblivion", rollerCoaster.getName());
	}

	@Test
	public void testAllowedOnAttraction(){
		assertEquals(true, rollerCoaster.isAllowedTo(visitor));
	}


}
