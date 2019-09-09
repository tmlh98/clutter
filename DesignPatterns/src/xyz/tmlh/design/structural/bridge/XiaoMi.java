package xyz.tmlh.design.structural.bridge;

/** 
 *
 * @Author TianXin 
 * @Date 2019年9月2日 
 */
public class XiaoMi implements Brand{

    /* (非 Javadoc) 
     * <p>Title: open</p> 
     * <p>Description: </p>  
     * @see xyz.tmlh.design.structural.bridge.Brand#open() 
     */ 
    @Override
    public void open() {
        System.out.println(getClass().getSimpleName() + "open()");
    }

    /* (非 Javadoc) 
     * <p>Title: close</p> 
     * <p>Description: </p>  
     * @see xyz.tmlh.design.structural.bridge.Brand#close() 
     */ 
    @Override
    public void close() {
        
        System.out.println(getClass().getSimpleName() + "close()");
    }

    /* (非 Javadoc) 
     * <p>Title: call</p> 
     * <p>Description: </p>  
     * @see xyz.tmlh.design.structural.bridge.Brand#call() 
     */ 
    @Override
    public void call() {
        
        System.out.println(getClass().getSimpleName() + "call()");
    }

}
