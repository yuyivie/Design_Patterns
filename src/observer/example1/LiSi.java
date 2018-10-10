package observer.example1;

public class LiSi implements ILiSi {

	@Override
	public void update(String context) {
		System.out.println("李斯:观察到韩非子活动，开始向老板汇报");
		this.reportToQiShiHuang(context);
		System.out.println("李斯：汇报完毕。。。\n");
	}
	
	//汇报给秦始皇
	private void reportToQiShiHuang(String reportcontext){
		System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportcontext);
		
	}
}
