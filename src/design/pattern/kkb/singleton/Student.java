package design.pattern.kkb.singleton;
//需要单例实现的一个类
/**
 * 单例模式
 * 
 * 		同时在内存中，只有一个对象存在。
 * 
 * 如何保证一个类在内存中只能有一个实例呢？
 * 		1：构造私有
 * 		2：使用私有静态成员变量初始化本身对象
 * 		3：对外提供静态公共方法获取本身对象
 * 
 * 
 * 单例模式有两种实现方式：
 * 		1：懒汉式
 * 		2：饿汉式
 * 
 * Student类的单例实现是采用饿汉式去实现的
 * 
 * @author 怡吾宇
 *
 */
public class Student {

	//2：成员变量初始化本身对象
	private static Student student = new Student();
	
	//构造私有
	private Student(){}
	
	//3：对外提供公共方法获取对象
	public static Student getStudent(){
		return student;
	}
	
	public void sayHello(String name){
		System.out.println("hello,"+name);
	}
}
