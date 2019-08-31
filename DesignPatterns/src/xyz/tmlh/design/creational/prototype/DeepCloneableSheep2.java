package xyz.tmlh.design.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

//克隆羊（深拷贝） 方式2，推荐使用
/*
 * 利用序列化和反序列化技术实现深克隆
 */
public class DeepCloneableSheep2 implements Serializable{

    private static final long serialVersionUID = -4241266417207673978L;
    private String name;
    private String color;
    
    // friend对象不会克隆，而是将对象指针指向source对象的地址
    private Date date;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    @Override
    public String toString() {
        return "DeepCloneableSheep2 [name=" + name + ", color=" + color + ", date=" + date + "]";
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
    
    public DeepCloneableSheep2 deepClone() {
        ByteArrayOutputStream baos = null;
        ByteArrayInputStream bais = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(this);//序列化
            
            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            return (DeepCloneableSheep2)ois.readObject();//反序列化
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bais.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
        
    }
}
