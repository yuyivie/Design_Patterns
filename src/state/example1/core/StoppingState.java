package state.example1.core;

public class StoppingState extends LiftState {

	//停止状态是可以开门的
	@Override
	public void open() {
		super.context.setListState(Context.openningState);//设置状态为开门
		super.context.getListState().open();
	}
	//停止状态关门？门本来就是关着的
	@Override
	public void close() {
		//do nothing
	}
	//停止状态在运行  正常的很
	@Override
	public void run() {
		super.context.setListState(Context.runningState);//设置状态为运行
		super.context.getListState().run();
	}
	//电梯原本就是停止的  所以什么都不用做。
	@Override
	public void stop() {
		System.out.println("电梯停止运行。。。。");

	}

}
