import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TempConverterTestcases {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	float expected = 32;
		
		TempConverter tmp = new TempConverter();
		float result = tmp.convertFromCelciusToFarenheit(0);
		
		assertEquals(expected, result, 0);
	}
	
	@Test
	public void test1() {
		float expected = 45;
			
			TempConverter tmp = new TempConverter();
			float result = tmp.convertFromCelciusToFarenheit(0);
			
			assertEquals(expected, result, 0);
		}

}
