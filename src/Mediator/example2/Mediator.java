package Mediator.example2;

/**
 * @author yu
 *
 * 类描述：具体中介者
 * 创建日期：2016-5-16
 *
 */
public class Mediator  extends AbstractMediator{
	//中介者最重要的方法
	@Override
	public void execute(String str, Object... objects) {
		if(str.equals("purchase.buy")){//采购电脑
			this.buyComputer((Integer)objects[0]);
		}else if(str.equals("sale.sell")){//销售电脑
			this.sellComputer((Integer)objects[0]);
		}else if(str.equals("stock.clear")){//清仓处理
			this.clearStock();
		}else if(str.equals("sale.offsell")){//折价销售
			this.offSell();
		}
	}
	//采购电脑
	private void buyComputer(int number){
		 int saleStatus = super.sale.getSaleStatus();
		 if(saleStatus > 80){//销售情况良好
			 System.out.println("采购IBM电脑");
			 super.stock.increase(number);
		 }else{//销售情况不好
			 int buyNumber = number/2;//折半
			 System.out.println("采购IBM电脑：" + buyNumber + "台");
		 }
	}
	//销售电脑
	private void sellComputer(int number){
		if(super.stock.getStockNuber()<number){//库存数量不够销售
			super.purchase.buyIBMcomputer(number);
		}
		super.stock.decrease(number);
	}
	//折价销售电脑
	private void offSell(){
		System.out.println("折价销售 电脑");
	}
	//清仓处理
	private void clearStock(){
		//要求清仓销售
		super.sale.offSale();
		//要求 采购人员不要采购
		super.purchase.refuseBuyIBM();
		
	}
}	
