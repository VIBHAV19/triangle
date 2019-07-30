import junit.framework.TestCase;

public class triangleTest2 extends TestCase {

	public void testParimeter() {
		triangle t= new triangle();
		t.setBase(10f);
		float p=t.parimeter();
		assertEquals(30f, p);
	}

}
