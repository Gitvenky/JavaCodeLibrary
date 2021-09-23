package com.venkatesh.App;

import com.venkatesh.Interface.MoneyMakingStrategy;
import com.venkatesh.Strategies.MoneyFromWorkingHard;

public class MoneyMaking {
	
	MoneyMakingStrategy moneyMakingStrategy;

	MoneyMaking( MoneyMakingStrategy moneyMakingStrategy ) {
		this.moneyMakingStrategy=moneyMakingStrategy;
	}

	void changeStratagy(MoneyMakingStrategy moneyMakingStrategy) {
		this.moneyMakingStrategy=moneyMakingStrategy;
	}
	void makeMoney() {
		moneyMakingStrategy.execute();
	}
}
