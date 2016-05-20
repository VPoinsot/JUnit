package junit;

import static org.junit.Assert.*;

import org.junit.Test;




public class HelloJUnitTest {

	@Test
	public void helloShouldReturnHello() {
		// GIVEN
		HelloJUnit helloJUnit = new HelloJUnit();
		
		// WHEN
		String result = helloJUnit.hello();
		
		// THEN
		//je dois garantir que "hello.equals(resutl);
		assertEquals("helloJUnit.hello() sould equals hello", "hello", result);
		assertTrue("helloJUnit.hello() sould equals hello", "hello".equals(result));
	}

}
