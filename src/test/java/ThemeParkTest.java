import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

	ThemePark themePark;
	RollerCoaster rollerCoaster;
	Visitor visitor;
	Visitor visitor1;
	IceCream iceCreamStall;
	private ArrayList<IReviewed> ratingsList;

	@Before
	public void before() {
		themePark = new ThemePark("Alton Towers");
		rollerCoaster = new RollerCoaster("Oblivion", 5);
		visitor = new Visitor("Jon", 28, 175, 40);
		visitor1 = new Visitor("MiniMe", 28, 140, 40);
		iceCreamStall = new IceCream("Joe's Ices", "Joe", "E25", 4);
		ratingsList = new ArrayList<>();
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

	@Test
	public void canAddRatingToArray(){
		themePark.addRatingToArray(rollerCoaster);
		assertEquals(1, themePark.countRatingsInArray());
	}


	@Test
	public void canGetRatingsList() {
		assertEquals(ratingsList, themePark.getAllReviewed());
	}
}
