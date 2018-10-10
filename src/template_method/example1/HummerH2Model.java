package template_method.example1;

public class HummerH2Model extends HummerModel{

	@Override
	public void start() {
		System.out.println("悍马H2发动。。。。");
		
	}

	@Override
	public void stop() {
		System.out.println("悍马H2停车。。。。");
		
	}

	@Override
	public void alarm() {
		System.out.println("悍马H2鸣笛。。。。");
		
	}

	@Override
	public void engineBoom() {
		System.out.println("悍马H2引擎声是这样的。。。");
		
	}

	/*@Override
	public void run() {
		//发动汽车
		this.start();
		//引擎开始轰鸣
		this.engineBoom();
		//然后就开始跑了  过程中遇到一条挡路狗   就鸣笛
		this.alarm();
		//到达目的地停车。
		this.stop();
		
	}*/
	
	//默认是没有喇叭的。
	protected boolean isAlarm(){
		return false;
	}
}
