package jdk8;

/**
 * @author da xiong
 * @date 2018/11/1 10:43
 * @Description:
 */
public interface MyCompute {
    default int sum(int i, int j) {
        return i+j;
    }

    int subtraction(int i, int j);

    static void main(String[] args) {
        MyCompute c = new MyCompute() {
            @Override
            public int subtraction(int i, int j) {
                return i-j;
            }
        };

        System.out.println(c.sum(1,2));

        System.out.println(c.subtraction(1,2));

    }
}
