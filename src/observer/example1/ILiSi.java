package observer.example1;

/**
 * @author yu
 *抽象观察者
 */
public interface ILiSi {
	//一发现别人有动静，自己也要行动起来。
	public void update(String context);
}
