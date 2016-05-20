package junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FiboTest {
	
	@BeforeClass
	public static void beforeAll(){
		System.out.println("avant tous");
	}
	
	@AfterClass
	public static void afterAll(){
		System.out.println("après tous");
	}
	
	@Before
	public void beforeEach(){
		System.out.println("avant");
	}

	@After
	public void afterEach(){
		System.out.println("après");
	}

	@Test
	public void fiboPosOrZero(){
		assertEquals("0 => 0", 0, Fibo.fib(0));
		assertEquals("1 => 1", 1, Fibo.fib(1));
		assertEquals("25 => 75025", 75025, Fibo.fib(25));
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void fibNeg(){
	Fibo.fib(-1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void fibTooBig(){
	Fibo.fib(Integer.MAX_VALUE);
	}

}
