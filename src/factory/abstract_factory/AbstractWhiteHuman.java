package factory.abstract_factory;

public abstract class AbstractWhiteHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǰ�ɫ�ġ�");
	}

	@Override
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ��˵�Ķ��ǵ��ֽڵġ�");
	}

	
}
