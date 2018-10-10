package factory.method_factory;

public abstract class Creator {
	/*
	 * 创建一个产品对象，其输入参数类型可以自行设置
	 * 通过为String    Enum  Class 等  当然也可以为空
	 */
	public abstract <T extends Product> T createProdcct(Class<T> c);
}