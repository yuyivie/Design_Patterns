package observer;

/**
 * @author yu
 *����ı��۲���
 */
public class ConcreteSubject extends Subject{
	//�����ҵ��
	public void doSomething(){
		/*
		 * do  something
		 */
		super.notifyObservers();
	}
}
