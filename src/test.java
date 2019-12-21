import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

/**
 * @author da xiong
 * @date 2019/9/11 09:31
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1,2,3,4);
        Collections.reverse(list);
        System.out.println(list);
//        System.out.println(get(0));
//        System.out.println(get(1));
    }

    public static String get(int value) {
        try{
            System.out.println("try……");
            int result = 1 / value;
            return "111";
        } catch (Exception e) {
            System.out.println("catch……");
            return "444";
        } finally {
            System.out.println("finally……");
            return "333";
        }
    }



}
