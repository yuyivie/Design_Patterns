package decorator;

/**
 * @author yu
 *װ��ģʽ
 */
public class Test {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		//��һ������
		component = new ConcreteDecorator1(component);
		
		//�ڶ�������
		component = new ConcreteDecorator2(component);
		
		component.operate();
	}
}

