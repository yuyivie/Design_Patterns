package builder.example1;

public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("奔驰车跑起来是这样的。。");

	}

	@Override
	protected void stop() {
		System.out.println("奔驰车是这样子停车的。。。。");

	}

	@Override
	protected void alarm() {
		System.out.println("奔驰车的喇叭是这样子的。。。。");
	}

	@Override
	protected void engineBoom() {
		System.out.println("奔驰车的引擎声是这样子的。。。。。。");
	}

}
