package Mediator.example2;

/**
 * @author yu
 *
 * 类描述：抽象中介者
 * 创建日期：2016-5-16
 *
 */
public abstract class AbstractMediator {
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	public AbstractMediator() {
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}
	
	//构造函数
	
	//中介者最重要的方法叫做事件方法，处理多个对象之前的关系
	public abstract void execute(String str,Object...objects);
	
}
