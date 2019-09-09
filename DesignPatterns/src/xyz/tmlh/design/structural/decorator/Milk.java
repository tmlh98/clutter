package xyz.tmlh.design.structural.decorator;

public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		setDescription(getClass().getSimpleName());
		setPrice(2.0f); 
	}

}