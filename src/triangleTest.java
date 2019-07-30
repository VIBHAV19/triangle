import junit.framework.TestCase;

public class triangleTest extends TestCase {

	public void testArea() {
		triangle t = new triangle();
		t.setBase(2f);
		t.setHeight(10f);
		float a= t.area();
		assertEquals(10f,a);
	}
	

}
