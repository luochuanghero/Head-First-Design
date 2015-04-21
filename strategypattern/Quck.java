package com.luochuang.strategypattern;

public class Quck implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("quack");
	}

}
