package adapter;

/**
 * @author yu
 *
 * ��������������ģʽ
 * �������ڣ�2016-5-28
 *
 */
public class Test {
	public static void main(String[] args) {
		//ԭ�е�ҵ���߼�
		Target target = new ConcreteTarget();
		target.request();
		//������������������ɫ���ҵ���߼�
		Target target2 = new Adapter();
		target2.request();
	}
}
