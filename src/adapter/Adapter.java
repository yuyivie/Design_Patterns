package adapter;


/**
 * @author yu
 *��������ɫ�����Ľ�ɫ��
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void request() {
		super.doSomething();
	}
	
}
