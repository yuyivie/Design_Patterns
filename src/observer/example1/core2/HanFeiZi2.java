package observer.example1.core2;

import java.util.Observable;

import observer.example1.IHanFeiZi;

/**
 * @author yu
 *进一步优化后的 被观察者  注意：使用的是java自带的 java.util.Observable
 */
public class HanFeiZi2 extends Observable implements IHanFeiZi{

	@Override
	public void haveBreakfast() {
		System.out.println("韩非子：开始吃饭了。。。。");
		//通知所有观察者
		super.setChanged();
		super.notifyObservers("韩非子在吃饭");
	}

	@Override
	public void haveFun() {
		System.out.println("韩非子：开始娱乐了。。。。。");
		super.setChanged();
		super.notifyObservers("韩非子在娱乐。。");
	}

}
