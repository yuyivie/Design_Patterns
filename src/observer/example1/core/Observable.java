package observer.example1.core;

/**
 * @author yu
 *被观察者接口
 *这是一个通用的被观察者接口，所有的被观察者都可以实现这个接口。
 */
public interface Observable {
	
	//增加一个观察者
	public void addObserver(Observer observer);
	//删除一个观察者
	public void deleteObserver(Observer observer);
	//既然要观察，我发生改变了他也应该有所动作，通知观察者
	public void notifyObservers(String context);
	
}
