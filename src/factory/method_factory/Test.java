package factory.method_factory;

/**
 * @author yu
 * ��������ģʽ��������չ�๤��ģʽ����
 * 
 * 				����һ�����ڴ�������Ľӿڣ����������ʵ������һ���ࡢ
 * 			��������ʹһ�����ʵ�����ӳٵ������ࡣ
 */
public class Test {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Creator creator = new ConcreteCreator();
		Product product = creator.createProdcct(ConcreteProduct1.class);
		Product product2 = (Product) Class.forName("factory.method_factory.ConcreteProduct2").newInstance();
		product2.method2();
		/*
		 * ����ҵ����
		 */
	}
	
}
