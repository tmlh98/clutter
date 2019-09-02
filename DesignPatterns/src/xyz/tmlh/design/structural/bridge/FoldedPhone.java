package xyz.tmlh.design.structural.bridge;

/**
 *
 * @Author TianXin
 * @Date 2019年9月2日
 */
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public void close() {
        super.close();
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public void call() {
        super.call();
        System.out.println(getClass().getSimpleName());
    }
}
