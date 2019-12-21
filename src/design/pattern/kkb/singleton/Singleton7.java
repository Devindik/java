package design.pattern.kkb.singleton;

/**
 * @author da xiong
 * @date 2019/12/21 17:04
 * @Description:
 * 饿汉式单例类不能实现延迟加载，不管将来用不用始终占据内存；懒汉式单例类线程安全控制烦琐，而且性能受影响。
 * 可见，无论是饿汉式单例还是懒汉式单例都存在这样那样的问题，有没有一种方法，能够将两种单例的缺点都克服，而将两者的优点合二为一呢？
 * 答案是：Yes！下面我们来学习这种更好的被称之为Initialization on Demand Holder (IoDH)的技术。
 * 在IoDH中，我们在单例类中增加一个静态(static)内部类，在该内部类中创建单例对象，再将该单例对象通过getInstance()方法返回给外部使用
 *
 * 由于静态单例对象没有作为Singleton的成员变量直接实例化，因此类加载时不会实例化Singleton，
 * 第一次调用getInstance()SingletonInstance，在该内部类中定义了一个static类型的变量instance，此时会首先初始化这个成员变量，
 * 由Java虚拟机来保证其线程安全性，确保该成员变量只能初始化一次。由于getInstance()方法没有任何线程锁定，因此其性能不会造成任何影响。
 * 通过使用IoDH，我们既可以实现延迟加载，又可以保证线程安全，不影响系统性能，不失为一种最好的Java语言单例模式实现方式
 * （其缺点是与编程语言本身的特性相关，很多面向对象语言不支持IoDH）
 * 但IoDH如果初始化失败会导致单例类不可用。也就是说，IoDH这种实现方式只能用于能保证初始化不会失败的情况。
 */
public class Singleton7 {
    private Singleton7(){}
//    private Singleton7() {
//        int i = 1 / 0;
//    }
    private static class SingletonInstance {
        private static final Singleton7 instance = new Singleton7();
    }
    public static Singleton7 getInstance(){
        return SingletonInstance.instance;
    }

}
