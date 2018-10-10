package state;

/**
 * @author yu
 *电梯接口
 */
public interface ILift {
	public final static int OPENING_STATE = 1;//敲门状态
	public final static int CLOSING_STATE = 2;//闭门状态
	public final static int RUNING_STATE = 3;//运行状态
	public final static int STOPPING_STATE = 4;//停止状态
	
	//设置电梯的状态
	public void setState(int state);
	//首先电梯门开启动作
	public void open();
	//电梯关闭
	public void close();
	//电梯运行
	public void run();
	//电梯停下来
	public void stop();
	
}
