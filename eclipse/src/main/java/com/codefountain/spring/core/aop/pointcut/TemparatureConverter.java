package com.codefountain.spring.core.aop.pointcut;

public class TemparatureConverter implements Converter {

	@Override
	public double convertFarenhiteToCelcius(double farenhite) {
		double result = 5/9*(farenhite-32);
		System.out.println(result);
		return result;
	}

	@Override
	public double convertCelciusToFarenhite(double celcius) {
		double result = (celcius*9/5)+32;
		System.out.println(result);
		return result;
	}
}
