package state.example1.core;

public class RunningState extends LiftState {

	//运行的时候开电梯门？ 你疯了，电梯是不会给你开的
	@Override
	public void open() {
		System.out.println("RUnningState---->Open" );
		//do nothing
	}

	//运行中电梯门肯定是关的。
	@Override
	public void close() {
		//do nothing
	}

	//这是在运行状态要实现的方法
	@Override
	public void run() {
		System.out.println("电梯上下运行。。。。。");
	}
	
	//让运行中的电梯停止
	@Override
	public void stop() {
		super.context.setListState(Context.stoppingstate);
		super.context.getListState().stop();
	}

}
