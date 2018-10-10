package factory.method_factory.example1;

/**
 * @author yu
 *��������ഴ������
 */
public abstract class AbstractHumanFactory {
	
	
	/*
	 * ע�⣬��������˷��ͣ�ͨ�����巺�Ͷ�createHuman�����������������������
	 * 1��������Class����
	 * 2��������Human��ʵ����
	 */
	public  abstract <T extends Human> T createHuman(Class<T> c);
}
