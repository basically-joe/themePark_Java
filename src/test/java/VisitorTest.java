import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

	Visitor visitor;

	@Before
	public void before(){
		visitor = new Visitor("Jon", 28, 175, 40);
	}

	@Test
	public void canGetVisitorName(){
		assertEquals("Jon", visitor.getName());
	}

	@Test
	public void canGetVisitorAge(){
		assertEquals(28, visitor.getAge());
	}

	@Test
	public void canGetVisitorHeight(){
		assertEquals(175, visitor.getHeight());
	}

	@Test
	public void canGetVisitorMoney(){
		assertEquals(40, visitor.getMoney(), 0.01);
	}

	@Test
	public void canSetVisitorName(){
		visitor.setName("Schtevie");
		assertEquals("Schtevie", visitor.getName());
	}

	@Test
	public void canSetVisitorAge(){
		visitor.setAge(50);
		assertEquals(50, visitor.getAge());
	}

	@Test
	public void canSetVisitorHeight(){
		visitor.setHeight(173);
		assertEquals(173, visitor.getHeight());
	}

	@Test
	public void canSetVisitorMoney(){
		visitor.setMoney(100);
		assertEquals(100, visitor.getMoney(), 0.01);
	}


}
