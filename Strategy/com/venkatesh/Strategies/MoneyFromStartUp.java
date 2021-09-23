package com.venkatesh.Strategies;

import com.venkatesh.Interface.MoneyMakingStrategy;

public class MoneyFromStartUp implements MoneyMakingStrategy {
	@Override
	public void execute() {
		System.out.println("Guys, I Am Making Money by Starting a company.!!!");
		
	}
}
