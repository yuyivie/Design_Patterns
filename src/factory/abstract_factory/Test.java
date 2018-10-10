package factory.abstract_factory;

/**
 * @author yu
 *���󹤳�ģʽ��
 *			Ϊ����һ����ػ��໥�����Ķ����ṩһ���ӿڣ���������ָ�����ǵľ����ࡣ
 *
 *		
 */
public class Test {
	public static void main(String[] args) {

	//��һ�������ߣ�����������
	HumanFactory maleHumanFactory = new  MaleFactory();
	//�ڶ��������ߣ�Ů��������
	HumanFactory femaleHumanFactory = new FemaleFactory();
	//�����߽�����ϣ���ʼ�������ˣ�
	Human maleYellowHuman = maleHumanFactory.createYellowHuman();
	Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
	System.out.println("\n--------����һ����ɫŮ��-----");
	femaleYellowHuman.getColor();
	femaleYellowHuman.talk();
	femaleYellowHuman.getSex();
	System.out.println("\n----------����һ����ɫ����---------");
	maleYellowHuman.getColor();
	maleYellowHuman.talk();
	maleYellowHuman.getSex();
	
	
	
	}
	
	
	


}
