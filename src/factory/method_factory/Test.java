package factory.method_factory;

/**
 * @author yu
 * 工厂方法模式（可以扩展多工厂模式）：
 * 
 * 				定义一个用于创建对象的接口，让子类决定实例化哪一个类、
 * 			工厂方法使一个类的实例化延迟到其子类。
 */
public class Test {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Creator creator = new ConcreteCreator();
		Product product = creator.createProdcct(ConcreteProduct1.class);
		Product product2 = (Product) Class.forName("factory.method_factory.ConcreteProduct2").newInstance();
		product2.method2();
		/*
		 * 继续业务处理
		 */
	}
	
}
