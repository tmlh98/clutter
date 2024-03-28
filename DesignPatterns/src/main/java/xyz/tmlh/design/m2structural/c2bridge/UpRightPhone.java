package xyz.tmlh.design.m2structural.c2bridge;

/** 
 *
 * @Author TianXin 
 * @Date 2019年9月2日 
 */
public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
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
