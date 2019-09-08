package xyz.tmlh.design.structural.decorator;

//具体的Decorator， 这里就是调味品
public class Chocolate extends Decorator {

	public Chocolate(Drink obj) {
		super(obj);
		setDescription(getClass().getSimpleName());
		setPrice(3.0f); // 调味品 的价格
	}

}
