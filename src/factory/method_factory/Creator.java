package factory.method_factory;

public abstract class Creator {
	/*
	 * ����һ����Ʒ����������������Ϳ�����������
	 * ͨ��ΪString    Enum  Class ��  ��ȻҲ����Ϊ��
	 */
	public abstract <T extends Product> T createProdcct(Class<T> c);
}