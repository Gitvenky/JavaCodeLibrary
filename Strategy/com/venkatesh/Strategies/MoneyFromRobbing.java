package com.venkatesh.Strategies;

import com.venkatesh.Interface.MoneyMakingStrategy;

public class MoneyFromRobbing implements MoneyMakingStrategy{
	@Override
	public void execute( ) {
		System.out.println(
				"Guys, I Am Making Money by Robbing.!!!" + "Cops caught me and threw me in prison, dont choose this");
		
	}
}
