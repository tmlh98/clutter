package xyz.tmlh.design.structural.decorator;
public class DeCaf extends Coffee {

	public DeCaf() {
		setDescription(getClass().getSimpleName());
		setPrice(1.0f);
	}
}
