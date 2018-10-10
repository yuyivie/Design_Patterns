package state.example1.core;

/**
 * @author yu
 * 上下文类
 */
public class Context {
	//定义出所有的电梯状态 （通常定义为  静态常量）
	public final static LiftState openningState =  new OpenningState();
	public final static LiftState clasingState = new ClosingState();
	public final static LiftState stoppingstate = new StoppingState();
	public final static LiftState runningState = new RunningState();
	
	
	//定义一个当前电梯状态
	private LiftState listState;

	public LiftState getListState() {
		return listState;
	}

	public void setListState(LiftState listState) {
		this.listState = listState;
		//把当前的环境通知到各个实现类中
		this.listState.setContext(this);
	}
	public  void open(){
		this.listState.open();
	}
	public void close(){
		this.listState.close();
	}
	public void run(){
		this.listState.run();
	}
	public void stop(){
		this.listState.stop();
	}
	
}
