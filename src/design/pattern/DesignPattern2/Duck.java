package design.pattern.DesignPattern2;

import design.pattern.DesignPattern1.FlyBehavior;
import design.pattern.DesignPattern1.QuackBehavior;

/**
 * @author da xiong
 * @date 2018/8/5 23:57
 * @Description:
 */
public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    void performQuack(){
        quackBehavior.quack();
    };
    void swim(){};
    void display(){};
    void performFly(){
        flyBehavior.fly();
    };
}
