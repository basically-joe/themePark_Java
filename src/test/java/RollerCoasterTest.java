import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

	RollerCoaster rollerCoaster;
	Visitor visitor;
	Visitor visitor1;

	@Before
	public void before(){
		rollerCoaster = new RollerCoaster("Oblivion", 5, 8.40);
		visitor = new Visitor("Jon", 28, 201, 40);
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

	@Test
	public void canGetRating(){
		assertEquals(5, rollerCoaster.getRating());
	}

	@Test
	public void canSetRating(){
		rollerCoaster.setRating(3);
		assertEquals(3, rollerCoaster.getRating());
	}

	@Test
	public void canGetDefaultPrice(){
		assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
	}

	@Test
	public void canChargeDoublePriceForTallPeople201cm(){
		assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.01);
	}


}
