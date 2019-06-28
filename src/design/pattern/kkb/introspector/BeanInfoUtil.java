package design.pattern.kkb.introspector;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * @author da xiong
 * @date 2018/9/21 16:56
 * @Description:
 */
public class BeanInfoUtil {

    public static void setProperty(User user, String name) throws Exception {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(name, User.class);
        Method methodSetName = propertyDescriptor.getWriteMethod();
        methodSetName.invoke(user, "1111");
        System.out.println("User set name: "+user.getName());
    }

    public static void getProperty(User user, String name) throws Exception {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(name, User.class);
        Method methodGetName = propertyDescriptor.getReadMethod();
        Object objectName = methodGetName.invoke(user);
        System.out.println("User get name:"+objectName.toString());
    }

    public static void setPropertyByIntrospector(User user, String name) throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(User.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        if (propertyDescriptors != null && propertyDescriptors.length > 0) {
            for (PropertyDescriptor propertyDescriptor: propertyDescriptors) {
                if (propertyDescriptor.getName().equals(name)) {
                    Method methodSetName = propertyDescriptor.getWriteMethod();
                    methodSetName.invoke(user,"2222");
                    System.out.println("Set Name:"+methodSetName.toString());
                    break;
                }
            }
        }
    }

    public static void getPropertyByIntrospector(User user, String name) throws Exception {
        BeanInfo beanInfo = Introspector.getBeanInfo(User.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        if (propertyDescriptors != null && propertyDescriptors.length > 0) {
            for (PropertyDescriptor propertyDescriptor: propertyDescriptors) {
                if (propertyDescriptor.getName().equals(name)) {
                    Method methodGetName = propertyDescriptor.getReadMethod();
                    Object objectName = methodGetName.invoke(user);
                    System.out.println("Get Name:"+objectName.toString());
                    break;
                }
            }
        }

    }

}
