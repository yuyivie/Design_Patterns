package observer.example1;

/**
 * @author yu
 * 第二种方式的 韩非子  （直接把lisi聚集进来）
 */
public class HanFeiZi2 implements IHanFeiZi{
	//把李斯声明出来
	private ILiSi liSi = new LiSi();
	
	//韩非子要吃饭了。
	@Override
	public void haveBreakfast() {
		System.out.println("韩非子：开始吃饭了。。。。");
		//通知李斯
		this.liSi.update("韩非子在吃饭。。。");
	}

	@Override
	public void haveFun() {
		System.out.println("韩非子：开始娱乐了。。。。");
		this.liSi.update("韩非子在娱乐");
	}
	
}
