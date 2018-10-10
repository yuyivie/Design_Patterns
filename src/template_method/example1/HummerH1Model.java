package template_method.example1;

public class HummerH1Model extends HummerModel {
	
	private boolean alarmFlag = true;//要响喇叭
	
	
	//汽车发动
	@Override
	public void start() {
		System.out.println("悍马H1发动。。。。");

	}

	@Override
	public void stop() {
		System.out.println("悍马H1停车。。。。");

	}

	@Override
	public void alarm() {
		System.out.println("悍马H1鸣笛");

	}

	@Override
	public void engineBoom() {
		System.out.println("悍马H1的引擎声是这样的。。");
	}

	/*//开动起来
	@Override
	public void run() {
		//先发动汽车
		this.start();
		//引擎开始轰鸣
		this.engineBoom();
		//然后就开始跑了，跑的过程中遇到挡路狗，就按喇叭。
		this.alarm();
		//到达目的地停车
		 this.start();
	}*/
	
	protected boolean isAlarm(){
		return this.alarmFlag;
	}
	
	//要不要响喇叭，是有客户来决定的。
	public void setArarm(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}

}
