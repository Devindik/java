package design.pattern.kkb.proxy;

public class UserServiceImpl implements UserService {

	@Override
	public void saveUser() {
		System.out.println("添加用户");
	}

}
