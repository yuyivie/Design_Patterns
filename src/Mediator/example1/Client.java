package Mediator.example1;

/**
 * @author yu
 *
 * ����������ͨģʽ�Ĳ�����   ��棨Stock�������ۣ�Stock�����ɹ���purchase�� ��֮��˴˹��� ����Դ�
 * �������ڣ�2016-5-16
 *
 */
public class Client {
	public static void main(String[] args) {
		//�ɹ���Ա�ɹ�����
		System.out.println("-----�ɹ���Ա�ɹ�����-----------");
		Purchase purchase = new Purchase();
		purchase.buyIBMcomputer(100);
		//������Ա���۵���
		System.out.println("\n-------������Ա���۵���------");
		Sale sale  = new Sale();
		sale.sellIBMComputer(1);
		//�ⷿ������Ա������
		System.out.println("\n----�ⷿ������Ա������-------");
		Stock stock = new Stock();
		stock.clearStoce();
	}
}
