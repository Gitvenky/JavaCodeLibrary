package com.venkatesh.subject;

import java.util.ArrayList;
import java.util.List;

import com.venkatesh.Observer.Observer;


public class ShippedProcess {
	
	List<Observer> observers ;
	
	public ShippedProcess(){
		 observers = new ArrayList<>();
		
	}
	
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		System.out.println("the list of the observers is " + observers);
		observers.remove(observer);
	}
	
	public void updateObservers() {
		for(Observer observer : observers) {
			observer.update();
		}
	}

}
