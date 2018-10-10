package observer.example1;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		//定义出韩非子和李斯
		LiSi liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		//观察早餐
		Spy spyBreakfast = new Spy(hanFeiZi, liSi, "breakfast");
		//开始启动线程，监控
		spyBreakfast.start();
		//观察娱乐情况
		Spy spyFun = new Spy(hanFeiZi, liSi, "fun");
		spyFun.start();
		//然后看看韩非子在干什么。
		Thread.sleep(1000);//主线程等待一秒在往下执行
		hanFeiZi.haveBreakfast();
		Thread.sleep(1000);
		hanFeiZi.haveFun();
		
	}
}
