package com.venkatesh.Observer;

public class InformSeller implements Observer {

	@Override
	public void update() {
		System.out.println("Notification sent to to Seller about the items");
	}

}
