package com.luochuang.observerpattern;

import java.util.ArrayList;
import java.util.List;
/**
 * 主题对象
 */
public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		if (observers.indexOf(observer) >= 0) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
              observers.get(i).update(temperature, humidity, pressure);
		}
	}

	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObserver();
	}

}
