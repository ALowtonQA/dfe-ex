package com.qa.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TemperatureConverterTest {

	TemperatureConverter tc;
	
	@Before
	public void init() {
		tc = new TemperatureConverter();
	}
	
	@Test
	public void fahrenheitToCelsiusTest() {
		assertEquals(15.556, tc.convertFahrenheitToCelsius(60), 0.001);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void celsiusToFahrenheitTest() {
		assertEquals(86, tc.convertCelsiusToFahrenheit(30), 0);
	}
	
	@Test
	public void kelvinToCelsiusTest() {
		assertEquals(27, tc.convertKelvinToCelsius(300), 0);
	}
	
	@Test
	public void celsiusToKelvinTest() {
		assertEquals(300, tc.convertCelsiusToKelvin(27), 0);
	}
	
	@Test
	public void kelvinToFahrenheitTest() {
		assertEquals(80.6, tc.convertKelvinToFahrenheit(300), 0.001);
	}
	
	@Test
	public void fahrenheitToKelvinTest() {
		assertEquals(288.556, tc.convertFahrenheitToKelvin(60), 0.001);
	}
}
