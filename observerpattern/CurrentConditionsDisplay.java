package com.luochuang.observerpattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	
	@SuppressWarnings("unused")
	private Subject weatherDate;
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherDate = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions:" + temperature
				+ "F degress and " + humidity + "% humidity "
				+ " and pressure is :" + pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
