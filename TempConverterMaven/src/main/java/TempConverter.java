

public class TempConverter {
	
	public float convertFromCelciusToFarenheit(float celcius) {
		
		if (celcius < 0.0)
			return -1;
				
		float farenheit = 32;
		farenheit+= celcius * 1.8;
		
		System.out.println("Farenheit: "+farenheit);
		
		return farenheit;
		
	}

}
