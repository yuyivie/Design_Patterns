package builder.example1;

import java.util.ArrayList;

/**
 * @author yu
 *车辆模型的抽象类
 */
public abstract class CarModel {
	//这个参数是各个基本方法执行的顺序
	private ArrayList<String> sequence = new ArrayList<>();
	//模型是启动开始跑了。
	protected abstract void start();
	//能发动，那还要能停的下来，那才是真本事。、
	protected abstract void stop();
	//喇叭会出声音，是滴滴叫还是哔哔叫。
	protected abstract void alarm();
	//引擎会隆隆地响，不响那是假的。
	protected abstract void engineBoom();
	//那模型应该会跑吧，别管是人推的还是电力驱动的，总之要会跑，
    final	public void run(){
		//循环一遍，谁在前谁先执行
		for(int i = 0; i<this.sequence.size(); i++){
			String actionName = this.sequence.get(i);
			if(actionName.equalsIgnoreCase("start")){
				this.start();//开启汽车。
			}else if(actionName.equalsIgnoreCase("stop")){
				this.stop();//停止汽车
			}else if(actionName.equalsIgnoreCase("alarm")){
				this.alarm();//喇叭开始叫了。
			}else if(actionName.equalsIgnoreCase("engineBoom")){
				this.engineBoom();//引擎开始轰鸣
			}
		}
	}
    final	public void setSequence(ArrayList<String> arrayList){
		this.sequence = arrayList;
	}
}
