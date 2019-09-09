package xyz.tmlh.design.structural.decorator;

/**
 *
 * @Author TianXin
 * @Date 2019年9月8日
 */
public class Decorator extends Drink {

    private Drink drick;

    public Decorator(Drink drick) {
        this.drick = drick;
    }

    @Override
    public float cost() {
        return getPrice() + drick.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "  "+ super.getPrice() + "  "+ drick.getDescription();
    }

}
