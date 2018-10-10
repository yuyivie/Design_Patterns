package state;

public class Test {
	public static void main(String[] args) {
		ILift lift = new Lift();
		//电梯的初始条件应该是停止状态
		lift.setState(ILift.STOPPING_STATE);
		
		//首先是电梯开门，人进去
		lift.open();
		//然后电梯关闭
		lift.close();
		//在然后，电梯运行起来，向上或者向下。
		lift.run();
		//最后电梯停下来
		lift.stop();
	}
}
