package state.example1.core;

/**
 * @author yu
 *敞门状态
 */
public class OpenningState extends LiftState {
	//打开电梯门
	@Override
	public void open() {
		System.out.println("电梯门开启。。。。。");
	}
	//可以关闭
	@Override
	public void close() {
		//状态修改
		super.context.setListState(Context.clasingState);
		//动作委托为CloseState来执行
		super.context.getListState().close();
	}
	
	@Override
	public void run() {
		//do nothing

	}

	@Override
	public void stop() {
		//do nothing

	}

}
