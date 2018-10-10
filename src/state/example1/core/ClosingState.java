package state.example1.core;

public class ClosingState extends LiftState {
	
	//电梯门是关的 要打开
	@Override
	public void open() {
		super.context.setListState(Context.openningState);//设置为开门状态
		super.context.getListState().open();
	}

	@Override
	public void close() {
		System.out.println("电梯门关闭。。。。。");
	}
	
	//电梯门关了 在运行 这是再正常不过的了
	@Override
	public void run() {
		super.context.setListState(Context.runningState);//设置为运行状态
		super.context.getListState().run();
	}

	@Override
	public void stop() {
		super.context.setListState(Context.stoppingstate);//设置为停止状态
		super.context.getListState().stop();
	}

}
