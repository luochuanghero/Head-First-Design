package com.luochuang.observerpattern;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		CurrentConditionsDisplay condition = new CurrentConditionsDisplay(data);
		condition.update(23, 34, 45);
	}
}
