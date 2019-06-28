package design.pattern.DesignPattern1;

/**
 * @author da xiong
 * @date 2018/8/5 23:51
 * @Description:
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public String quack() {
        return "no sound!";
    }
}
