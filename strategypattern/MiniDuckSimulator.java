package com.luochuang.strategypattern;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.setFlyBehavior(new FlyWithoutWings());
		mallard.setQuackBehavior(new MuteQuack());
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
	}
}
