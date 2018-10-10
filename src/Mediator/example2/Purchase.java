package Mediator.example2;

/**
 * @author yu
 *
 * ���������޸ĺ�Ĳɹ�����
 * �������ڣ�2016-5-16
 *
 */
public class Purchase  extends AbstractColleague{

	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}
	//�ɹ�IBM����
	public  void buyIBMcomputer(int number){
		super.mediator.execute("purchase.buy", number);
		System.out.println("�ɹ�IBM����--" + number + "̨");
	}
	
	//���ٲɹ�IBM����
	public void refuseBuyIBM(){
		System.out.println("���ٲɹ�IBM����");
	}
	
	
}
