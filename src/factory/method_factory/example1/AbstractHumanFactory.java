package factory.method_factory.example1;

/**
 * @author yu
 *抽象的人类创建工厂
 */
public abstract class AbstractHumanFactory {
	
	
	/*
	 * 注意，这里采用了泛型，通过定义泛型对createHuman的输入参数产生了两层限制
	 * 1，必须是Class类型
	 * 2，必须是Human的实现类
	 */
	public  abstract <T extends Human> T createHuman(Class<T> c);
}
