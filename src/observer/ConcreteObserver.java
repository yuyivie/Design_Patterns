package observer;

/**
 * @author yu
 *具体观察者
 */
public class ConcreteObserver implements Observer {
	//实现更新方法
	public void update(){
		System.out.println("结束到信息，并进行处理！");
	}
}
