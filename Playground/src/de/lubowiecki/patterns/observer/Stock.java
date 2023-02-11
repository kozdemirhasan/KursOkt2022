package de.lubowiecki.patterns.observer;

import java.util.Observable;

public class Stock extends Observable {
	
	private final String name;
	
	private double price;

	public Stock(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public void changePrice(double percent) {
		price = price + (price * percent);
		System.out.printf("%s: Neuer Preis %.3f \n", name, price);
 		setChanged();
 		notifyObservers();
	}
}
