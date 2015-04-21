package com.luochuang.strategypattern;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
	}

	public void performFly() {
		flyBehavior.fly();
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public abstract void display();

	public void swim() {
		System.out.println("all duck can swim....");
	}
}
