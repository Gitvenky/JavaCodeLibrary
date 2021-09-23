package com.venkatesh.Observer;

public class InformBuyer implements Observer {

	@Override
	public void update() {
		System.out.println("Notification sent to to Buyer about the items");
	}

}
