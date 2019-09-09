package xyz.tmlh.design.structural.bridge;

/** 
 *
 * @Author TianXin 
 * @Date 2019年9月2日 
 */
public class Client {

    public static void main(String[] args) {
        FoldedPhone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.close();
        phone.call();
        System.out.println("----------------------------");
        UpRightPhone phone2 = new UpRightPhone(new Vivo());
        phone2.close();
    }
}
