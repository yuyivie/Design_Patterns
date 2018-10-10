package Mediator.example2;

/**
 * @author yu
 *
 * 类描述：修改后的采购管理
 * 创建日期：2016-5-16
 *
 */
public class Purchase  extends AbstractColleague{

	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}
	//采购IBM电脑
	public  void buyIBMcomputer(int number){
		super.mediator.execute("purchase.buy", number);
		System.out.println("采购IBM电脑--" + number + "台");
	}
	
	//不再采购IBM电脑
	public void refuseBuyIBM(){
		System.out.println("不再采购IBM电脑");
	}
	
	
}
