package observer;

/**
 * @author yu
 *observer pattern �۲���ģʽ��
 *Ҳ�ж���ģʽ������һ������Ŀ�о���ʹ�õ�ģʽ��
 *
 *��������һ��һ�Զ��������ϵ���ǵ�ÿ��һ������ı�״̬�����������������Ķ��󶼻�õ�֪ͨ�����Զ�����
 *
 */
public class Test {
	public static void main(String[] args) {
		//����һ�����۲���
		ConcreteSubject sub = new ConcreteSubject();
		//����һ���۲���
		Observer obs = new ConcreteObserver();
		//�۲��߹۲챻�۲���
		sub.addObserver(obs);
		//���۲��߿�ʼ���
		sub.doSomething();
	}
	
	
}
