package Mediator.example1;


/**
 * @author yu
 *
 * ���������ɹ�����
 * �������ڣ�2016-5-16
 *
 */
public class Purchase {
	//�ɹ�IBM  ����
	public void buyIBMcomputer(int number){
		//���ʿ��
		Stock stock = new Stock();
		//��������
		Sale sale = new Sale();
		//���Ե��������
		int saleStatus = sale.getSaleStatus();
		if(saleStatus >80){//�����������
			System.out.println("�ɹ�IBM����" + number + "̨");
			stock.increase(number);
		}else{//�����������
			int buyNumber = number/2;//�۰�ɹ�
			System.out.println("�ɹ�IBM����" + buyNumber + "̨");
		}
	}
	//���ڲɹ�IBM����
	public void refuseBuyIBM(){
		System.out.println("���ڲɹ�IBM����");
	}
}
