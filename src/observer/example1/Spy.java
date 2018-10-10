package observer.example1;

public class Spy extends Thread {
	private HanFeiZi hanFeiZi;
	private LiSi liSi;
	private String type;
	//通过构造函数传递参数，我要监控的是谁，谁来监控，要监控什么。
	public Spy(HanFeiZi hanFeiZi,LiSi liSi,String type){
		this.hanFeiZi = hanFeiZi;
		this.liSi = liSi;
		this.type = type;
	}
	@Override
	public void run() {
		while(true){
			if(this.type.equals("breakfast")){//监控是否在吃早餐
				//如果发现韩非子在吃饭，就通知李斯
				if(this.hanFeiZi.isHanvingBreakfast()){
					this.liSi.update("韩非子在吃饭");
					//重置状态，继续监控
					this.hanFeiZi.setHanvingBreakfast(false);
				}else {//监控是否在娱乐
					if(this.hanFeiZi.isHavingFun()){
						this.liSi.update("韩非子在娱乐");
						this.hanFeiZi.setHavingFun(false);
					}
				}
			}
		}
	}
}
