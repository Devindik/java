package design.pattern.DesignPatternTest1;

/**
 * @author da xiong
 * @date 2018/8/5 23:31
 * @Description:
 */
public class Cat extends Animal{

    @Override
    public String makeSound() {
        return meow();
    }

    private String meow() {
        return "miaomiaomiao!";
    }
}
