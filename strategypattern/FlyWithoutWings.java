package com.luochuang.strategypattern;

public class FlyWithoutWings implements FlyBehavior {
	@Override
	public void fly() {
         System.out.println("fly without wings");
	}
}
