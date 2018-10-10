package proxy.dynamlc.example1;

import java.lang.reflect.InvocationHandler;


public class Test {
	public static void main(String[] args) {
		//����һ������
		Subject subject = new RealSubject();
		//����һ��Handler
		InvocationHandler handler = new MyInvocationHandler(subject);
		//��������Ĵ���
		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
		proxy.doSomething("Finish");
	}
	
}
