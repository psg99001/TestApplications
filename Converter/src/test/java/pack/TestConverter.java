package pack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConverter {

	@Test
	public void TestSomething()
	{
		float expected = 32;
		
		Converter tmp = new Converter();
		float result = tmp.convertFromCelciusToFarenheit(0);
		
		assertEquals(expected, result, 0);
	}


}
