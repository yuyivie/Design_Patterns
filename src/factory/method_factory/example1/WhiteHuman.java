package factory.method_factory.example1;

/**
 * @author yu
 *��ɫ����
 */
public class WhiteHuman implements Human{

	@Override
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ����ɫ�ǰ�ɫ��");
		
	}

	@Override
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ�㶼�ǵ��ֽڵġ�");
	}
	
}
