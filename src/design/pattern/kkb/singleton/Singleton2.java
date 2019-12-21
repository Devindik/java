package design.pattern.kkb.singleton;

/**
 * @author da xiong
 * @date 2019/12/21 15:56
 * @Description:
 * 饿汉式（静态代码块）[可用]
 * 这种方式跟Singleton1方式其实类似，只不过将类实例化的过程放在了静态代码块中，
 * 也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
 */
public class Singleton2 {
    private static Singleton2 instance;
    static {
        instance = new Singleton2();
    }
    private Singleton2() {}
    public static Singleton2 getInstance() {
        return instance;
    }

}
