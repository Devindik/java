package design.pattern.kkb.singleton;

/**
 * @author da xiong
 * @date 2018/6/15 17:38
 */
public class NormalSingleton {
    private NormalSingleton () {};
    private static NormalSingleton normalSingleton;
    public static NormalSingleton getInstance() {
        if (normalSingleton != null) {
            normalSingleton = new NormalSingleton();
        }
        return normalSingleton;
    }
}
