import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

	RollerCoaster rollerCoaster;
	Visitor visitor;
	Visitor visitor1;

	@Before
	public void before(){
		rollerCoaster = new RollerCoaster("Oblivion");
		visitor = new Visitor("Jon", 28, 175, 40);
		visitor1 = new Visitor("MiniMe", 28, 140, 40);
	}

	@Test
	public void hasName(){
		assertEquals("Oblivion", rollerCoaster.getName());
	}

	@Test
	public void testAllowedOnAttraction(){
		assertEquals(true, rollerCoaster.isAllowedTo(visitor));
	}

	@Test
	public void testNotAllowedOnAttraction(){
		assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
	}


}
