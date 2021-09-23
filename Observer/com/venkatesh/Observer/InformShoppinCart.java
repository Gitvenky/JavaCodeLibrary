package com.venkatesh.Observer;

public class InformShoppinCart implements Observer {

	@Override
	public void update() {
		System.out.println("Notification sent to to Shopping Cart about the items");
	}

}
