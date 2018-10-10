package proxy.dynamlc.example2;

import proxy.dynamlc.example1.RealSubject;
import proxy.dynamlc.example1.Subject;


//如此扩展后，高层模块对代理的访问会更加简单。
public class Test {
	public static void main(String[] args) {
		//定义一个主题
		Subject subject = new RealSubject();
		//定义主题的代理
		Subject proxy =  SubjectDynamicProxy.newProxyInstance(subject);
		proxy.doSomething("Finiss");
	}
}
