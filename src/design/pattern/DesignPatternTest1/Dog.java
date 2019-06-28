package design.pattern.DesignPatternTest1;

/**
 * @author da xiong
 * @date 2018/8/5 23:30
 * @Description:
 */
public class Dog extends Animal{
    @Override
    public String makeSound() {
        return bark();
    };

    private String bark() {
        return "wangwangwang!";
    };
}
