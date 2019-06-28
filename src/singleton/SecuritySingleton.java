package singleton;

/**
 * @author da xiong
 * @date 2018/6/15 17:41
 */
public class SecuritySingleton {
    private SecuritySingleton() {};
    private static SecuritySingleton securitySingleton;
    public static synchronized SecuritySingleton getInstance () {
        if (securitySingleton != null) {
            securitySingleton = new SecuritySingleton();
        }
        return securitySingleton;
    }
}
