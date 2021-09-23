package com.venkatesh.App;

import com.venkatesh.Strategies.MoneyFromRobbing;
import com.venkatesh.Strategies.MoneyFromStartUp;
import com.venkatesh.Strategies.MoneyFromWorkingHard;

public class App {
	public static void main(String[] args) {

		MoneyMaking Bob = new MoneyMaking(new MoneyFromWorkingHard());
		System.out.println("My initial Stratagy");
		Bob.makeMoney();

		Bob.changeStratagy(new MoneyFromStartUp());
		System.out.println("\nChanging the stratagy");
		Bob.makeMoney();

		Bob.changeStratagy(new MoneyFromRobbing());
		System.out.println("\nChanging the stratagy" + " Again!");
		Bob.makeMoney();

		Bob.changeStratagy(() -> {
			System.out.println("\n to avoid Cops, I am now hibernate mode for some time");
		});
		Bob.makeMoney();
		
		Bob.changeStratagy(() -> {
			System.out.println("\nI am now restarting my business");
		});
		Bob.makeMoney();

	}

}
