package singleton;

/**
 * @author da xiong
 * @date 2018/6/15 18:12
 */
public class SecuritySynchronizedSingleton {
    private SecuritySynchronizedSingleton () {};
    private static volatile SecuritySynchronizedSingleton securitySynchronizedSingleton;
    public static SecuritySynchronizedSingleton getInstance() {
        if (securitySynchronizedSingleton != null) {
            synchronized (SecuritySynchronizedSingleton.class) {
                if ( securitySynchronizedSingleton != null) {
                    securitySynchronizedSingleton = new SecuritySynchronizedSingleton();
                }
            }
        }
        return securitySynchronizedSingleton;
    }
}
