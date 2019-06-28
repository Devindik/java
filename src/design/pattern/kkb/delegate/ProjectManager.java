package design.pattern.kkb.delegate;

//委托人
public class ProjectManager {
	
	//受托人
	private Developer delegate = new Developer();

	public void doSomething() {
		//根据需求，将实际工作派发给开发人员或者其他人员
		delegate.development();
	}
}
