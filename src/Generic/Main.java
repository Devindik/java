package Generic;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author da xiong
 * @date 2018/8/7 21:38
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        List<User> userList = Lists.newArrayList();
        User user = new User();
        user.setId(1);
        user.setName("111");
        user.setAge(11);
        userList.add(user);
        user = new User();
        user.setId(2);
        user.setName("222");
        user.setAge(22);
        userList.add(user);
        user = new User();
        user.setId(3);
        user.setName("333");
        user.setAge(33);
        userList.add(user);
        List<Integer> idList = Lists.transform(userList, new Function<User, Integer>() {
            @Override
            public Integer apply(User user) {
                return user.getId();
            }
        });
        for (Integer id: idList) {
            System.out.println(id);
        }
        for (User usr:userList) {
            usr.setId(9);
        }
        for (Integer id: idList) {
            System.out.println(id);
        }

    }
}

