package jvm;

/**
 * @author da xiong
 * @date 2018/10/31 16:42
 * @Description:
 */
class Member {}
public class TestClassLoaderDemo {

    public static void main(String[] args) {
        String string = "";
        System.out.println(string.getClass().getClassLoader());
        Member member = new Member();
        System.out.println(member.getClass().getClassLoader());
        System.out.println(member.getClass().getClassLoader().getParent());
        System.out.println(member.getClass().getClassLoader().getParent().getParent());
    }
}
