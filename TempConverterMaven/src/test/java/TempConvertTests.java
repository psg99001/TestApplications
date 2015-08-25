import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TempConvertTests {

		
	@Test
	public void TestSomething()
	{
		float expected = 32;
		
		TempConverter tmp = new TempConverter();
		float result = tmp.convertFromCelciusToFarenheit(0);
		
		assertEquals(expected, result, 0);
	}

}
