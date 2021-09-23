package com.venkatesh.Observer.Application;

import java.util.ArrayList;
import java.util.List;

import com.venkatesh.Observer.InformBuyer;
import com.venkatesh.Observer.InformSeller;
import com.venkatesh.Observer.InformShoppinCart;
import com.venkatesh.Observer.Observer;
import com.venkatesh.subject.ShippedProcess;

public class Application {

	

	public static void main(String[] args) {


		ShippedProcess onShipFormalities = new ShippedProcess();

		
		//Adding one Observers
		var buyer = new InformBuyer();
		var seller = new InformSeller();
		var shopper = new InformShoppinCart();
		var seller1 = new InformSeller();
		
		onShipFormalities.addObserver(buyer);
		onShipFormalities.addObserver(seller);		
		onShipFormalities.addObserver(shopper);
		
		onShipFormalities.addObserver(seller1);		
		onShipFormalities.removeObserver(seller1);
		
		
		onShipFormalities.updateObservers();
		
		
		
	}

}
