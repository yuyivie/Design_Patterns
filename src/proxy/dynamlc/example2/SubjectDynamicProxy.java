package proxy.dynamlc.example2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import proxy.dynamlc.example1.DynamicProxy;
import proxy.dynamlc.example1.MyInvocationHandler;
import proxy.dynamlc.example1.Subject;

public class SubjectDynamicProxy<T> extends DynamicProxy<T> {
	
	public static<T> T newProxyInstance(Subject subject){
		ClassLoader loader = subject.getClass().getClassLoader();
		Class<?>[]classer = subject.getClass().getInterfaces();
		InvocationHandler handler = new MyInvocationHandler(subject);
		return newProxyInstance(loader, classer, handler);
	}
}
