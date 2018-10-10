package observer.example1.core;

public class LiSi  implements Observer{
	//首先李斯是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报
	public void update(String str){
		System.out.println("李斯：观察到韩非子活动，就开始向老板汇报");
		this.reportToQinShihuang(str);
	}
	//汇报给秦始皇
	private void reportToQinShihuang(String reportContext){
		System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportContext);
	}
}
