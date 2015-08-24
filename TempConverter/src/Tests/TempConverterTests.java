package Tests;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Converter.TempConverter;
import junit.framework.Assert;

public class TempConverterTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TempConverter_Celcius0_Farenhet32IsReturned() {
		float expected = 32;
		
		TempConverter tmp = new TempConverter();
		float result = tmp.convertFromCelciusToFarenheit(0);
		
		assertEquals(expected, result, 0);
		
		
	}

}
