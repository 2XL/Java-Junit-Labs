package lifecycle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class TestLifecycle {

	@Test
	public void testTest1(){
		System.out.println("@test1");
	}
	@Test
	public void testTest2(){
		System.out.println("@test2");
	}
	@Test(expected=ArithmeticException.class)  
	public void divisionWithException() {  
	  int i = 1/0;
	}
	//execute for each test, before executing test
	@Before
	public void testBefore1(){
		System.out.println("@before1");
	}
	@Before
	public void testBefore2(){
		System.out.println("@before2");
	}
	//execute only once, in the starting
	@BeforeClass
	public static void testBeforeClass1(){
		System.out.println("@beforeclass1");
	}
	@BeforeClass
	public static void testBeforeClass2(){
		System.out.println("@beforeclass2");
	}
	//execute only once, in the end
	@AfterClass
	public static void testAfterClass1(){
		System.out.println("@afterclass1");
	}
	@AfterClass
	public static void testAfterClass2(){
		System.out.println("@afterclass2");
	}
	//execute only once, in the end
	@After
	public void testAfter1(){
		System.out.println("@after1");
	}
	@After
	public void testAfter2(){
		System.out.println("@after2");
	}
	@Ignore
	@Test
	public void testIgnore(){
		System.out.println("@ignore");
	}
	@Test(timeout = 1000)  
	public void infinity() {
		while (true);
	} 
}
