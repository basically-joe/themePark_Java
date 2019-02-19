import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

	ThemePark themePark;
	RollerCoaster rollerCoaster;
	Visitor visitor;
	Visitor visitor1;
	IceCream iceCreamStall;

	@Before
	public void before() {
		themePark = new ThemePark("Alton Towers");
		rollerCoaster = new RollerCoaster("Oblivion");
		visitor = new Visitor("Jon", 28, 175, 40);
		visitor1 = new Visitor("MiniMe", 28, 140, 40);
		iceCreamStall = new IceCream("Joe's Ices", "Joe", "E25");
	}

	@Test
	public void canGetRating() {
		assertEquals(0, themePark.getRating());
	}


	@Test
	public void canGetName() {
		assertEquals("Alton Towers", themePark.getName());
	}

	@Test
	public void canGetRatingCount(){
		assertEquals(0, themePark.countRatingsInArray());
	}
//
//	@Test
//	public void canAddToRatingList() {
//		themePark.addRatingToArray();
//		assertEquals(1, themePark.countRatingsInArray());
//	}
}
