package design.pattern.singleton;

/**
 * @author da xiong
 * @date 2018/6/15 17:46
 */
public class SecurityStaticSingleton {
    private  SecurityStaticSingleton () {};
    private static final SecurityStaticSingleton securityStaticSingleton = new SecurityStaticSingleton();
    public static SecurityStaticSingleton getInstance () {
        return securityStaticSingleton;
    }
}
