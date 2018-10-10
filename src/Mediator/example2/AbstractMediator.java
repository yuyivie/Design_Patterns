package Mediator.example2;

/**
 * @author yu
 *
 * �������������н���
 * �������ڣ�2016-5-16
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
	
	//���캯��
	
	//�н�������Ҫ�ķ��������¼�����������������֮ǰ�Ĺ�ϵ
	public abstract void execute(String str,Object...objects);
	
}
