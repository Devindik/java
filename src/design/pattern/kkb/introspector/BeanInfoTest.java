package design.pattern.kkb.introspector;

/**
 * @author da xiong
 * @date 2018/9/26 11:56
 * @Description:
 */
public class BeanInfoTest {
    public static void main(String[] args) throws Exception{
        User user = new User();
        user.setName("test");
        BeanInfoUtil.getProperty(user, "name");
        BeanInfoUtil.setProperty(user,"name");

    }
}
