package design.pattern.kkb.singleton;

public class Student2 {

	/* 私有构造方法，防止被实例化 */
	private Student2() {
	}

	/* 此处使用一个内部类来维护单例 
	 * JVM在类加载的时候，是互斥的，所以可以由此保证线程安全问题 
	*/
	private static class Student2Factory {
		private static Student2 instance = new Student2();
	}

	/* 获取实例 */
	public static Student2 getInstance() {
		return Student2Factory.instance;
	}

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {
		return getInstance();
	}
}
