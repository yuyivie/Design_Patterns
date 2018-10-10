package Mediator.example2;

/**
 * @author yu
 *
 * 类描述：中介者模式   将各个类直接的 关系  迁移到 中介者 类中。 避免了   库存（Stock），销售（Stock），采购（purchase） 类之间彼此关联 耦合性大
 * 创建日期：2016-5-19
 *
 */
public class Client {
	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		//采购人员采购电脑
		System.out.println("------采购人员采购电脑------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMcomputer(100);
		//销售人员销售电脑
		System.out.println("\n----------销售人员销售电脑-------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);
		//库房管理人员管理库存
		System.out.println("\n-------库房管理人员清库处理-----");
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}
}
