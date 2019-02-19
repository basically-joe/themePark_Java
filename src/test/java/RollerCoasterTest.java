import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

	RollerCoaster rollerCoaster;

	@Before
	public void before(){
		rollerCoaster = new RollerCoaster("Oblivion");
	}

	@Test
	public void hasName(){
		assertEquals("Oblivion", rollerCoaster.getName());
	}
}
