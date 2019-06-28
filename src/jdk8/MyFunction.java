package jdk8;


import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author da xiong
 * @date 2018/11/1 22:53
 * @Description:
 */
public class MyFunction {
    /**
     *
     * @param <F> 传值类型
     * @param <T> 结果类型
     */
    @FunctionalInterface
    interface Fun<F,T> {
        T run(F from);
    }
    public static String myMethod(String arg){
        return arg;
    }

    public MyFunction(String arg){
        System.out.println(arg);
    }

    @FunctionalInterface
    interface mainFactory<M extends MyFunction>{
        M run(String arg);
    }


    public interface Food {
        enum Coffee implements Food{
            BLACK_COFFEE,DECAF_COFFEE,LATTE,CAPPUCCINO
        }
        enum Dessert implements Food{
            FRUIT, CAKE, GELATO
        }
    }

    public static void main(String[] args) {
        Fun<String, String> fun = MyFunction::myMethod;
        String result = fun.run("1111");
        System.out.println(result);

        mainFactory<MyFunction> mainFun = MyFunction::new;
        mainFun.run("Creating");
//        Map map = Collections.synchronizedMap(Maps.newHashMap());
        List<Integer> list = Lists.newArrayList();
        Map<String,Integer> hashMap = Maps.newHashMap();
        ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();
        HashMap<Integer ,Integer> map = Maps.newHashMap();
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey()+entry.getValue());
        }

        for (Integer key:map.keySet()) {
            System.out.println(key);
        }
        for (Integer value:map.values()) {
            System.out.println(value);
        }



    }

 }
