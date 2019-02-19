import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamTest {
	IceCream iceCreamStall;

	@Before
	public void before(){
		iceCreamStall = new IceCream("Joe's Ices", "Joe", "E25", 4);
	}

	@Test
	public void hasName(){
		assertEquals("Joe's Ices", iceCreamStall.getName());
	}
	@Test
	public void hasOwner(){
		assertEquals("Joe", iceCreamStall.getOwnerName());
	}
	@Test
	public void hasParkingSpot(){
		assertEquals("E25", iceCreamStall.getParkingSpot());
	}
}
