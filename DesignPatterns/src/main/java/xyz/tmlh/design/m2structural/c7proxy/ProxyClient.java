package xyz.tmlh.design.m2structural.c7proxy;


/**
 * 主要涉及到以下几个核心角色：
 * <p>
 * 抽象主题（Subject）:
 * 定义了真实主题和代理主题的共同接口，这样在任何使用真实主题的地方都可以使用代理主题。
 * <p>
 * 真实主题（Real Subject）:
 * 实现了抽象主题接口，是代理对象所代表的真实对象。客户端直接访问真实主题，但在某些情况下，可以通过代理主题来间接访问。
 * <p>
 * 代理（Proxy）:
 * 实现了抽象主题接口，并持有对真实主题的引用。代理主题通常在真实主题的基础上提供一些额外的功能，例如延迟加载、权限控制、日志记录等。
 * <p>
 * 客户端（Client）:
 * 使用抽象主题接口来操作真实主题或代理主题，不需要知道具体是哪一个实现类。
 */
public class ProxyClient {
    public static void main(String[] args) {
        //步骤 3
        //当被请求时，使用 ProxyImage 来获取 RealImage 类的对象。
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
//创建一个接口。

interface Image {
    void display();
}

//步骤 2
//创建实现接口的实体类。
class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}

class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
