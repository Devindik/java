package design.pattern.DesignPattern2;

import design.pattern.DesignPattern1.FlyWithWings;
import design.pattern.DesignPattern1.Quack;

/**
 * @author da xiong
 * @date 2018/8/6 00:00
 * @Description:
 */
public class MallardDuck extends Duck {
    public MallardDuck () {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display () {
        System.out.print("MallardDuck!");
    }
}
