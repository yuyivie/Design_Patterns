package proxy.dynamlc.example2;

import proxy.dynamlc.example1.RealSubject;
import proxy.dynamlc.example1.Subject;


//�����չ�󣬸߲�ģ��Դ���ķ��ʻ���Ӽ򵥡�
public class Test {
	public static void main(String[] args) {
		//����һ������
		Subject subject = new RealSubject();
		//��������Ĵ���
		Subject proxy =  SubjectDynamicProxy.newProxyInstance(subject);
		proxy.doSomething("Finiss");
	}
}
