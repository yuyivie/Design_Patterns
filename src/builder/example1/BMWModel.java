package builder.example1;

public class BMWModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("宝马车是这样子启动的。。。。");
	}

	@Override
	protected void stop() {
		System.out.println("宝马车是这样子停止的。。。。");
	}

	@Override
	protected void alarm() {
		System.out.println("宝马车的喇叭是这样子的。。。。");
		
	}

	@Override
	protected void engineBoom() {
		System.out.println("宝马车引擎声是这个样子的。。。。");
	}

}
