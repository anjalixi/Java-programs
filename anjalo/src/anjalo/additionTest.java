package anjalo;

import junit.framework.TestCase;

public class additionTest extends TestCase {

	public additionTest(String name) 
	{
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAdd() 
	{
		assertEquals(7,addition.add(4,3));
	
	}

}
