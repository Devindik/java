package design.pattern.DesignPattern1;

/**
 * @author da xiong
 * @date 2018/8/5 23:48
 * @Description:
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        return "can't fly";
    }
}
