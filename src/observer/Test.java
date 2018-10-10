package observer;

/**
 * @author yu
 *observer pattern 观察者模式，
 *也叫订阅模式，他是一个在项目中经常使用的模式，
 *
 *定义对象间一种一对多的依赖关系，是的每当一个对象改变状态，则所有依赖于他的对象都会得到通知并被自动更新
 *
 */
public class Test {
	public static void main(String[] args) {
		//创建一个被观察者
		ConcreteSubject sub = new ConcreteSubject();
		//定义一个观察者
		Observer obs = new ConcreteObserver();
		//观察者观察被观察者
		sub.addObserver(obs);
		//被观察者开始活动了
		sub.doSomething();
	}
	
	
}
