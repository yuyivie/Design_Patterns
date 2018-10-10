package observer.example1;

import java.awt.List;

/**
 * @author yu
 *具体的被观察者
 */
public class HanFeiZi implements IHanFeiZi {
	
	
	//韩非子是否在吃饭，作为监控的判断标准
	private  boolean isHanvingBreakfast = false;
	//韩非子是否在娱乐
	private boolean isHavingFun = false;
	
	//韩非子要吃饭了。
	@Override
 	public void haveBreakfast() {
		System.out.println("韩非子：开始吃饭了。。。");
		this.isHanvingBreakfast = true;

	}
	//韩非子要娱乐了。
	@Override
	public void haveFun() {
		System.out.println("韩非子：开始娱乐了。。。。");
		this.isHavingFun = true;
	}
	
	//以下是bean的基本方法。getter/setter 不多说了。
	public boolean isHanvingBreakfast() {
		return isHanvingBreakfast;
	}
	public void setHanvingBreakfast(boolean isHanvingBreakfast) {
		this.isHanvingBreakfast = isHanvingBreakfast;
	}
	public boolean isHavingFun() {
		return isHavingFun;
	}
	public void setHavingFun(boolean isHavingFun) {
		this.isHavingFun = isHavingFun;
	}
	

	

}
