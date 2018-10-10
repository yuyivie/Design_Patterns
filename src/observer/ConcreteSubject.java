package observer;

/**
 * @author yu
 *具体的被观察者
 */
public class ConcreteSubject extends Subject{
	//具体的业务
	public void doSomething(){
		/*
		 * do  something
		 */
		super.notifyObservers();
	}
}
