package xyz.tmlh.design.structural.bridge;

/** 
 *
 * @Author TianXin 
 * @Date 2019年9月2日 
 */
public abstract class Phone {
    
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }
    
    public void open() {
        brand.open();
        
    }
    public void close() {
        brand.close();
        
    }
    public void call() {
        brand.call();
    }
    
    
}
