package design.pattern.kkb.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 主要作用就是生成代理类
 * 使用CGLib动态代理技术实现 它是基于继承的方式实现的
 * @author think
 *
 */
public class CgLibProxyFactory implements MethodInterceptor{


	/**
	 * @param clazz
	 * @return
	 */
	public Object getProxyByCgLib(Class clazz) {

		// 创建增强器
		Enhancer enhancer = new Enhancer();
		// 设置需要增强的类的类对象
		enhancer.setSuperclass(clazz);

		// 设置回调函数
		enhancer.setCallback(this);

		// 获取增强之后的代理对象
		return enhancer.create();
	}

	/***
	 * Object proxy:这是代理对象，也就是[目标对象]的子类
	 * Method method:[目标对象]的方法
	 * Object[] arg:参数
	 * MethodProxy methodProxy：代理对象的方法
	 */
	@Override
	public Object intercept(Object proxy, Method method, Object[] arg, MethodProxy methodProxy)
			throws Throwable {
		// 因为代理对象是目标对象的子类
		// 该行代码，实际调用的是目标对象的方法
		// object :代理对象
		// 父类目标对象，调用父类目标对象中的方法
		System.out.println("这是cglib的代理方法");
		
		// 调用[目标对象]的方法
		Object returnValue = methodProxy.invokeSuper(proxy, arg);
		return returnValue;
	}
}
