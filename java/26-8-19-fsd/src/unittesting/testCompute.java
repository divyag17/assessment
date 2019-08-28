package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class testCompute  extends TestCase{
	int x,y;
	
	/*@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		x=9;
		y=3;
		super.setUp();
	}*/
	public String name;
		public testCompute(String name) {
		super(name);
		
		}	
	/*@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}*/
	@Test
	public void testgreaterThan() {
		assertEquals(true,new calc().greaterThan(3,2));
	}
	public static TestSuite createTestSuite()
	{
		TestSuite ts=new TestSuite();
		ts.addTest(new testCompute("AllTests"));
		ts.addTest(new testCompute("testgreaterThan"));
		ts.addTest(new MyClass());
		return ts;
	}
public static void main (String arg[])
 {
	junit.textui.TestRunner.run(createTestSuite());
	
 }

}
